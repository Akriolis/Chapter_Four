open class RichButton: Clickable {
    fun disable(){

    }

    open fun animate(){

    }

    //it's override the open function click() and stays open too,
    // but you can change this behavior by making a function final
    final override fun click() {

    }

}