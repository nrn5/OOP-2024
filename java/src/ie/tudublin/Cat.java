<<<<<<< HEAD
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
=======
package ie.tudublin;

public class Cat extends Animal {
    public void speak()
    {
        System.out.println("Meaow: " + getName());
    }

    public Cat(String name)
    {
        setName(name);
    }
    
}
>>>>>>> e3bd70e5953d5a98b6b636c5ca0b98a243b5bbb4
