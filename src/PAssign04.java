public class PAssign04 {
	public static void main(String[] args) {
		VideoCard[] card;
		card = createVidList();
		//This is Xavier_Howell PAssign04
		card[0]= new IntegratedVideoCard();
		card[1] = new DiscreteVideoCard("PCIEx16","8-pin",375,16);
		card[2] = new IntegratedVideoCard(2,false,120,4);
		card[3] = new DiscreteVideoCard("PCIEx8","6-pin",150,8);
		card[4] = new IntegratedVideoCard(2,false,-110,3);
		printComp(card);
	}
	private static VideoCard[] createVidList() {
		VideoCard[] list = new VideoCard[5];
        for(int i=0; i< list.length;i++) {
        	list[i] = new VideoCard();
        }
		return list;
	}
	 static void printComp(VideoCard[] printer) {
	    	for(int i=0; i < printer.length; i++){
	            System.out.println(printer[i].toString());
	        	}
		}
}

class VideoCard {
	private String type;
	private int powerRequirement;
	private int memorySize;
	
	
	VideoCard(){
		type = "integrated";
		powerRequirement = 100;
		memorySize = 1;
		
	}
	VideoCard(String type, String connection, int power, String external, int memory){
		this.type = type;
		powerRequirement = setPower(power);
		memorySize = setMemory(memory);
		
	}
	String getType() {
		return this.type;
	}
	void setType(String type) {
		this.type = type;
	}
	 int setPower(int num) {
		if(num > 300) return powerRequirement = 200;
		if(num < 1)   return powerRequirement = 75;
		else { powerRequirement = num;}
	return powerRequirement;
	}
	int getPower() {
		return this.powerRequirement;
	}

	 int setMemory(int num) {
		if(num > 12) return memorySize = 12;
		if(num < 1)  return memorySize = 1;
		else { memorySize = num;}
	return memorySize;
	}
	int getMemory() {
		return this.memorySize;
	}
	public String toString(){ 
        return String.format("Video Card Info:\nType:\t\t\t%s\nPower:\t\t\t%dW\nMemory:\t\t%d GB\n",this.type,this.powerRequirement, this.memorySize);
    }
}

class DiscreteVideoCard extends VideoCard {
	private String connection;
	private String extPower;
	
	DiscreteVideoCard(){
		this.setType("discrete");
		connection = "PCIEx8";
		extPower = "6-pin";
	}
	DiscreteVideoCard(String connection, String extPower, int power, int memory){
		this.setType("discrete");
		this.setPower(power);
		this.setMemory(memory);
		this.connection = connection;
		this.extPower = extPower;
	}
	public String toString(){ 
        return super.toString()+ String.format("\nConnection:\t\t%s\nExternal Power:\t%s\n",this.connection,this.extPower);
	}

}

class IntegratedVideoCard extends VideoCard {
	private int SharedWatts;
	private boolean ShaRAM;
	
	IntegratedVideoCard(){
		this.setType("integrated");
		SharedWatts = 2;
		ShaRAM = false;
	}
	IntegratedVideoCard(int Watts, boolean RAM, int power, int memory){
		this.setType("integrated");
		this.setPower(power);
		this.setMemory(memory);
		this.SharedWatts = Watts;
		this.ShaRAM = RAM;
	}
	public String toString(){ 
        return super.toString() + String.format("\nShared Memory:\t%d GB\nComputer\sRAM:\t\t%b\n",SharedWatts,ShaRAM);
	}
}
