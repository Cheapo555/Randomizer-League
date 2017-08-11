public class Champions {
  String championName = null;
  Boolean isMelee = null;

  public Champions (String name,Boolean melee){
    championName = name;
    isMelee = melee;
  }
  public static void main(String[] args) {

  }
  public String getChampionName() {
    return championName;
  }
  public Boolean getIsMelee() {
    return isMelee;
  }
}
