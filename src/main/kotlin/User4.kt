interface User4 {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')

}