package WaitingList;

public class Main {

    public static void main (String[] args) {
        UnfairWaitList<Something> queueUnfair = new UnfairWaitList<>();
        Something[] smth = new Something[4];
        smth[0] = new Something("Штанга", 20);
        smth[1] = new Something("Ноутбук", 3);
        smth[2] = new Something("Молоток", 5);
        smth[3] = new Something("Телевизор", 10);

        for (int i = 0; i < 4; i++)
            queueUnfair.add(smth[i]);

        queueUnfair.remove(smth[1]);
        queueUnfair.moveToBack(smth[2]);

        System.out.print(queueUnfair.toString() + "\n\n");

        BoundedWaitList<Something> queueBounded = new BoundedWaitList<>(4);
        for (int i = 0; i < 4; i++)
            queueBounded.add(smth[i]);
        queueBounded.add(smth[2]);
        queueBounded.add(smth[3]);

        System.out.print(queueBounded.toString());
    }

}
