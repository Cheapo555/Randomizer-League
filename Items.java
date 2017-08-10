public class Items {
  String itemName = null;
  Boolean isJungle = false;
  Boolean isBoot = false;

  //constructors
  public Items (String name) {
    itemName = name;
  }

  public static void main(String[] args) {

  }

  public String getItemName() {
    return itemName;
  }
  public Boolean getIsJungle() {
    return isJungle;
  }
  public void setIsJungle(Boolean jungle) {
    this.isJungle = jungle;
  }
  public Boolean getIsBoot() {
    return isBoot;
  }
  public void setIsBoot(Boolean boot) {
    this.isBoot = boot;
  }
}
