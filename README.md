# Sample app to demonstrate how Spring Cloud Config / Spring Cloud Bus works.

## Dependencies

* JDK >= 11
* Kotlin >= 1.3
* Gradle >= 5.0
* Docker >= 19
* Docker Compose >= 1.13.0

# Usage
## Run

```bash
# Build JAR files for all Spring apps inside this project
# (docker-compose.yml in this repo expects all the built JAR files are already there)
$ cd /path/to/all/the/Spring/app
$ ./gradlew clean build
  # If the test for Config Client fails,
  # please modify src/main/resources/bootstrap.yml so that spring.cloud.fail-fast will be false

# Run containers
$ docker-compose up --build -d

# Check all the containers are up and ready (It will take around 2 min)
$ docker ps
$ docker logs ${CONTAINER_ID}

# Confirm the behavior
$ curl -v http://localhost:8080/filepath
```

## Shut down

```bash
$ docker-compose down
```

# TODOs

* Implement Spring Cloud Bus with RabbitMQ
