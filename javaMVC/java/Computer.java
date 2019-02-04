abstract class Computer{
    abstract public String getRam();
        abstract public String getRom();
            abstract public String getProcessor();
    public String toString(){
		return "RAM:"+this.getRam()+","+"ROM:"+getRom()+","+"Processor:"+","+getProcessor();
	}
}
