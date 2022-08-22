# Test Otomasyonu API

* GROCERY STORE için mock servisi oluşturulmuştur.
* GROCERY STORE için REST-Assured kullanılarak otomize edilmiştir.
* 200, 400, 404 gibi farklı http status
  kodları karşılayabilmektedir.
* ![Grocery Model](https://github.com/yazicii/Patika_Enuygun.com_Final_Project/blob/master/ApiProjectFinal/src/test/java/model/GroceryModel.java)
* ![Grocery Tests](https://github.com/yazicii/Patika_Enuygun.com_Final_Project/blob/master/ApiProjectFinal/src/test/java/groceryApiTest/GroceryStore.java)  

---
## Mock Service
  
![mockList](https://user-images.githubusercontent.com/101544408/185826608-1191a00c-4bbb-4a04-98e7-4811cc425b72.png)

---
# POSTMAN 

---
* ## GET/allGrocery
![allGrocery](https://user-images.githubusercontent.com/101544408/185826937-ad403928-ca18-482a-88a8-78905ba16797.png)
* ## GET/apple
![apple](https://user-images.githubusercontent.com/101544408/185827370-efe5ee8e-2321-4d9b-b7cb-ddee08244550.png)
* ## POST/add
![Grocerypost](https://user-images.githubusercontent.com/101544408/185827185-f66bbdf4-95eb-4e11-a916-d94969667f96.png)

## PETSTORE
* Kullanılan APİ Sitesi = https://petstore.swagger.io/ 

* ![Petstore Model](https://github.com/yazicii/Patika_Enuygun.com_Final_Project/blob/master/ApiProjectFinal/src/test/java/model/PetModel.java)

* /pet/findByStatus servisinin available, pending, sold paremetrelerine get/post/delete testleri yazılmıştır.

* ![Available](https://github.com/yazicii/Patika_Enuygun.com_Final_Project/blob/master/ApiProjectFinal/src/test/java/petApiTest/AvailableApiTest.java)

* ![Pending](https://github.com/yazicii/Patika_Enuygun.com_Final_Project/blob/master/ApiProjectFinal/src/test/java/petApiTest/PendingApiTest.java)

* ![Sold](https://github.com/yazicii/Patika_Enuygun.com_Final_Project/blob/master/ApiProjectFinal/src/test/java/petApiTest/SoldApiTest.java)


##  Maven Dependency


-------
'Rest-Assured' should be add as a dependency on pom.xml so it will be installed automatically.
```
 <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.6.1</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <version>5.1.1</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.json</groupId>
            <artifactId>json</artifactId>
            <version>20220320</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>com.github.javafaker</groupId>
            <artifactId>javafaker</artifactId>
            <version>1.0.2</version>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>RELEASE</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.qameta.allure</groupId>
            <artifactId>allure-testng</artifactId>
            <version>2.18.1</version>
        </dependency>
    </dependencies>
```
