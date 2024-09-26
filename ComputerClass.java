class Computer 
{
    public void playMusic() {
        System.out.println("Music Playing..");
    }
    public String getAPen(int cost) {
        if(cost >= 10) {
            return "Pen successfully bought!";
        }
        return "Amount is not enough to buy a pen!";
    }
}

public class ComputerClass 
{
    public static void main(String[] args) 
    {
        Computer obj = new Computer();
        obj.playMusic();
        String ans = obj.getAPen(2);
        System.out.println(ans);
    }
}
