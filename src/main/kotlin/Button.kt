class Button:Clickable,Focusable {
    override fun click() = println("I was clicked")
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

    // or you can invoke one inherited implementation
    // override fun showOff() = super<Clickable>.showOff()

}