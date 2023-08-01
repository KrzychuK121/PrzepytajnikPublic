# ProgramOdpytanie
Napisany w Javie program umożliwiający operację na słownikach, z których można zostać odpytanym i otrzymać ocenę.

## Pierwsza wersja programu



**Główne cechy programu:**

* Dostęp do opcji
  - Odpytanie - Wyświetlone zostanie słowo w języku polskim i program czeka na angielską odpowiedź. Program przechodzi przez słowa po kolei a na koniec wyświetla otrzymaną ocenę na podstawie pliku *domyslny.txt*
  - Edycja -
  - Przeglądanie zawartości - Wyświetla zawartość słownika w dwóch kolumnach. Pod listą słówek *(polskie - angielskie)* znajdują się dwa guziki, którymi można zmienić stronę, którą się przegląda
  - Zmiana pliku - zamyka otwarte okna i wyświetla początkowe okno przedstawiające pole tekstowe do napisania nazwy pliku oraz listę już utworzonych plików, gotowych do wykorzystania
* Sprawdzanie składni podczas edytowania pliku słownika - polega na sprwadzaniu czy standard <code>polskie słowo;angielskie słowo</code> jest zachowany. Jeśli nie to program przechodzi do linii, w której napotkał błąd
* Filtrowanie plików zawartch w folderze <code>Slowniki</code> pod kątem zgodności ze standardem <code>polskie słowo;angielskie słowo</code> i wyświetlanie ich na liście plików do otworzenia. To samo filtrowanie tyczy się pola tekstowego, które nie pozwoli na otwarcie pliku, którego format jest nieprawidłowy
* Responsywne okna aplikacji
* Skalowanie czcionki w 3 różnych wielkościach w zależności od wielkości okna *(do poprawienia)*
* Zamykanie pobocznych okien aplikacji przy zmianie pliku

## Druga wersja programu
