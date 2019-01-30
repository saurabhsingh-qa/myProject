public class PC extends Computer{
    private String RAM;
    private String ROM;
    private String Processor;
    public Server(String RAM, String ROM, String Processor){
        this.RAM = RAM;
        this.ROM = ROM;
        this.Processor = Processor;

    }

    public print(){
        System.out.println("RAM =" + RAM);
        System.out.println("ROM =" + ROM);
        System.out.println("Processor =" + Processor);
    }
    public static printDetails(){
        new PC.print();
    }

    
}
