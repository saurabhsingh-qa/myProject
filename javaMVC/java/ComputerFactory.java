public class ComputerFactory {

    public static Computer getComputer(String Type, String RAM, String ROM, String Processor){
        if ("PC".equalsIgnoreCase(Type))
        {
            return new PC(RAM, ROM, Processor);
        }
        else{
            return new Server(RAM, ROM, Processor);
        }
    }
    
}