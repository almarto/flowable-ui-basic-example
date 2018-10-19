# fresa - Flowable REst Sample Application

## Introduction

A sample application to showcase usage of the flowable rest api, based on `flowable-spring-boot-starter-rest`

## How to start the application

### Docker compose

fresa uses mysql as database, with a created user `flowable / flowable` on port `3306`. In order to start the database, a `docker-compose.yml` file is provided in the folder `docker/`

Scripts are provided to help starting, stopping and viewing database logs

Start docker compose

```docker-start.sh```

Stop docker compose

```docker-stop.sh```

View docker logs

```docker-logs.sh```

### Spring boot application

After starting docker compose you can start the application with your favourite IDE or directly from
the command line using the command `mvn spring-boot:run`. The application can then be accessed on 
the url http://localhost:8080/fresa


#### Security

A very simple security for all web requests has been configured, using http-basic: `rest-admin / test`

 