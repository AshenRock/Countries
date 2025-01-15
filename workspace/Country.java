//Ian Volchok
//1/14/2025
//this file is like a country quiz thingy

public class Country
{
  // add private instance variables for the name, capital, language, and image file.
  private String countryName;
  private String capital;  private String language;
  private String image;
  // add constructors
    public Country(){


    }
    public Country(String countrName, String cap, String lang, String jpg){
      countryName=countrName;
      capital=cap;
      language=lang;
      image=jpg;

    }
  // Write accessor/get methods for each instance variable that returns it.
    public String getCapital() {
        return capital;
    }
    public String getCountryName() {
        return countryName;
    }
    public String getImage() {
        return image;
    }
    public String getLanguage() {
        return language;
    }

  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
  //precondition: a Country object has been declared 
  //postcondition: will return a string with information about the current country as a string
   public String returnString(){
    return((countryName+"'s capital is " + capital + " and its primary language is "+ language).toString());

   }


  
}