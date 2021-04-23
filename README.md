## General info

HBO Max Release Schedule

* Backend: Spring Boot (Web, Security, Data JPA) + PostgreSQL
* Frontend: React JS + Bootstrap + Thymeleaf
* Deploying: Docker on AWS Elastic Beanstalk

## Description

Web app provides schedule for the shows that will release on HBO Max streaming platform.

This service has two-side functionality:

1) **Guests** can visit main page with schedule
2) **Admin** can add, update and delete shows from schedule via Admin Dashboard

## Main Page

Here we see main info about upcoming shows. 

This page does not require a login.

Trailer column will refer user to video on HBO Max youtube channel. 

![main page](https://user-images.githubusercontent.com/73392242/115781062-97299600-a3c2-11eb-9dd6-60b5183f6ffd.PNG)

## Admin Dashboard

Admins have convenient control panel for perfoming CRUD operations. 

![admin page](https://user-images.githubusercontent.com/73392242/115781065-985ac300-a3c2-11eb-92a4-465756ee1f4e.png)

## Database

Database consists of 3 tables:

* Show (main info about movie)
* Rating (MPA film rating system)
* Genre (movie genres via IMDb)

**Show** has `Many-To-One` mapping to **Genre** and **Rating** entities

![db](https://user-images.githubusercontent.com/73392242/115783348-6dbe3980-a3c5-11eb-9e5d-71834ca190f9.png)

## Live access

Project was deployed on AWS Elastic Beanstalk and now available [here](http://hboschedule-env.eba-fwjgbmry.ap-southeast-1.elasticbeanstalk.com/)

If you want receive an access to Admin Dashboard - send me request to onetwogleb@yahoo.com
