package com.example.solidprinciples

data class User(
    var id: Long,
    var name: String,
    var password: String
) {
    fun signIn() {
        // This method will do signing in operations
    }

    fun signOut() {
        // This method will do signing out operations
    }
}

/*
Now let's assume that we need to make some changes for the authentication process in sign-in and sign-out methods, Our user class will get affected. Which added more than one responsibility to one class.
When such scenarios occur we should separate our classes. This means the User class should only have one responsibility i.e. to hold user information.
To solve the issue we should create a new class to manage the authentication process and move the sign-in and sign-out function in that class.
 */
data class User2(
    var id: Long,
    var name: String,
    var password: String
)

class AuthenticationService() {
    fun signIn() {
        // This method will do signing in operations
    }

    fun signOut() {
        // This method will do signing out operations
    }
}