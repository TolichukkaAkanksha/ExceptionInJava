public class GetterSetter {
    public  static void main(String arg[])
    {
       Human obj=new Human();
       Human obj1=new Human(97,"Akanksha");
      
       System.out.println(obj.getAge()+":"+obj.getName());
    }
}
class Human{
    int age;
    String name;
   
    public int getAge() {
        return age;
    }
    // public void setAge(int age) {
    //     this.age = age;//passing obj
    // }
    public String getName() {
        return name;
    }
    // public void setName(String name) {
    //     this.name = name;
    // }
    public Human(){
        name="kanna";
        age=67;
    }
    public Human(int n,String m)
    {
        System.out.println(n+" "+m);
    }
   
    

}

