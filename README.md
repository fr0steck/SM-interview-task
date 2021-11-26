# SM-interview-task
# Coded by Mateusz Mrózek
Srodowisko uruchomieniowe na ktorym kod byl pisany to IntelliJ IDEA z pomocą narzędzia automatyzującego budowę Maven. Wersja Javy 11.
Kod zrodlowy jest podzielony na trzy paczki, model,service i paczkę testową.
W pierwszej z nich znajduje się klasa "Pair" która jest abstrakcją outputu który mieliśmy zwracać w naszej funkcjonalności wewnątrz streama.
W paczce service znajdują się : Interfejs "DuplicatesRemoval" z metodą "Stream<Pair> removeTimeDuplicate(InputStream inputStream)" którą jest zadaną funkcjonalnośćią.
W paczce tej znajduje się również klasa "TimeDuplicatesRemoval" z implementacją tej metody.
Ostatnia z paczek to paczka testowa "service" w której znajduje się klasa "TimeDuplicatesRemovalTest" testująca zadaną funkcjonalność w 5 przypadkach testowych dla :
  - inputu podanego w tresci
  - inputu z pustym plikiem (tutaj git nie chcial spushowac pustego pliku wiec brakuje pliku "packet_data_test2.txt" który jest pusty) 
  - inputu z samymi 1 
  - inputu z samymi 0
  - inputu z wieksza iloscia danych
  Uzyta biblioteka testująca to JUnit.
  
  W razie jakichkolwiek pytań lub potrzeby zmiany kodu bardzo proszę o wiadomość :))
  
