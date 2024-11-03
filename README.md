# Spring_boot
Die Erstellung eine einfache Spring-boot App

In Java sind Properties eine Klasse, die Key-Value-Paare speichert und häufig für Konfigurationsdaten verwendet wird.

In einer Maven-XML-Datei (pom.xml) sind <properties> benutzerdefinierte Schlüssel-Wert-Paare, die für die zentrale Verwaltung von Versionsnummern, Plugin-Einstellungen und anderen Konfigurationswerten genutzt werden.

Maven-XML-Datei (pom.xml) gibt der <dependency>-Abschnitt eine externe Bibliothek an, die das Projekt benötigt.

Gradle ist ein leistungsstarkes Build-Automatisierungstool.

Eng zusammenarbeiten: @RequestMapping legt den allgemeinen Pfad für die Controller-Klasse fest, während @GetMapping einen spezifischen Endpunkt innerhalb dieses Pfades definiert. Wenn du eine GET-Anfrage an api/v1/student sendest, wird diese Anfrage an die Methode getStudents() weitergeleitet, die die Liste der Studenten zurückgibt.

Beispiel: Wenn du den Server gestartet hast und eine GET-Anfrage an http://localhost:8080/api/v1/student sendest, wird die getStudents()-Methode aufgerufen und gibt die Liste der Studenten zurück.

Data Access-Layer Repository.

Dependency Injection (DI) ist ein Designmuster, bei dem Objekte (Abhängigkeiten) einer Klasse von außen bereitgestellt werden, anstatt dass die Klasse selbst sie erstellt, um die Kopplung zu verringern und die Testbarkeit sowie Wartbarkeit des Codes zu verbessern.

• Lose Kopplung: Eine Architektur, bei der Klassen minimal voneinander abhängig sind, was Flexibilität und Wartbarkeit verbessert.
• @Autowired: Eine Annotation in Spring, die eine Abhängigkeit automatisch in eine Klasse injiziert.
• @Service: Eine Annotation, die eine Klasse als Service-Komponente für Business-Logik kennzeichnet, damit Spring sie als Bean verwalten kann.
• Bean: Ein von Spring verwaltetes Objekt, das Abhängigkeiten bereitstellt und in der Anwendung wiederverwendet wird.

@Transient ist eine Annotation in JPA, die angibt, dass ein bestimmtes Feld einer Entität nicht in die Datenbank persistiert werden soll, d.h., es wird nicht gespeichert oder abgerufen.

Die Annotation @Transactional in Spring markiert eine Methode oder Klasse, um sicherzustellen, dass alle darin enthaltenen Datenbankoperationen als eine einzige Transaktion behandelt werden, die entweder vollständig abgeschlossen oder im Fehlerfall vollständig zurückgesetzt wird.

Die Annotation @Transactional in Spring markiert eine Methode oder Klasse, um sicherzustellen, dass alle darin enthaltenen Datenbankoperationen als eine einzige Transaktion behandelt werden, die entweder vollständig abgeschlossen oder im Fehlerfall vollständig zurückgesetzt wird.

Optional<Student> ist ein Container-Objekt in Java, das verwendet wird, um einen Wert, der möglicherweise null sein kann, sicher zu handhaben; es ermöglicht, die Anwesenheit oder Abwesenheit eines Wertes zu überprüfen, ohne eine NullPointerException auszulösen.