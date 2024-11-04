#Basis-Image mit Java 17
FROM openjdk:17-jdk-slim

#Arbeitsverzeichnis im Container
#alle nachfolgenden Befehle in der Dockerfile (z. B. COPY, RUN, CMD) werden relativ zu diesem Verzeichnis ausgeführt.
WORKDIR /app

#JAR-Datei ins Arbeitsverzeichnis Kopieren
COPY target/spring_boot_17-0.0.1-SNAPSHOT.jar my-app.jar

#Datenbankverbindung
ENV DB_HOST=host.docker.internal
ENV DB_PORT=5432
ENV DB_USER=wael
ENV DB_PASSWORD=wael
ENV DB_NAME=student

#Zum Ausführen der JAR-Datei
ENTRYPOINT ["java", "-jar", "my-app.jar"]

#Den Standardport Exponieren
EXPOSE 8081