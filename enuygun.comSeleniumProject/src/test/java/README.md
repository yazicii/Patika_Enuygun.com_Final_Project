# Enuygun Selenium Final Project

---
##Enuygun.com Test Senaryosu
1. Enuygun Flight ana sayfasına gidilir
url : https://www.enuygun.com/ucak-bileti/
2. Nereden input alanına Testte parametrik olarak alınan yurtiçi bir
   şehir ismi girilir
3. Çıkan Sonuçlardan ilkine tıklanır
4. Nereye input alanına Testte parametrik olarak alınan yurtdışı bir
   şehir ismi girilir 
5. Çıkan sonuçlardan ilki seçilir 
6. Gidiş Tarihi input alanına tıklanır
   Testten parametre olarak bugünden itibaren kaç gün sonra
   gidilmek istendiği alınacak. Kaç gün sonra ise ona göre tarih
   seçilecek
7. Testten parametre olarak bugünden itibaren kaç gün sonra
   gidilmek istendiği alınacak. Kaç gün sonra ise ona göre tarih
   seçilecek
8. Dönüş Tarihi input alanına tıklanır
9. Tessten parametre olarak gidişten kaç gün sonra dönülmek
   istendindiği alınacak. Kaç gün sonra ise ona göre tarih seçilecek
10. Ucuz Bilet bul butonuna tıklanır
11. Verilen parameterlere uygun gidiş ve dönüş uçuşları bulunur.
    Bu uçuşlar aynı paket içinde olmak zorunda
12. Gidiş uçuşu seçilir
13. Dönüş uçuşu seçilir
14. Seç butonuna tıklanır
---
##Parametreler [Features]

---
##Test Sınıfı [Tests]

---
##Maven Dependency
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
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.1.0</version>
            <scope>compile</scope>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-chrome-driver</artifactId>
            <version>4.3.0</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-support</artifactId>
            <version>4.2.1</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.24</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>
```

