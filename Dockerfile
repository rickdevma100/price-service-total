FROM eclipse-temurin:17
LABEL authors="rickdevmajumder"
EXPOSE 8081
VOLUME /tmp
COPY target/priceservicetotal-0.0.1-SNAPSHOT.jar priceservicetotal-1.0.0.jar
ENTRYPOINT ["java","-jar","/priceservicetotal-1.0.0.jar"]