# Przepytajnik

Napisany w Javie program umożliwiający operację na słownikach, z których można zostać odpytanym i otrzymać ocenę.

## Opis planowanej, skończonej aplikacji

Aplikacja umożliwia korzystanie z wersji **offline** oraz **online**. Wersja **offline** umożliwia korzystanie z plików lokalnych zapisanych na komputerze, pozwalając na skorzystanie z dwóch domyślnych rodzajów kont: **nauczyciela** i **ucznia**. Wersja **online** pozwala na zalogowanie się użytkownika do programu za pomocą personalnego konta. Taki użytkownik ma dostęp do tych opcji programu, do których ma uprawnienia, np. do tworzenia kont, słowników czy też egzaminów, z których uczniowie będą mogli odpowiadać itp. 

**Planowane funkcjonalności w programie:**

* Odpytanie:
  - Testowe, dla nauczycieli tworzących zbiór do egzaminu
  - Właściwe, dla uczniów, by mogli otrzymać z nich oceny
* Tworzenie i/lub edycja:
  - zestawów testowych
  - systemów oceniania
  - kont
* Przeglądanie:
  - ocen
  - zestawów testowych
  - kont

## Pierwsza wersja programu

**Krótki opis programu**

Program na początku pyta użytkownika o wybranie programu. Jeśli plik nie istnieje to zostanie utworzony pusty, nowy plik, gotowy do użytkowania. W przeciwnym wypadku zostaną pobrane dane z instniejącego już pliku. Użytkownik może odpytać się z zawartości pliku *(jesli takowa istnieje)*, modyfikować zawartość pliku, przejrzeć zawartość oraz zmienić plik, na którym pracuje.

**Główne cechy programu:**

* Dostęp do opcji
  - Odpytanie - Wyświetlone zostanie słowo w języku polskim i program czeka na angielską odpowiedź. Program przechodzi przez słowa po kolei a na koniec wyświetla otrzymaną ocenę na podstawie pliku *domyslny.txt*
  - Edycja - Podzielona na dwie sekcje: edytowanie za pomocą przygotowanych formularzy oraz za pomocą edytora tekstowego. W przypadku edytora tekstowego sprawdzana jest zgodność ze standardem <code>polskie słowo;angielskie słowo</code>. W przypadku formularzy istnieje kolejny podział: dodawanie i usuwanie. Usuwanie polega na wpisaniu numerka zestawu, który użytkownik chce usunąć. Zapisanie zmian czy to za pomocą formularzy czy edytora tekstowego można zapisać tymczasowo w programie lub też od razu do pliku.
  - Przeglądanie zawartości - Wyświetla zawartość słownika w dwóch kolumnach. Pod listą słówek *(polskie - angielskie)* znajdują się dwa guziki, którymi można zmienić stronę, którą się przegląda
  - Zmiana pliku - zamyka otwarte okna i wyświetla początkowe okno przedstawiające pole tekstowe do napisania nazwy pliku oraz listę już utworzonych plików, gotowych do wykorzystania
* Sprawdzanie składni podczas edytowania pliku słownika - polega na sprwadzaniu czy standard <code>polskie słowo;angielskie słowo</code> jest zachowany. Jeśli nie to program przechodzi do linii, w której napotkał błąd
* Filtrowanie plików zawartch w folderze <code>Slowniki</code> pod kątem zgodności ze standardem <code>polskie słowo;angielskie słowo</code> i wyświetlanie ich na liście plików do otworzenia. To samo filtrowanie tyczy się pola tekstowego, które nie pozwoli na otwarcie pliku, którego format jest nieprawidłowy
* Responsywne okna aplikacji
* Skalowanie czcionki w 3 różnych wielkościach w zależności od wielkości okna *(do poprawienia)*
* Zamykanie pobocznych okien aplikacji przy zmianie pliku

## Druga wersja programu

**Krótki opis programu:**

Rozszerzenie **pierwszej wersji programu**, która od tej pory jest opcją **offline**, o wersję zawierającą opcję logowania użytkowników. Użytkownicy te mają przypisane do siebie role oraz uprawnienia, dzięki którym mogą tworzyć nowe zestawy testowe, systemy oceniania oraz użytkowników, a ponadto przeglądać już istniejące wyżej wymienione elementy, otrzymane oceny oraz skorzystać z opcji odpytania.
