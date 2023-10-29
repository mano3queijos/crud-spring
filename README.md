# crud-spring




> projeto spring criado com as dependencias: 

### spring web

```ruby
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
```
Essa dependência é usada para criar aplicativos da web com Spring Boot. Ela inclui componentes para desenvolvimento web, como o Spring MVC (Model-View-Controller) para construir controladores, manipuladores de solicitações e views.


### PostgreSql and Mysql Drivers


```ruby
  <dependency>
      <groupId>com.mysql</groupId>
      <artifactId>mysql-connector-j</artifactId>
      <scope>runtime</scope>
 </dependency>
 <dependency>
      <groupId>org.postgresql</groupId>
      <artifactId>postgresql</artifactId>
      <scope>runtime</scope>
 </dependency>
```
com.mysql:mysql-connector-j:

Esta dependência é usada para se conectar a um banco de dados MySQL. Ela fornece o driver JDBC (Java Database Connectivity) necessário para se comunicar com um banco de dados MySQL.

org.postgresql:postgresql:

Essa dependência é usada para se conectar a um banco de dados PostgreSQL. Ela fornece o driver JDBC para se comunicar com um banco de dados PostgreSQL.


### Spring Data Jpa

```ruby
   <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    
```
Esta dependência é usada em projetos Spring Boot que desejam usar o JPA (Java Persistence API) para acesso a bancos de dados. Ela inclui bibliotecas necessárias para trabalhar com JPA, como Hibernate, e configurações padrão.
O Hibernate é um framework de mapeamento objeto-relacional (ORM) em Java. Ele simplifica a interação entre um aplicativo Java e um banco de dados relacional, permitindo que os desenvolvedores trabalhem com objetos Java em vez de escrever SQL diretamente. O objetivo principal do Hibernate é mapear objetos Java para tabelas de banco de dados e vice-versa, facilitando o desenvolvimento de aplicativos que usam bancos de dados relacionais.


### Lombok 

```ruby
    <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <optional>true</optional>
    </dependency>
```

O projeto Lombok é uma biblioteca que ajuda a reduzir a verbosidade do código Java, como mencionado anteriormente. No entanto, essa dependência é marcada como opcional (<optional>true</optional>), o que significa que seu uso é opcional e não é necessário para a funcionalidade principal do projeto. Ela é frequentemente usada para simplificar a criação de classes de entidades e reduzir a quantidade de código repetitivo.

### spring-boot-starter-test

```ruby
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-test</artifactId>
      <scope>test</scope>
    </dependency>
```

## Pom


```ruby
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.1.5</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.emanuel</groupId>
	<artifactId>spring-cloud-psql</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>spring-cloud-psql</name>
	<description>project for Spring Boot</description>
	<properties>
		<java.version>21</java.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<excludes>
						<exclude>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
						</exclude>
					</excludes>
				</configuration>
			</plugin>
		</plugins>
	</build>

</project>
```

>project O elemento raiz do arquivo POM, que contém todas as configurações do projeto.
>modelVersion Define a versão do modelo do POM. A versão "4.0.0" é a versão atual do modelo.

>parent Define o projeto pai (parent project), que é uma maneira de herdar configurações e dependências de um projeto pai. Neste caso, o projeto pai é spring-boot-starter-parent, que é usado frequentemente em projetos Spring Boot.

>groupId Define o identificador do grupo do projeto. Geralmente, é uma convenção de nomeação que ajuda a identificar o projeto e a organização responsável por ele.

>artifactId Define o identificador de artefato do projeto. Isso é geralmente o nome do projeto.

>version Define a versão do projeto.

>name O nome do projeto.

>description Uma breve descrição do projeto.

>properties Aqui, você pode definir propriedades que podem ser referenciadas em outros lugares do POM. Neste caso, a versão do Java usada é definida como "21".

>dependencies Define as dependências do projeto. As dependências são bibliotecas que o projeto usa. Neste caso, o projeto depende de várias bibliotecas Spring Boot, como spring-boot-starter-data-jpa, spring-boot-starter-web, e outras, além de bibliotecas relacionadas a banco de dados como o MySQL e o PostgreSQL.

>build Define a configuração de compilação do projeto.

>plugins Define plugins do Maven, que são usados para realizar tarefas específicas durante o ciclo de vida de construção do projeto.

>plugin Especifica um plugin, neste caso, o spring-boot-maven-plugin. Esse plugin é específico para projetos Spring Boot e é usado para criar artefatos executáveis do Spring Boot.

>configuration Contém as configurações específicas para o plugin. Aqui, o plugin é configurado para excluir a dependência do Lombok durante a construção do artefato, o que é útil para evitar problemas de dependência ao criar o JAR executável.
