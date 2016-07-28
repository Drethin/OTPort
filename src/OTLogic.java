/**
 * Created by Alex on 2016-07-27.
 *
 * logic for ot
 */
public class OTLogic {
    private int money;
    private int oxen;
    private int food;
    private int ammo;
    private int clothes;
    private int misc;
    private boolean injured;
    private int eventCounter;
    private int turnNum;
    private String date;

    public OTLogic() {
        money = 700;
        oxen = 0;
        food = 0;
        ammo = 0;
        clothes = 0;
        misc = 0;
        injured = false;
        eventCounter = 0;
        turnNum = 0;
        date = "MONDAY MARCH 29 1847";
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getOxen() {
        return oxen;
    }

    public void setOxen(int oxen) {
        this.oxen = oxen;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getClothes() {
        return clothes;
    }

    public void setClothes(int clothes) {
        this.clothes = this.clothes;
    }

    public int getMisc() {
        return misc;
    }

    public void setMisc(int misc) {
        this.misc = misc;
    }

    public boolean isInjured() {
        return injured;
    }

    public void setInjured(boolean injured) {
        this.injured = injured;
    }

    public int getEventCounter() {
        return eventCounter;
    }

    public void setEventCounter(int eventCounter) {
        this.eventCounter = eventCounter;
    }

    public int getTurnNum() {
        return turnNum;
    }

    public void setTurnNum(int turnNum) {
        this.turnNum = turnNum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public boolean initMoney(){
        money -= (oxen + food + ammo + clothes + misc);
        if(money >=0) return true;
        money = 700;
        return false;
    }
    public void initAmmo(){
        ammo*=50;
    }
}
