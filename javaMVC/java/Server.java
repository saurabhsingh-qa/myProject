public class Server extends Computer{
    private String RAM;
    private String ROM;
    private String Processor;
    public Server(String RAM, String ROM, String Processor){
        this.RAM = RAM;
        this.ROM = ROM;
        this.Processor = Processor;

    }

    
    public String getRam(){
return this.RAM;
    }
     public String getRom(){
return this.ROM;
         
     }
 public String getProcessor(){
return this.Processor;
     
 }


}
