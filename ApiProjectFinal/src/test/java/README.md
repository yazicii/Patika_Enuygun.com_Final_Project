# Test Otomasyonu API

* GROCERY STORE için mock servisi oluşturulmuştur.
* GROCERY STORE için REST-Assured kullanılarak otomize edilmiştir.
* 200, 400, 404 gibi farklı http status
  kodları karşılayabilmektedir.

---
###Mock Service
  ![img.png](../../../../src/test/java/img.png)

---
#POSTMAN 

---
* ##GET/allGrocery
![img_1.png](../../../../src/test/java/img_1.png)![img_4.png](../../../../src/test/java/img_4.png)
* ##GET/apple
![img_2.png](../../../../src/test/java/img_2.png)![img_3.png](../../../../src/test/java/img_3.png)
* ##POST/add
![img_5.png](../../../../src/test/java/img_5.png)![img_6.png](../../../../src/test/java/img_6.png)

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