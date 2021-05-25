# HumRel

<b>Przedmiot</b> Bazy Danych</br>
<b>Temat:</b> Wykorzystanie bazy grafowej Neo4j do reprezentacji struktury powiazań pomiędzy ludźmi<br>
<b>Twórcy:</b> Radosław Kopeć, Paweł Pławecki<br/>
<b>Data Rozpoczęcia:</b> 22.05.2020

### Contributors

- [Radosław Kopeć](https://github.com/radekkpc)

- [Paweł Pławeck](https://github.com/rzabolbabol)

## Harmonogram projektu

### TECHNOLOGIE

* node.js
* express.js
* neo4j
### DOKUMENTACJA
https://github.com/RadekKpc/HumRel/blob/master/Uruchomienie-Kope%C4%87-Rados%C5%82aw-P%C5%82awecki-Pawe%C5%82.pdf
### INSTRUKCJA URUCHOMIENIA

Przygotowanie bazy:
* W pliku server/app.js znajdują się dane do połaczenia z bazą Neo4j

* Nalezy stworzyc nową bazę danych i uruchomić w niej skrypt server/db_script.txt (metodą kopiuj wklej) jest to baza testowa

* Nastepnie dodac do niej użytkownika o nazwie "project" i haśle "1234",

Uruchomienie serwera aplikacji:

* cd server
* npm install
* node app.js

Przygotowane konto do testów:

login: test@test.com
hasło: 1234