package romannumerals

import scala.collection.immutable.Map
import scala.collection.immutable.List
import scala.collection.mutable.ListBuffer


object RomanNumeral{
val romanDigits=collection.immutable.Map(1-> "I",4->"IV",5->"V",9->"IX",10->"X",40->"XL",50->"L",90->"XC",100->"C",400->"CD",500->"D",900->"CM",1000->"M")
val romanDigitValues=collection.immutable.List(1000,900,500,400,100,90,50,40,10,9,5,4,1)

	def toRomanNumeral(n:Integer)={
           romanDigits(n)
	}

	def toRoman(n:Integer)={
	   var li:List[Integer]=splitNumber(n)
	   var result:String=li.map(x=>toRomanNumeral(x)).mkString("")
	   result
	}

	def splitNumber(n:Integer)={
	   var result:ListBuffer[Integer]=ListBuffer()
	   var m:Integer=n
	   var d:Integer=0
	   for(d <- romanDigitValues){
	   	     while(d<=m){
			m-=d
			result.append(d)
	     }
	   }
	   result.toList
	}
}