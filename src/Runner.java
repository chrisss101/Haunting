public class Runner {
    public static void main(String[] args) {
        String[][] size = new String[6][5];
        Haunting Pumpkin = new Haunting(size);
        Pumpkin.fill("a");
        Pumpkin.edit("o",2,4);
        Pumpkin.edit("o",3,4);
        Pumpkin.edit("o",4,4);
        Pumpkin.edit("o",5,4);
        Pumpkin.edit("o",2,1);
        Pumpkin.edit("o",4,1);
        System.out.println(Pumpkin.toString());

    }
}
