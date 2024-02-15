package ie.tudublin;

public class Cat {
    private int numLives;
    String name;

    public Cat(String name)
	{
		this.name = name;
        this.numLives = 9;
	}

    public int getNumLives() {
        return this.numLives;
    }

    public void kill() {
        numLives = numLives - 1;
        if (numLives > 0) {
            System.out.println("Ouch!");
        } 
        if (numLives == 0) {
            System.out.println("Dead!!");
        }
    }


}
