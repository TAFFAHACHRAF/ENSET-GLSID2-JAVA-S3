
class Exercice4 {
    void getOccuringChar(String str){
    	str=str.replace(" ","");
    	int countString = str.length();
    	for(int i=0;i<countString;i++) {
    		if(!str.substring(0,i).contains(""+str.charAt(i)))
    			 System.out.println(str.charAt(i)+"--> "+(str.length() - str.replace(Character.toString(str.charAt(i)),"").length()));
    	}
    }
}
