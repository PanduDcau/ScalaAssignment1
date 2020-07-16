import scala.collection.mutable.ListBuffer

object CaesarCipher123 extends App {


println("..............Caesar Cipher For Data Encryption and Decryption..............")
val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

 //What is the code we want to encrypt
	val inputText = scala.io.StdIn.readLine("Secret Message: ")		
	
val key = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size		

			var list:String =encriptMsg(key,inputText);
			println(" The Encrypt Message: " ,list );
val key1 = (scala.io.StdIn.readLine("Shift By (Put the negative number of the Shift) : ").toInt + alphabet.size) % alphabet.size	
	var encryptText:String = list;
	//var encryptText = scala.io.StdIn.readLine("Encrypt Message: ")
			
			//What is the code we want to decrypt
		     val declist:String =decriptMsg(key1,encryptText);		  
		   println(" The Decrypt Message: ",declist);

  def encriptMsg(shiftn :Int, encMsg : String ):String = {
  
	//Lets Encrypt/Decrypt the code
	var outputString = encMsg.map( (c: Char) => { 

		//We find the c char in our allowed alphabet
		val x = alphabet.indexOf(c.toUpper)

		//If it char c is not in the Alphabet then we leave it else we encrypt it.
		if (x == -1){
			c
		}
		else{
			alphabet((x + shiftn) % alphabet.size)
			} 
	});
       var Encrypt:String= outputString;
	//Print the result
	  return Encrypt;
	
	}
	
	def decriptMsg(shiftno : Int, decMsg : String ): String ={
	
	var decryptText = decMsg.map( (m: Char) => { 

		//We find the y char in our allowed alphabet
		val y = alphabet.indexOf(m.toUpper)

		//If m char is not in the alphabetit is not then we leave it .
		if (y == -1){
			m
		}
		else{
			alphabet((y + shiftno) % alphabet.size)
			} 
	});
	
	   var Decrypt:String=decryptText;
	   return Decrypt;
	}
	

}		