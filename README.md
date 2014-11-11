Spring XD demo app
================================================
Groovy application bootstrap using Spring boot (automatic configuration by Spring).
Generated from http://start.spring.io/
(p/s: Spring initializr is so convenient!)


Frameworks & Libraries
======================
* Gradle    	: build

* Spring boot : bootstrap the application

http://projects.spring.io/spring-boot/

https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples

* Spring XD	  : eXtreme Data. distributed framework for data ingestion and real time analytics for big data applications

http://projects.spring.io/spring-xd/

https://github.com/spring-projects/spring-xd-samples


Requirements
============
* Java 1.8
* Gradle
* Spring XD
Follow this guide to install ---> https://github.com/spring-projects/spring-xd/wiki/Getting-Started


Build and Package
=================
Execute the following command:

./gradlew clean build

The artifact should be available in the directory: build/



Run the application
===================
From command line :

java -jar build/lib/springxdgroovy-0.0.1-SNAPSHOT.jar

From IDE: execute the class Application.groovy main method

Accessing the app on browser
============================
http://localhost:8080/home

Username: youruser

password: yourpassword

Other useful URLs (out of the box by Spring boot):
==================================================
http://localhost:8080/health

http://localhost:8080/dump

http://localhost:8080/env

http://localhost:8080/autoconfig

http://localhost:8080/configprops

http://localhost:8080/metrics

http://localhost:8080/mappings

http://localhost:8080/beans

http://localhost:8080/trace


