package testroman

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import romannumerals.RomanNumeral
import scala.collection.immutable.List

class TestRoman extends FunSuite with BeforeAndAfter{
      test("Roman numeral tests"){
   	  assert(RomanNumeral.toRoman(1)=="I")
	  assert(RomanNumeral.toRoman(4)=="IV")
	  assert(RomanNumeral.toRoman(5)=="V")
	  assert(RomanNumeral.toRoman(9)=="IX")
	  assert(RomanNumeral.toRoman(10)=="X")
	  assert(RomanNumeral.toRoman(40)=="XL")
	  assert(RomanNumeral.toRoman(50)=="L")
	  assert(RomanNumeral.toRoman(90)=="XC")
	  assert(RomanNumeral.toRoman(100)=="C")
	  assert(RomanNumeral.toRoman(400)=="CD")
  	  assert(RomanNumeral.toRoman(500)=="D")
  	  assert(RomanNumeral.toRoman(900)=="CM")
  	  assert(RomanNumeral.toRoman(1000)=="M")
	  assert(RomanNumeral.toRoman(1960)=="MCMLX")
	  assert(RomanNumeral.toRoman(1968)=="MCMLXVIII")
	  assert(RomanNumeral.toRoman(1970)=="MCMLXX")
	  assert(RomanNumeral.toRoman(1980)=="MCMLXXX")
	  assert(RomanNumeral.toRoman(1990)=="MCMXC")
  	  assert(RomanNumeral.toRoman(2016)=="MMXVI")
      }
      
      test("Split number"){
      	  assert(RomanNumeral.splitNumber(1)==List(1))
	  assert(RomanNumeral.splitNumber(2)==List(1,1))
	  assert(RomanNumeral.splitNumber(3)==List(1,1,1))
  	  assert(RomanNumeral.splitNumber(4)==List(4))
	  assert(RomanNumeral.splitNumber(5)==List(5))
	  assert(RomanNumeral.splitNumber(6)==List(5,1))
	  assert(RomanNumeral.splitNumber(7)==List(5,1,1))
  	  assert(RomanNumeral.splitNumber(8)==List(5,1,1,1))
  	  assert(RomanNumeral.splitNumber(9)==List(9))
  	  assert(RomanNumeral.splitNumber(10)==List(10))
  	  assert(RomanNumeral.splitNumber(20)==List(10,10))
  	  assert(RomanNumeral.splitNumber(40)==List(40))
  	  assert(RomanNumeral.splitNumber(50)==List(50))
  	  assert(RomanNumeral.splitNumber(90)==List(90))
  	  assert(RomanNumeral.splitNumber(100)==List(100))
  	  assert(RomanNumeral.splitNumber(400)==List(400))
  	  assert(RomanNumeral.splitNumber(500)==List(500))
  	  assert(RomanNumeral.splitNumber(900)==List(900))
  	  assert(RomanNumeral.splitNumber(1000)==List(1000))
      }
}