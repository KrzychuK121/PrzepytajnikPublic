# Przepytajnik

Napisany w Javie program umożliwiający operację na słownikach, z których można zostać odpytanym i otrzymać ocenę.

## Opis planowanej, skończonej aplikacji

Program posiada swój instalator, który inicjalizuje wszystkie ważne zaszyfrowane pliki na komputerze lokalnym użytkownika oraz właściwy program. Aplikacja umożliwia korzystanie z wersji **offline** oraz **online** przez wiele szkół jednocześnie. Wersja **offline** umożliwia korzystanie z plików lokalnych zapisanych na komputerze, pozwalając na skorzystanie z dwóch domyślnych rodzajów kont: **nauczyciela** i **ucznia**. Wersja **online** pozwala na zalogowanie się użytkownika do programu za pomocą personalnego konta. Taki użytkownik ma dostęp do tych opcji programu, do których ma uprawnienia, np. do tworzenia kont, słowników czy też egzaminów, z których uczniowie będą mogli być oceniani za pomocą różnych testów. Poza operacją na kontach, ocenach oraz zestawach egzaminacyjnych, nauczyciele oraz rodzice mogą sprawdzić statystyki uczniów. Uczniowie również mogą sprawdzić swoje statystyki aby wiedzieć z czym mają największe trudności.

**Planowane funkcjonalności w programie:**

* Nauka:
  - testowe, dla nauczycieli tworzących zbiór do egzaminu
  - właściwe, dla uczniów, by mogli otrzymać z nich oceny
  - inne testy sprawdzające wiedze uczniów
* Tworzenie i/lub edycja:
  - zestawów testowych
  - systemów oceniania
  - kont
* Przeglądanie:
  - ocen
  - systemów oceniania
  - zestawów testowych
  - kont
  - statystyk

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

**Główne cechy programu:**

Program posiada te same cechy co poprzednia wersja z ewentualnymi zmianami.

* Dostęp do opcji
  - Odpytanie - bez zmian
  - Edycja - rozszerzona o edytowanie kont oraz systemów oceniania. Edycja systemów oceniania działa na podobnej zasadzie co edycja zestawów testowych. Edycja kont możliwa jest tylko za pomocą przygotowanego formularza
  - Przeglądanie zawartości - rozszerzone o możliwość przeglądania ocen, systemów oceniania oraz kont. Przeglądanie ocen jest różne w zależności od tego kto chce przeglądać oceny: nauczyciel widzi listę ocen swoich uczniów, rodzic listę ocen swoich dzieci a uczeń tylko własne oceny
  - Zmiana pliku - bez zmian
  - Wylogowanie - opcja uruchomienia programu jeszcze raz, zmieniając zalogowane konto

## Trzecia wersja programu

## Czwarta wersja programu



# ChinczykJava
## About

It's a java desktop application implementing classic board game called "Man, don't get angry" for 4 people. This version lets you play with 1 to 4 people (the rest of players would be bots). 
As a player you can choose one of 4 different colours and your nickname for the game. After that you can start your game and play until one of players finish the game with 4 of his counters on the ending fields. 

## How to run game

At first, you have to download every .png and .jar files from *"ChinczykJava\dist"* folder. You should have file called *"Chinczyk.jar"* (application itself) and 6 .png files with prefix *"counter"*. 
Before you run application, make sure you have *JRE 13* on your machine. Then you can run *"Chinczyk.jar"* file. 

## Plans for future
* Creating option that player can save his game whenever he want and then continue the game later.
* Adding better animations to the game using multithreading

