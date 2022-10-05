class PrivateUser(override val nickname: String): User3 {
}

class SubscribingUser (val email: String): User3{
    override val nickname: String
        get() = email.substringBefore('@')
}

/*class FacebookUser (val accountId: Int): User3{
    override val nickname: String = getFacebookName(accountId)
}*/