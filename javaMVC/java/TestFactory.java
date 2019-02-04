public class TestFactory{
    public static void main(String[] args) {
        Computer PC = ComputerFactory.getComputer("PC", "4GB", "1TB", "2.4GHz");
        Computer Server = ComputerFactory.getComputer("Server", "8GB", "100TB", "5GHz");
        System.out.println("Computer Details:"+pc );
         
        System.out.println("Computer Details:"+server );
        
    }
}
