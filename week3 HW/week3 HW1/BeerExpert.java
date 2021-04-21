import java.lang.*; 
 import java.util.*; 
   public class BeerExpert{ 
 public List<String> getBrands(String color){ 
 List<String> list = new ArrayList<String>(); 
 if(color.equals("light")){ 
 list.add("Jail Pale Ale"); 
 list.add("Gout Stout"); 
 } 
 return list; 
 } 
 } 
