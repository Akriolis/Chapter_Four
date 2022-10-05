interface JSONFactory<T>{
    fun fromJSON (jsonText: String): T
}

class Person2 (val name: String){
    companion object: JSONFactory<Person2>{
        override fun fromJSON(jsonText: String): Person2 {
            TODO("Not yet implemented")
        }

    }
}

/*fun <T>loadFromJSON(factory: JSONFactory<T>): T{
    return
}*/