class Person (val name: String, var nachfolger : Person? = null) {

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