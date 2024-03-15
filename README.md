# SpringDataJPAThymeleaf

In resources create a file application.properties
replace datasource.url,datasource.username, atasource.password with your information

server.port=8082 
spring.datasource.url=jdbc:mysql://localhost:3306/studentregisterdb
spring.datasource.username= USER
spring.datasource.password= PASSWORD
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto= update
# show queries on console
spring.jpa.show-sql=true
