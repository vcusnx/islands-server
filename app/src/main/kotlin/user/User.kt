/*
 * Copyright (c) Grigory "vcusnx" Markovich, ISLANDS TEAM, 2023.
 *
 *
 */

package user

/**
 * This data class provides the information about user
 */
data class User(
    val userId: Long,
    val userName: String,
    val userHandle: String
)
