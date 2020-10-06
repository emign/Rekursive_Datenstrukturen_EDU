import java.util.*
import java.util.function.Predicate
import java.util.stream.Stream

class VerweisSchlange : Queue<Person> {

    var anfang : Person? = null

    override fun add(element: Person?): Boolean {
        if (anfang == null){
            anfang = element
        }
        anfang?.add(element!!)
        return true
    }

    override fun remove(): Person? {
        val gemerkterAnfang = anfang
        anfang = anfang?.nachfolger
        return gemerkterAnfang
    }

    override val size: Int
        get() {
            if (anfang == null) {
                return 0
            } else {
                return anfang!!.count()+1
            }
        }

    /**
     * ALLES HIER DRUNTER DARF IGNORIERT WERDEN
     */

    override fun remove(element: Person?): Boolean {
        TODO("Not yet implemented")
    }

    override fun contains(element: Person?): Boolean {
        TODO("Not yet implemented")
    }

    override fun offer(e: Person?): Boolean {
        TODO("Not yet implemented")
    }

    override fun poll(): Person {
        TODO("Not yet implemented")
    }

    override fun element(): Person {
        TODO("Not yet implemented")
    }

    override fun peek(): Person {
        TODO("Not yet implemented")
    }

    override fun addAll(elements: Collection<Person>): Boolean {
        TODO("Not yet implemented")
    }

    override fun clear() {
        TODO("Not yet implemented")
    }

    override fun iterator(): MutableIterator<Person> {
        TODO("Not yet implemented")
    }

    override fun removeAll(elements: Collection<Person>): Boolean {
        TODO("Not yet implemented")
    }

    override fun retainAll(elements: Collection<Person>): Boolean {
        TODO("Not yet implemented")
    }

    override fun removeIf(filter: Predicate<in Person>): Boolean {
        return super.removeIf(filter)
    }

    override fun containsAll(elements: Collection<Person>): Boolean {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun spliterator(): Spliterator<Person> {
        return super<Queue>.spliterator()
    }

    override fun stream(): Stream<Person> {
        return super.stream()
    }

    override fun parallelStream(): Stream<Person> {
        return super.parallelStream()
    }

    override fun toString(): String {
        var list = emptyList<Person>().toMutableList()
        var laufVar = anfang
        while (laufVar != null){
            list.add(laufVar)
            laufVar = laufVar.nachfolger
        }
        return list.toString()
    }
}