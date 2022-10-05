class User6 private constructor(val nickname: String){
    companion object {
        fun newSubscribingUser(email: String) =
            User6 (email.substringBefore('@'))

        fun newFacebookUser (accountId: Int) =
            User6 (getFacebookName(accountId))
    }
}

fun getFacebookName(id: Int): String{
    return "Bobby12345"
}