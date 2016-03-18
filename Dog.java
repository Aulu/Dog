public class Dog{
  
  String breed;
  int age;
  String name;
  
  public Dog(String breed, int age, String name){
    this.breed = breed;
    this.age = age;
    this.name = name;
  }
  
  //non-static
  public void speak(){
    System.out.println("WOOOOOF!!!");
  }
  
  //static
  public static int dogYears(Dog a){
    return a.age*7;
  }
  
  //non-static
  public int myAge(){
    return this.age*7;
  }
  
  //static
  public static void sitDog(Dog[] dogs){
    for(int i=0; i<dogs.length; i++){
      System.out.println(dogs[i].name +"! SIT WITH YOUR ASS!!!");
    }}
  
  public static void main(String[] args){
    Dog tdog = new Dog("Yorkie", 15, "bea");
    System.out.println("How old are you in dog years?");
    for(int i=0; i<tdog.myAge(); i++){
    System.out.println("WOOF!!!");
  }
  }
}
  
  
  
    
