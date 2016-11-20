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
	  assert(RomanNumeral.toRoman(1950)=="MCML")
	  assert(RomanNumeral.toRoman(1951)=="MCMLI")
	  assert(RomanNumeral.toRoman(1952)=="MCMLII")
	  assert(RomanNumeral.toRoman(1953)=="MCMLIII")
	  assert(RomanNumeral.toRoman(1954)=="MCMLIV")
	  assert(RomanNumeral.toRoman(1955)=="MCMLV")
	  assert(RomanNumeral.toRoman(1956)=="MCMLVI")
	  assert(RomanNumeral.toRoman(1957)=="MCMLVII")
	  assert(RomanNumeral.toRoman(1958)=="MCMLVIII")
	  assert(RomanNumeral.toRoman(1959)=="MCMLIX")
	  assert(RomanNumeral.toRoman(1960)=="MCMLX")
	  assert(RomanNumeral.toRoman(1961)=="MCMLXI")
	  assert(RomanNumeral.toRoman(1962)=="MCMLXII")
	  assert(RomanNumeral.toRoman(1963)=="MCMLXIII")
	  assert(RomanNumeral.toRoman(1964)=="MCMLXIV")
	  assert(RomanNumeral.toRoman(1965)=="MCMLXV")
	  assert(RomanNumeral.toRoman(1966)=="MCMLXVI")
	  assert(RomanNumeral.toRoman(1967)=="MCMLXVII")
	  assert(RomanNumeral.toRoman(1968)=="MCMLXVIII")
	  assert(RomanNumeral.toRoman(1969)=="MCMLXIX")
	  assert(RomanNumeral.toRoman(1970)=="MCMLXX")
	  assert(RomanNumeral.toRoman(1971)=="MCMLXXI")
	  assert(RomanNumeral.toRoman(1972)=="MCMLXXII")
	  assert(RomanNumeral.toRoman(1973)=="MCMLXXIII")
	  assert(RomanNumeral.toRoman(1974)=="MCMLXXIV")
	  assert(RomanNumeral.toRoman(1975)=="MCMLXXV")
	  assert(RomanNumeral.toRoman(1976)=="MCMLXXVI")
	  assert(RomanNumeral.toRoman(1977)=="MCMLXXVII")
	  assert(RomanNumeral.toRoman(1978)=="MCMLXXVIII")
	  assert(RomanNumeral.toRoman(1979)=="MCMLXXIX")
	  assert(RomanNumeral.toRoman(1980)=="MCMLXXX")
	  assert(RomanNumeral.toRoman(1981)=="MCMLXXXI")
	  assert(RomanNumeral.toRoman(1982)=="MCMLXXXII")
	  assert(RomanNumeral.toRoman(1983)=="MCMLXXXIII")
	  assert(RomanNumeral.toRoman(1984)=="MCMLXXXIV")
	  assert(RomanNumeral.toRoman(1985)=="MCMLXXXV")
	  assert(RomanNumeral.toRoman(1986)=="MCMLXXXVI")
	  assert(RomanNumeral.toRoman(1987)=="MCMLXXXVII")
	  assert(RomanNumeral.toRoman(1988)=="MCMLXXXVIII")
	  assert(RomanNumeral.toRoman(1989)=="MCMLXXXIX")
	  assert(RomanNumeral.toRoman(1990)=="MCMXC")
	  assert(RomanNumeral.toRoman(1991)=="MCMXCI")
	  assert(RomanNumeral.toRoman(1992)=="MCMXCII")
	  assert(RomanNumeral.toRoman(1993)=="MCMXCIII")
	  assert(RomanNumeral.toRoman(1994)=="MCMXCIV")
	  assert(RomanNumeral.toRoman(1995)=="MCMXCV")
	  assert(RomanNumeral.toRoman(1996)=="MCMXCVI")
	  assert(RomanNumeral.toRoman(1997)=="MCMXCVII")
	  assert(RomanNumeral.toRoman(1998)=="MCMXCVIII")
	  assert(RomanNumeral.toRoman(1999)=="MCMXCIX")
	  assert(RomanNumeral.toRoman(2000)=="MM")
	  assert(RomanNumeral.toRoman(2001)=="MMI")
	  assert(RomanNumeral.toRoman(2002)=="MMII")
	  assert(RomanNumeral.toRoman(2003)=="MMIII")
	  assert(RomanNumeral.toRoman(2004)=="MMIV")
	  assert(RomanNumeral.toRoman(2005)=="MMV")
	  assert(RomanNumeral.toRoman(2006)=="MMVI")
	  assert(RomanNumeral.toRoman(2007)=="MMVII")
	  assert(RomanNumeral.toRoman(2008)=="MMVIII")
	  assert(RomanNumeral.toRoman(2009)=="MMIX")
	  assert(RomanNumeral.toRoman(2010)=="MMX")
	  assert(RomanNumeral.toRoman(2011)=="MMXI")
	  assert(RomanNumeral.toRoman(2012)=="MMXII")
	  assert(RomanNumeral.toRoman(2013)=="MMXIII")
	  assert(RomanNumeral.toRoman(2014)=="MMXIV")
	  assert(RomanNumeral.toRoman(2015)=="MMXV")
  	  assert(RomanNumeral.toRoman(2016)=="MMXVI")
  	  assert(RomanNumeral.toRoman(2017)=="MMXVII")
  	  assert(RomanNumeral.toRoman(2018)=="MMXVIII")
  	  assert(RomanNumeral.toRoman(2019)=="MMXIX")
  	  assert(RomanNumeral.toRoman(2020)=="MMXX")
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
  	  assert(RomanNumeral.splitNumber(1900)==List(1000,900))
  	  assert(RomanNumeral.splitNumber(2000)==List(1000,1000))
      }

      test("String to Integer"){
          assert(RomanNumeral.toInteger("I")==1)
          assert(RomanNumeral.toInteger("II")==2)
          assert(RomanNumeral.toInteger("III")==3)
          assert(RomanNumeral.toInteger("IV")==4)
          assert(RomanNumeral.toInteger("MCML")==1950)
          assert(RomanNumeral.toInteger("MCMLI")==1951)
          assert(RomanNumeral.toInteger("MCMLII")==1952)
          assert(RomanNumeral.toInteger("MCMLIII")==1953)
          assert(RomanNumeral.toInteger("MCMLIV")==1954)
          assert(RomanNumeral.toInteger("MCMLV")==1955)
          assert(RomanNumeral.toInteger("MCMLVI")==1956)
          assert(RomanNumeral.toInteger("MCMLVII")==1957)
          assert(RomanNumeral.toInteger("MCMLVIII")==1958)
          assert(RomanNumeral.toInteger("MCMLIX")==1959)
          assert(RomanNumeral.toInteger("MCMLX")==1960)
          assert(RomanNumeral.toInteger("MCMLXI")==1961)
          assert(RomanNumeral.toInteger("MCMLXII")==1962)
          assert(RomanNumeral.toInteger("MCMLXIII")==1963)
          assert(RomanNumeral.toInteger("MCMLXIV")==1964)
          assert(RomanNumeral.toInteger("MCMLXV")==1965)
          assert(RomanNumeral.toInteger("MCMLXVI")==1966)
          assert(RomanNumeral.toInteger("MCMLXVII")==1967)
          assert(RomanNumeral.toInteger("MCMLXVIII")==1968)
          assert(RomanNumeral.toInteger("MCMLXIX")==1969)
          assert(RomanNumeral.toInteger("MCMLXX")==1970)
          assert(RomanNumeral.toInteger("MCMLXXI")==1971)
          assert(RomanNumeral.toInteger("MCMLXXII")==1972)
          assert(RomanNumeral.toInteger("MCMLXXIII")==1973)
          assert(RomanNumeral.toInteger("MCMLXXIV")==1974)
          assert(RomanNumeral.toInteger("MCMLXXV")==1975)
          assert(RomanNumeral.toInteger("MCMLXXVI")==1976)
          assert(RomanNumeral.toInteger("MCMLXXVII")==1977)
          assert(RomanNumeral.toInteger("MCMLXXVIII")==1978)
          assert(RomanNumeral.toInteger("MCMLXXIX")==1979)
          assert(RomanNumeral.toInteger("MCMLXXX")==1980)
          assert(RomanNumeral.toInteger("MCMLXXXI")==1981)
          assert(RomanNumeral.toInteger("MCMLXXXII")==1982)
          assert(RomanNumeral.toInteger("MCMLXXXIII")==1983)
          assert(RomanNumeral.toInteger("MCMLXXXIV")==1984)
          assert(RomanNumeral.toInteger("MCMLXXXV")==1985)
          assert(RomanNumeral.toInteger("MCMLXXXVI")==1986)
          assert(RomanNumeral.toInteger("MCMLXXXVII")==1987)
          assert(RomanNumeral.toInteger("MCMLXXXVIII")==1988)
          assert(RomanNumeral.toInteger("MCMLXXXIX")==1989)
          assert(RomanNumeral.toInteger("MCMXC")==1990)
          assert(RomanNumeral.toInteger("MCMXCI")==1991)
          assert(RomanNumeral.toInteger("MCMXCII")==1992)
          assert(RomanNumeral.toInteger("MCMXCIII")==1993)
          assert(RomanNumeral.toInteger("MCMXCIV")==1994)
          assert(RomanNumeral.toInteger("MCMXCV")==1995)
          assert(RomanNumeral.toInteger("MCMXCVI")==1996)
          assert(RomanNumeral.toInteger("MCMXCVII")==1997)
          assert(RomanNumeral.toInteger("MCMXCVIII")==1998)
          assert(RomanNumeral.toInteger("MCMXCIX")==1999)
          assert(RomanNumeral.toInteger("MM")==2000)
          assert(RomanNumeral.toInteger("MMI")==2001)
          assert(RomanNumeral.toInteger("MMII")==2002)
          assert(RomanNumeral.toInteger("MMIII")==2003)
          assert(RomanNumeral.toInteger("MMIV")==2004)
          assert(RomanNumeral.toInteger("MMV")==2005)
          assert(RomanNumeral.toInteger("MMVI")==2006)
          assert(RomanNumeral.toInteger("MMVII")==2007)
          assert(RomanNumeral.toInteger("MMVIII")==2008)
          assert(RomanNumeral.toInteger("MMIX")==2009)
          assert(RomanNumeral.toInteger("MMX")==2010)
          assert(RomanNumeral.toInteger("MMXI")==2011)
          assert(RomanNumeral.toInteger("MMXII")==2012)
          assert(RomanNumeral.toInteger("MMXIII")==2013)
          assert(RomanNumeral.toInteger("MMXIV")==2014)
          assert(RomanNumeral.toInteger("MMXV")==2015)
          assert(RomanNumeral.toInteger("MMXVI")==2016)
          assert(RomanNumeral.toInteger("MMXVII")==2017)
          assert(RomanNumeral.toInteger("MMXVIII")==2018)
          assert(RomanNumeral.toInteger("MMXIX")==2019)
          assert(RomanNumeral.toInteger("MMXX")==2020)
      }
}
