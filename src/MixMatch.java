public class MixMatch { //one public class same name as file
    public static void main(String[] args) { //like our int main() in c++
        //date_type identifier = literal_value;//declaring variable named identifier, assigning it literal_value
        //System.out.print("must have a string" + 5 + true + 7.2); //Java allows multiples types outputted but has to contain a String somewhere in the output
    
        //Assignment Declare and Initialize 8 variables of type
        //String, char, short, int, long, float, double, boolean
    
    String vivi = "viviana";
    System.out.println("this data type allows for the storage of text or numbers back to back, make sure to use double quotes " + vivi);
    
    char a = 'a';
    System.out.println("a char is short for character, can store a single character/letter or ASCII values, remember to use single quotes " + a);
    
    short shortVariable = -32768;
    System.out.println("short is for whole numbers ranging from -32,768 to 32,767 " + shortVariable);
    
    int myInt = 9;
    System.out.println("an int stores whole numbers ranging from -2147,483,648 to 2,147,483,647 " + myInt);
    
    long myLong = 1234567890L; //have to put L at the end
    System.out.println("a long stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 " + myLong);
    
    float myFloat = 2.79f; //have to put f at the end
    System.out.println("a float stores fractional numbers, stores 6 to 7 decimal digits " + myFloat);
    
    double myDouble = 2.000;
    System.out.println("a double is good for if you want to store 15 to 16 decimal digits " + myDouble);
   
    boolean isVivi = true;
    System.out.println("a boolean is good for when you want a variable to hold true or false values " + isVivi);
    
    //Outputting multiple variables with a single print method
    System.out.println("must have a string when outputting multiple datatype variables " + myFloat + myLong + myInt );
}
}