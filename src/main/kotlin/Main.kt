import java.io.File

/**
 * Classes, objects and interfaces
 */

/**
 * Open, final and abstract modifiers
 *
 * final - can't be overridden, used by default for class members
 *
 * open - can be overridden, should be specified explicitly
 *
 * abstract - must be overridden, can be used only in abstract classes, can't be instantiated
 *
 * override - overrides a member in a superclass or interface
 * overridden member is open by default, if not marked final
 */

/**
 * Visibility modifiers
 *
 * public (default) - visible everywhere (class member and top-level declaration)
 *
 * internal - visible in a module (class member and top-level declaration)
 *
 * protected - visible in subclasses (class member)
 *
 * private - visible in a class (class member), visible in a file (top-level declaration)
 *
 */

// a module is a set of kotlin files compiled together (an Intellij IDEA module, a Maven or Gradle project

// extension functions of a class don't get access to its private or protected members

/**
 * Inner and nested classes
 *
 * Nested classes don't reference their outer class, whereas Inner class do
 *
 * val nested = Outer.Inner()
 *
 * val inner = Outer().Inner()
 *
 */

/**
 * Sealed classes
 *
 * sealed implies that the class is open (don't need an explicit open modifier)
 *
 * you mark a superclass with the sealed modifier and that restricts the possibility of creating subclasses
 *
 * you can't declare a sealed interface
 *
 */

/**
 * Declaring a class with nontrivial constructors and properties
 *
 * primary constructor - class Pet (val name: String)
 *
 * keyword constructor - the declaration of a primary or secondary constructor
 *
 * keyword init - an initializer block
 *
 */

/**
 * Secondary constructors
 */

/**
 * Properties in Interfaces
 */

/**
 * Accessing a backing field from a getter or setter
 *
 * in the body of the setter, you can use special identifier field
 * to access the value of the backing field
 */

/**
 * Accessor visibility
 *
 * you can mark set accessor private, so it will be accessible only from a class
 *
 */

/**
 * Data class
 * overrides
 * equals(), hashCode() and toString() functions
 */

/**
 * Class delegation
 */

/**
 * Object keyword
 *
 * Object declaration is a way to define a singleton
 *
 * Companion objects can contain factory methods and other methods
 * that are related to this class, but don't require a class instance to be called.
 * Their members can be accessed via class name
 *
 * Object expression is used instead of Java's anonymous inner class
 *
 */

// singleton is a class for which you need only one instance

/**
 * Companion objects
 *
 * you can name companion object or omit the name,
 * but default name will be assigned to it is Companion
 *
 */

// also can be used as regular objects

/**
 * Object expression
 */


fun main(){
    Button().click()

    val x = Button()

    x.showOff()
    x.setFocus(true)
    x.click()

    val anotherTest = mutableListOf(1,2,3)
    println(anotherTest.add(4))

    val alice = User2("Alice")
    println(alice.isSubscribed)

    val bob = User2("Bob", false)
    println(bob.isSubscribed)

    val carol = User2("Carol", isSubscribed = false)
    println(carol.isSubscribed)

    val y = MyUser("Bobby", true)

    println(PrivateUser("test@kotlinlang.org").nickname)

    println(SubscribingUser("test@kotlinlang.org").nickname)

    val user = User5("Alice")
    user.address = "Elsenheimerstrasse 47, 80687 Muenchen"

    println(user.address)

    val testCounter = LengthCounter()
    testCounter.addWord("plain word")
    testCounter.addWord("plastic fantastic")
    println(testCounter.counter)

    val client1 = Client("Alice", 342562)
    val client2 = Client("Alice", 342562)
    println(client1 == client2)

    val processed = mutableSetOf(Client("Alice", 342562))
    println(processed.contains(Client("Alice", 342562)))

    val client3 = Client2("Alice", 342562)
    val client4 = Client2("Alice", 342562)
    println(client3)
    println(client4)
    println(client3 == client4)

    val bobby = Client("Bobby", 973293)
    println(bobby)
    val bobbyClone = bobby.copy()
    println(bobbyClone)
    val bobbyAnotherClone = bobby.copy(postalCode = 382555)
    println(bobbyAnotherClone)

    val cset = CountingSet<Int>()
    cset.addAll(listOf(1,1,2,3,4))
    println("${cset.objectAdded} objects were added, ${cset.size} remain")
    
    Payroll.allEmployees.add(Person("Bobby",50, "manager", 1000))
    Payroll.allEmployees.add(Person("Jane", 30, "cashier", 500))
    Payroll.calculateSalary()

    println(CaseInsensitiveFileComparator.compare(File("/User"), File("/user")))
    val files = listOf(File("/C"), File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))

    val persons2 = listOf(Person("Dilan",50, "manager", 1000), Person("Alisson", 30, "cashier", 500))
    println(persons2.sortedWith(Person.NameComparator))

    A.bar()

    val testUser6 = User6.newSubscribingUser("Bobby@yahoo.com")
    val anotherTestUser6 = User6.newFacebookUser(1235)
    println(testUser6.nickname)
    println(anotherTestUser6.nickname)

    val listener = object : A(){
        override fun equals(other: Any?): Boolean {
            return super.equals(other)
        }

        override fun toString(): String {
            return super.toString()
        }

    }
    listener.printHello()


}
