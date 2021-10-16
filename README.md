# Conference App

Conference Scheduling App, built using Java, Spring Boot and Docker

### Connecting to Database

Create Docker container with Postgres Database
```
docker create --name postgres-demo -e POSTGRES_PASSWORD=Welcome -p 5432:5432 postgres:11.5-alpine
```

Start container
```
docker start postgres-demo
```

Connect to PSQL prompt from docker
```
docker exec -it postgres-demo psql -U postgres
```

Create Database and quit PSQL prompt
```
CREATE DATABASE conference_app;
\q
```

Setup the tables
```
docker cp create_tables.sql postgres-demo:/create_tables.sql
docker exec -it postgres-demo psql -d conference_app -f create_tables.sql -U postgres
```

Insert the data
```
docker cp insert_data.sql postgres-demo:/insert_data.sql
docker exec -it postgres-demo psql -d conference_app -f insert_data.sql -U postgres
```


