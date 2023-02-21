- Install docker 

- Install docker desktop (opcional pero recomendado)

- Install Postman (o use YARC!)

**Run MySql Container**

docker run --detach --name ec-mysql -p 6604:3306 -e MYSQL_ROOT_PASSWORD=pass -e MYSQL_DATABASE=logisticit -e MYSQL_USER=user1 -e MYSQL_PASSWORD=1234 -d mysql

**Build jar**
mvn package -DskipTests

**Build API Docker image**
docker build -t logistic .

**Run API Docker container**
docker run  --name ec-app -p 8080:8080  --link ec-mysql:mysql -d logistic

Documentación:

**Por en cuanto pueden encontrar la documentación acá: https://app.swaggerhub.com/apis-docs/DARIOEGEA/logistic-api/1.0.0**
