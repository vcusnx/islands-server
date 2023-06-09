# Messenger

[🇺🇸 README](https://github.com/vcusnx/messenger/blob/master/README.md)

## **Используемые технологии:**
> - `Kotlin`
> - `PostgreSQL 15`

---

### **1. Серверная сторона**

> **1.1 Функциональность сервера:**
>
> - Должен запускаться;
> - Должен выключиться;
> - Должен перезагружаться.
>
> **1.2 Особенности сервера:**
>
> - Обработка входной информации;
> - Работа с базой данных;
> - Логирование действий (запуск, получение сообщений, перезагрузка, выключение, регистрация пользователя, вход пользователя);
> - Обработка регистрации/входа пользователя.

---

### **2. Клиентская часть**

> **2.1 Функции клиента:**.
>
> - `Отправка` сообщений;
> - `Получение` сообщений;
> - `Редактирование` сообщений;
> - `Удаление` сообщений;
> - `Регистрация`/ `вход`;

---

### **3. Логика работы на стороне сервера**

> - Сервер запускается на `localhost`, с портом `4850`.
> - Сервер подключается к `базе данных` для работы с ней.
> - Сервер обрабатывает `регистрацию/вход пользователя`. После регистрации сервер `выдает уникальный ID` для пользователя.

---

### **4. Логика на стороне клиента**

> - Сначала пользователю предлагается `зарегистрироваться/зайти`.
> - После `регистрации/входа` пользователь `может начать переписку` с любым человеком.
> - Для `начала` переписки пользователю `нужно ввести @username другого пользователя`.
> - Чтобы `отправить` сообщение, пользователь `должен ввести текст в специальное поле`, затем нажать на кнопку `отправить`.
> - Для `редактирования` сообщения пользователь `должен выделить сообщение`, затем нажать `"Редактировать"` и ввести новый текст.
> - Чтобы `удалить` сообщение, пользователь `должен выбрать сообщение`, затем нажать `"Удалить"`.
