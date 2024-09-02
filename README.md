Материалы для выполнения курсовой работы ученика профессии java-разработчик.

Back-end часть интернет-магазина
Реализация back-end части интернет-сервиса для размещения объявлений о товарах.

Основные возможности

Авторизация и аутентификация пользователей.
Распределение ролей между пользователями: пользователь и администратор.
CRUD-операции для объявлений и комментариев: администратор может удалять или редактировать все объявления и комментарии,
а пользователи — только свои.
Возможность для пользователей оставлять комментарии под каждым объявлением.
Показ и сохранение картинок объявлений, а также аватарок пользователей.

Технологии используемые в проекте

Java 11
Maven

Spring Boot

Spring Web

Spring Data JPA

Spring Security

Swagger

PostgreSQL

Liquibase

Структура проекта

/src/main/
java/ru/skypro/homework/

config/ # Конфигурация Spring security и Swagger

controller/ # Контроллеры

dto/ # Data transfer objects

entity/ # Сущности

exception/ # Исключеия обрабатываемые в приложении

filter/ # фильтор применяемый для определения роли пользователя

mapper/ # Мапперы

repository/ # Репозитории

service/ # Интерфейсы сервисов

impl/ # Их реализация

resources/ # Настройки приложения

liquibase # Инициализация БД средствами Liquibase

Установка и подключение
Установка

Скопируйте репозиторий с GitHub.

Установите Docker.

Загрузите зависимости.

Запуск

Запуск проекта в IntelliJ IDEA.

Запуск Docker через командную строку.

Ввести в командную строку docker ps,а потом
docker run --rm -p 3000:3000 ghcr.io/bizinmitya/front-react-avito:v1.17.

После этого зайти в браузер и ввести адрес localhost:3000.

Проект запущен

Над проектом работал
Карипов Рамиль