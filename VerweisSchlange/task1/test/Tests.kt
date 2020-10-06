import com.sun.jmx.remote.internal.ArrayQueue
import org.junit.Assert
import org.junit.Test
import java.util.*

class Test {

    val hans = Person("Hans")
    val peter = Person("Peter")
    val maria = Person("Maria")
    val gunter = Person("Gunter")
    val donald = Person("Donald")
    val petra = Person("Petra")

    val schlange : Queue<Person> = VerweisSchlange()
    lateinit var persons : List<Person>

    fun init() {
        persons = listOf(hans, peter, maria, gunter, donald, petra)
    }

    @Test fun testAdd() {
        init()
        persons.forEach {
            schlange.add(it)
        }
        schlange.add(hans)
        schlange.add(peter)
        schlange.add(maria)
        schlange.add(gunter)
        schlange.add(donald)
        schlange.add(petra)
        Assert.assertEquals(persons.toString(), schlange.toString())
    }

    @Test fun testAdd1() {
        init()
        schlange.add(hans)
        Assert.assertEquals(persons.subList(0,1).toString(), schlange.toString())
    }

    @Test fun testRemove() {
        init()
        schlange.add(hans)
        schlange.add(peter)
        schlange.add(maria)
        schlange.add(gunter)
        schlange.add(donald)
        schlange.add(petra)
        schlange.remove()
        Assert.assertEquals(persons.subList(1,6).toString(), schlange.toString())
    }

    @Test fun removeAll(){
        init()
        schlange.add(hans)
        schlange.add(peter)
        schlange.add(maria)
        schlange.add(gunter)
        schlange.add(donald)
        schlange.add(petra)
        schlange.remove()
        schlange.remove()
        schlange.remove()
        schlange.remove()
        schlange.remove()
        schlange.remove()
        schlange.remove()
        Assert.assertEquals(persons.subList(0,0).toString(), schlange.toString())
    }

    @Test fun removeIntermediateEmpty(){
        init()
        schlange.add(hans)
        schlange.add(peter)
        schlange.remove()
        schlange.remove()
        schlange.add(maria)
        schlange.add(gunter)
        schlange.add(donald)
        schlange.add(petra)
        schlange.remove()
        schlange.remove()
        schlange.remove()
        Assert.assertEquals(persons.subList(5,6).toString(), schlange.toString())
    }

    @Test fun testSize(){
        init()
        schlange.add(hans)
        schlange.add(peter)
        schlange.add(maria)
        schlange.add(gunter)
        schlange.add(donald)
        schlange.add(petra)
        Assert.assertEquals(persons.size, schlange.size)
    }

    @Test fun testSizeEmpty(){
        Assert.assertEquals(0, schlange.size)
    }

    @Test fun testSize1(){
        schlange.add(hans)
        Assert.assertEquals(1, schlange.size)
    }


}