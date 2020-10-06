# Listifizierung
Erweitern Sie die von Ihnen erstellte VerweisSchlange so, dass sie die Listenfunktionalität **einfügen**, **suchen** und **entfernen**
enthält. Hierzu müssen Sie die Funktionen `insert(element: Person, before: Person)`, `contains(element: Person)` und `remove(element: Person)` implementieren

Hinweis: Für diese Funktionen benötigen sie Vergleiche anhand von Schlüsselproperties. Bei Person soll der Name als Schlüssel dienen. 
Das bedeutet, dass eine Person identisch mit einer anderen ist, falls sie den gleichen Namen besitzt. 

Hinweis2: Das Interface `Queue` in Kotlin erwartet einen Rückgabe vom Typ `Boolean`. Dies können Sie für Ihre Aufgaben ignorieren und einfach einen 
statischen Wert zurück geben

Hinweis3: Ein rekursives Vorgehen ist vorzuziehen. Hierzu dürfen auch Funktionen in der Klasse `Person` hinzugefügt werden