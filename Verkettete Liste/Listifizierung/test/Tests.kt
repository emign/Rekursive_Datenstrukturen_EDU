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
    val mirko = Person("Mirko")

    val liste = VerketteteListe()
    @Test fun testContains() {
       liste.add(hans)
       liste.add(peter)
       liste.add(maria)
       liste.add(gunter)
       liste.add(donald)
       liste.add(petra)
        Assert.assertTrue("Hans muss enthalten sein", liste.contains(hans))
    }

    @Test fun testContainsFalse() {
        liste.add(hans)
        liste.add(peter)
        liste.add(maria)
        liste.add(gunter)
        liste.add(donald)
        liste.add(petra)
        Assert.assertTrue("Mirko darf nicht enthalten sein", !liste.contains(mirko))
    }

    @Test fun testContainsAfterRemove() {
        liste.add(hans)
        liste.add(peter)
        liste.add(maria)
        liste.add(gunter)
        liste.add(donald)
        liste.add(petra)
        liste.remove()
        Assert.assertTrue("Hans darf nicht enthalten sein", !liste.contains(hans))
    }

    @Test fun testInsertBeforeMaria() {
        liste.add(hans)
        liste.add(peter)
        liste.add(maria)
        liste.add(gunter)
        liste.add(donald)
        liste.add(petra)
        liste.insert(mirko, maria)
        Assert.assertEquals(listOf(hans,peter,mirko,maria,gunter,donald,petra).toString(), liste.toString())
    }

    @Test fun testInsertBeforeFirst() {
        liste.add(hans)
        liste.add(peter)
        liste.add(maria)
        liste.add(gunter)
        liste.add(donald)
        liste.add(petra)
        liste.insert(mirko, hans)
        Assert.assertEquals(listOf(mirko, hans,peter,maria,gunter,donald,petra).toString(), liste.toString())
    }

    @Test fun testInsertLast() {
        liste.add(hans)
        liste.add(peter)
        liste.add(maria)
        liste.add(gunter)
        liste.add(donald)
        liste.add(petra)
        liste.insert(mirko, petra)
        Assert.assertEquals(listOf(hans,peter,maria,gunter,donald,mirko,petra).toString(), liste.toString())
    }

    @Test fun testRemove() {
        liste.add(hans)
        liste.add(peter)
        liste.add(maria)
        liste.add(gunter)
        liste.add(donald)
        liste.add(petra)
        liste.remove(maria)
        Assert.assertEquals(listOf(hans,peter,gunter,donald,petra).toString(), liste.toString())
    }

    @Test fun testRemoveFirst() {
        liste.add(hans)
        liste.add(peter)
        liste.add(maria)
        liste.add(gunter)
        liste.add(donald)
        liste.add(petra)
        liste.remove(hans)
        Assert.assertEquals(listOf(peter,maria,gunter,donald,petra).toString(), liste.toString())
    }

    @Test fun testRemoveLast() {
        liste.add(hans)
        liste.add(peter)
        liste.add(maria)
        liste.add(gunter)
        liste.add(donald)
        liste.add(petra)
        liste.remove(petra)
        Assert.assertEquals(listOf(hans,peter,maria,gunter,donald).toString(), liste.toString())
    }
}