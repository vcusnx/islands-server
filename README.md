# Islands Messenger

### [Russian README](https://github.com/vcusnx/messenger/blob/master/README-ru.md)

## **Tech stack**
>
> - `Java 20`
> - `Kotlin`
> - `PostgreSQL 15`

---

### **1. Server Side**

> **1.1 Server Functionality:**
>
> - Must start;
> - Must shutdown;
> - Must reboot.
>
> **1.2 Server Features:**
>
> - Processing input information;
> - Working with Database;
> - Logging action (starting, receiving messages restarting, shutting down, user’s registration, user’s logging in);
> - Process user’s registration/logging in.

---

### **2. Client Side**

> **2.1 Client Features:**
>
> - `Sending` messages;
> - `Receiving` messages;
> - `Editing` messages;
> - `Deleting` messages;
> - `Registration`/`log in`;

---

### **3. Server-side Logic**

> - Server starts at `localhost`, with port `4850`.
> - Server connects to `database` to work with it.
> - Server processes user’s `registration/logging in`. After registration server `gives an unique ID` for user.

---

### **4. Client-side logic**

> - At the first, user is `prompted` to `registration/log in`.
> - After the `registration/logging` in user `can start conversation` with any person.
> - To `start` the conversation user `must enter the another @username`.
> - To `send` a message user `must type a text into specified field`, then click on the `sending button`.
> - To `edit` message user `must select the message`, then click `“Edit”` and type new text.
> - To `delete` message user `must select the message`, then click `“Delete”`.
