public class BadGuy 
{
        private String name;
        private int hp, maxhp, potions;
        private int minDamg, maxDamg;
    
    
        public BadGuy(int hp)
        {
            this.name = "Adam";
            this.hp = hp;
            this.maxhp = hp;
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
    
        public void damage(int damg)
        {
            if (damg >= 0)
            {
                int newHealth = this.hp - damg;
                this.hp = newHealth;
            }
        }
        
}
    

