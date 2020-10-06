class Person (val name: String, var nachfolger : Person? = null) {

    fun remove(element: Person) : Person? {
        if (element == this){
            return nachfolger
        } else {
            nachfolger = nachfolger?.remove(element)
            return this
        }
    }

    fun insert(element: Person, before: Person) : Person? {
        if (this == before){
            element.nachfolger = this
            return element
        }
        else {
            nachfolger = nachfolger?.insert(element, before)
            return this
        }
    }

    fun contains(element : Person) : Boolean{
        if (this == element)
            return true
        if (nachfolger != null){
            return nachfolger!!.contains(element)
        }
        return false
    }

    fun add(person : Person){
        if (nachfolger == null) {
            nachfolger = person
            person.nachfolger = null
            return
        }
        else {
            nachfolger?.add(person)
        }

    }

    fun count() : Int {
        return if (nachfolger == null){
            0
        } else {
            nachfolger!!.count()+1
        }
    }

    override fun toString(): String {
        return "$name"
    }

    override fun equals(other: Any?): Boolean {
        return this.name == (other as Person).name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }

}