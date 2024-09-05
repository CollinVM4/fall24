public class Player {
    
    private String name;
    private int hp, maxhp, potions;
    private int minDamg, maxDamg;


    public Player(String name, int hp)
    {
        this.name = name;
        this.hp = hp;
        this.maxhp = hp;
        this.potions = 5;
        this.maxDamg = 2;
        this.maxDamg = 10;
    }

    // our getters
    public String getName()
    {
        return this.name;
    }

    public int getCurrentHP()
    {
        return this.hp;
    }

    public int getMaxHP()
    {
        return this.maxhp;
    }

    public boolean isDead()
    {
        if(this.hp <= 0) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }

    public int attack()
    {
        int options = this.maxDamg - this.minDamg;

       // [0,1) * options = [0, options) + minDamg = [minDamg, options+minDamg)
        int output = (int) (Math.random() * options) + this.minDamg;
        return output;
    }

    public boolean heal()
    {
        if (this.potions > 0) 
        {
            this.hp += (int)(Math.random() * 10 + 1);
            this.potions--;
            if(this.hp > this.maxhp)
            {
                this.hp = this.maxhp;
            }
            return true;
        }

        return false;
    }

    public void damage(int damg)
    {
        if (damg >= 0)
        {
            int newHealth = this.hp - damg;
            this.hp = newHealth;
        }
    }
    
    public int getPotions()
    {
        return this.potions;
    }
}
