- Install docker 

- Install docker desktop (opcional pero recomendado)

- Install Postman (o use YARC!)

**Run MySql Container**

docker run --detach --name ec-mysql -p 6604:3306 -e MYSQL_ROOT_PASSWORD=pass -e MYSQL_DATABASE=logisticit -e MYSQL_USER=user1 -e MYSQL_PASSWORD=1234 -d mysql

***Load an image if you are having trouble connecting to the Docker Hub repositories***¹
`docker load -i <path to image tar file>`

If the local image is in the same directory as the repository, the command will be this:
`docker load -i ./mysql.tar`
Or whatever the image file is called.

Then run the MySql container by changing `mysql` to `mysql/mysql-server:latest` (or check the image name in Docker Desktop)

Ex.
docker run --detach --name ec-mysql -p 6604:3306 -e MYSQL_ROOT_PASSWORD=pass -e MYSQL_DATABASE=logisticit -e MYSQL_USER=user1 -e MYSQL_PASSWORD=1234 -d mysql/mysql-server:latest

**Build jar**
mvn package -DskipTests

**Build API Docker image**
docker build -t logistic .

Note: If you are having trouble connecting to the Docker Hub repositories, this command will fail because the openjdk image is required. Load openjdk:17 from a local file before running this build command.

Ex.
`docker load -i ./openjdk17.tar`

Then run the build command.

**Run API Docker container**
docker run  --name ec-app -p 8080:8080  --link ec-mysql:mysql -d logistic

Documentación:

**Por en cuanto pueden encontrar la documentación acá: https://app.swaggerhub.com/apis-docs/DARIOEGEA/logistic-api/1.0.0**

¹***Local image files***
[mysql](https://drive.google.com/file/d/1mW0wQKJXBsod0R24oeJWpLlERpA5pWUl/view)
[openjdk17](https://drive.google.com/file/d/1CXv1IHFfbphHAtvKWRkeen5WrT8Klyiz/view)