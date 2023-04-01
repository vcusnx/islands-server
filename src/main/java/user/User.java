/*
 * Copyright (c) Grigory "vcusnx" Markovich, 2023.
 *
 * The messenger project.
 */

package user;

/**
 * This class provides the information about user
 */
public class User {

    private final long userId;
    private final String userName;
    private final String userPassword;

    /**
     * Constructor for user class
     */
    public User() {
        this.userId = getUserId();
        this.userName = getUserName();
        this.userPassword = getUserPassword();
    }

    /**
     * @return User's ID
     */
    public long getUserId() {
        return userId;
    }

    /**
     * @return User's username
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @return User's password
     */
    public String getUserPassword() {
        return userPassword;
    }
}