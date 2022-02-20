start:
	mvn -e package
	java -cp target/my-java-app-1.0-SNAPSHOT.jar com.mycompany.app.App

.PHONY: start
