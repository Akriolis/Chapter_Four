class Person (val name: String, var age: Int, var position: String, var salary: Int) {
    override fun toString(): String = "Person name $name"

    object NameComparator: Comparator<Person>{
        override fun compare(o1: Person, o2: Person): Int =
            o1.name.compareTo(o2.name)

    }
}