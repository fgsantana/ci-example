import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class Tests {

    @Test
    fun test(){
        val value = testValue()
        Assertions.assertEquals(123 ,value)
    }
}