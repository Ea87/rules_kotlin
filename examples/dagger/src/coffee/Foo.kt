package coffee

import com.google.auto.factory.AutoFactory
import com.google.auto.factory.Provided

@AutoFactory
internal class Foo constructor(@Provided private val heater: Heater, private val name: String) {

  fun print() {
    println(heater)
    println(name)
  }
}
