Microservice Historical
=====

**Stack del proyecto:**

* Spring Boot
* Mongo DB
* Kafka
* Docker

## Pre-Requisitos

* Tener java configurado.
* Tener docker y docker-compose instalados.
* En Mongo DB, crear una base de datos llamada **`db_borrow`**.

## Ejecución del proyecto en local

* Construir imagen ejecutando **`make build`** en linux y **`docker build -t microservice-historical:1.0.0`** en windows.
* Levantar los servicios externos ejecutando **`make up`** en linux y **`docker-compose up`** en windows.
* Obtener detalle de la transacción por cuenta: **` Tipo GET - http://localhost:8087/v1/transaction/{transactionId}`**.
* Listar todas las cuentas: **`Tipo GET - http://localhost:8087/v1/transaction`**.