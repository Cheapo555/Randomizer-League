import java.util.*;

public class LeagueRandomizer {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    functionality();
    while(true) {
      if (sc.next().equals("r")) {
        functionality();
      }
    }
  }
  public static ArrayList<Items> itemArrayListCreator() {
      ArrayList<Items> itemList = new ArrayList();

      itemList.add(new Items("Abyssal Mask"));
      itemList.add(new Items("Adaptive Helm"));
      itemList.add(new Items("Archangel's Staff"));
      itemList.add(new Items("Ardent Censer"));
      itemList.add(new Items("Athene's Unholy Grail"));
      itemList.add(new Items("Banner of Command"));
      itemList.add(new Items("Banshee's Veil"));
      itemList.add(new Items("Berserker's Greaves"));
      itemList.add(new Items("Blade of the Ruined King"));
      itemList.add(new Items("Boots of Mobility"));
      itemList.add(new Items("Boots of Swiftness"));
      itemList.add(new Items("Dead Man's Plate"));
      itemList.add(new Items("Death's Dance"));
      itemList.add(new Items("Duskblade of Draktharr"));
      itemList.add(new Items("Edge of Night"));
      itemList.add(new Items("Red Enchantment: Bloodrazor"));
      itemList.add(new Items("Green Enchantment: Bloodrazor"));
      itemList.add(new Items("Blue Enchantment: Bloodrazor"));
      itemList.add(new Items("Red Enchantment: Cinderhulk"));
      itemList.add(new Items("Green Enchantment: Cinderhulk"));
      itemList.add(new Items("Blue Enchantment: Cinderhulk"));
      itemList.add(new Items("Red Enchantment: Runic Echoes"));
      itemList.add(new Items("Green Enchantment: Runic Echoes"));
      itemList.add(new Items("Blue Enchantment: Runic Echoes"));
      itemList.add(new Items("Red Enchantment: Warrior"));
      itemList.add(new Items("Green Enchantment: Warrior"));
      itemList.add(new Items("Blue Enchantment: Warrior"));
      itemList.add(new Items("Essence Reaver"));
      itemList.add(new Items("Eye of the Equinox"));
      itemList.add(new Items("Eye of the Oasis"));
      itemList.add(new Items("Eye of the Watchers"));
      itemList.add(new Items("Face of the Mountain"));
      itemList.add(new Items("Frost Queen's Claim"));
      itemList.add(new Items("Frozen Heart"));
      itemList.add(new Items("Frozen Mallet"));
      itemList.add(new Items("Gargoyle Stoneplate"));
      itemList.add(new Items("Gaurdian Angel"));
      itemList.add(new Items("Guinsoos Rageblade"));
      itemList.add(new Items("Hextech GLP-800"));
      itemList.add(new Items("Hextech Gunblade"));
      itemList.add(new Items("Hextech Protobelt-01"));
      itemList.add(new Items("Iceborn Gauntlet"));
      itemList.add(new Items("Infinity Edge"));
      itemList.add(new Items("Ionian Boots Of Lucidity"));
      itemList.add(new Items("Knight's Vow"));
      itemList.add(new Items("Liandrys Torment"));
      itemList.add(new Items("Lich Bane"));
      itemList.add(new Items("Locket Of The Iron Solari"));
      itemList.add(new Items("Lord Dominik's Regards"));
      itemList.add(new Items("Luden's Echo"));
      itemList.add(new Items("Manamune"));
      itemList.add(new Items("Maw of the Malmortius"));
      itemList.add(new Items("Mejai's Soulstealer"));
      itemList.add(new Items("Mercurial Scimitar"));
      itemList.add(new Items("Mercury's Treads"));
      itemList.add(new Items("Mikael's Crucible"));
      itemList.add(new Items("Morellonomicon"));
      itemList.add(new Items("Mortal Reminder"));
      itemList.add(new Items("Nashor's Tooth"));
      itemList.add(new Items("Ninja Tabi"));
      itemList.add(new Items("Ohmwrecker"));
      itemList.add(new Items("Phantom Dancer"));
      itemList.add(new Items("Rabidon's Deathcap"));
      itemList.add(new Items("Randiun's Omen"));
      itemList.add(new Items("Rapid Firecannon"));
      itemList.add(new Items("Ravenous Hydra"));
      itemList.add(new Items("Redemption"));
      itemList.add(new Items("Righteous Glory"));
      itemList.add(new Items("Rod of Ages"));
      itemList.add(new Items("Runaan's Hurricane"));
      itemList.add(new Items("Rylai's Crystal Scepter"));
      itemList.add(new Items("Spirit Visage"));
      itemList.add(new Items("Statikk Shiv"));
      itemList.add(new Items("Sterak's Gage"));
      itemList.add(new Items("Sunfire Cape"));
      itemList.add(new Items("Talisman of Ascension"));
      itemList.add(new Items("The Black Cleaver"));
      itemList.add(new Items("The Bloodthirster"));
      itemList.add(new Items("Thornmail"));
      itemList.add(new Items("Titanic Hydra"));
      itemList.add(new Items("Trinity Force"));
      itemList.add(new Items("Void Staff"));
      itemList.add(new Items("Warmog's Armor"));
      itemList.add(new Items("Wit's End"));
      itemList.add(new Items("Yoummuu's Ghostblade"));
      itemList.add(new Items("Zeke's Convergance"));
      itemList.add(new Items("Zhonya's Hourglass"));
      itemList.add(new Items("Zz'rot Portal"));

      return itemList;
  }

  public static ArrayList<Champions> championArrayListCreator() {
    ArrayList<Champions> championList = new ArrayList();

    championList.add(new Champions("Aatrox"));
    championList.add(new Champions("Ahri"));
    championList.add(new Champions("Akali"));
    championList.add(new Champions("Alistar"));
    championList.add(new Champions("Amumu"));
    championList.add(new Champions("Anivia"));
    championList.add(new Champions("Annie"));
    championList.add(new Champions("Ashe"));
    championList.add(new Champions("Aurelion Sol"));
    championList.add(new Champions("Azir"));
    championList.add(new Champions("Bard"));
    championList.add(new Champions("Blitzcrank"));
    championList.add(new Champions("Brand"));
    championList.add(new Champions("Braum"));
    championList.add(new Champions("Caitlyn"));
    championList.add(new Champions("Camille"));
    championList.add(new Champions("Cassiopeia"));
    championList.add(new Champions("Cho’Gath"));
    championList.add(new Champions("Corki"));
    championList.add(new Champions("Darius"));
    championList.add(new Champions("Diana"));
    championList.add(new Champions("Dr. Mundo"));
    championList.add(new Champions("Draven"));
    championList.add(new Champions("Ekko"));
    championList.add(new Champions("Elise"));
    championList.add(new Champions("Evelynn"));
    championList.add(new Champions("Ezreal"));
    championList.add(new Champions("Fiddlesticks"));
    championList.add(new Champions("Fiora"));
    championList.add(new Champions("Fizz"));
    championList.add(new Champions("Galio"));
    championList.add(new Champions("Gangplank"));
    championList.add(new Champions("Garen"));
    championList.add(new Champions("Gnar"));
    championList.add(new Champions("Gragas"));
    championList.add(new Champions("Graves"));
    championList.add(new Champions("Hecarim"));
    championList.add(new Champions("Heimerdinger"));
    championList.add(new Champions("Illaoi"));
    championList.add(new Champions("Irelia"));
    championList.add(new Champions("Ivern"));
    championList.add(new Champions("Janna"));
    championList.add(new Champions("Jarvan IV"));
    championList.add(new Champions("Jax"));
    championList.add(new Champions("Jayce"));
    championList.add(new Champions("Jhin"));
    championList.add(new Champions("Jinx"));
    championList.add(new Champions("Kalista"));
    championList.add(new Champions("Karma"));
    championList.add(new Champions("Karthus"));
    championList.add(new Champions("Kassadin"));
    championList.add(new Champions("Katarina"));
    championList.add(new Champions("Kayle"));
    championList.add(new Champions("Kennen"));
    championList.add(new Champions("Kha’Zix"));
    championList.add(new Champions("Kindred"));
    championList.add(new Champions("Kled"));
    championList.add(new Champions("Kog’Maw"));
    championList.add(new Champions("LeBlanc"));
    championList.add(new Champions("Lee Sin"));
    championList.add(new Champions("Leona"));
    championList.add(new Champions("Lissandra"));
    championList.add(new Champions("Lucian"));
    championList.add(new Champions("Lulu"));
    championList.add(new Champions("Lux"));
    championList.add(new Champions("Malphite"));
    championList.add(new Champions("Malzahar"));
    championList.add(new Champions("Maokai"));
    championList.add(new Champions("Master Yi"));
    championList.add(new Champions("Miss Fortune"));
    championList.add(new Champions("Mordekaiser"));
    championList.add(new Champions("Morgana"));
    championList.add(new Champions("Nami"));
    championList.add(new Champions("Nasus"));
    championList.add(new Champions("Nautilus"));
    championList.add(new Champions("Nidalee"));
    championList.add(new Champions("Nocturne"));
    championList.add(new Champions("Nunu"));
    championList.add(new Champions("Olaf"));
    championList.add(new Champions("Orianna"));
    championList.add(new Champions("Pantheon"));
    championList.add(new Champions("Poppy"));
    championList.add(new Champions("Quinn"));
    championList.add(new Champions("Rammus"));
    championList.add(new Champions("Rek’Sai"));
    championList.add(new Champions("Rengar"));
    championList.add(new Champions("Rengar"));
    championList.add(new Champions("Riven"));
    championList.add(new Champions("Rumble"));
    championList.add(new Champions("Ryze"));
    championList.add(new Champions("Sejuani"));
    championList.add(new Champions("Shaco"));
    championList.add(new Champions("Shen"));
    championList.add(new Champions("Shyvana"));
    championList.add(new Champions("Singed"));
    championList.add(new Champions("Sion"));
    championList.add(new Champions("Sivir"));
    championList.add(new Champions("Skarner"));
    championList.add(new Champions("Sona"));
    championList.add(new Champions("Soraka"));
    championList.add(new Champions("Swain"));
    championList.add(new Champions("Tahm Kench"));
    championList.add(new Champions("Taliyah"));
    championList.add(new Champions("Talon"));
    championList.add(new Champions("Taric"));
    championList.add(new Champions("Teemo"));
    championList.add(new Champions("Thresh"));
    championList.add(new Champions("Tristana"));
    championList.add(new Champions("Trundle"));
    championList.add(new Champions("Tryndamere"));
    championList.add(new Champions("Twisted Fate"));
    championList.add(new Champions("Twitch"));
    championList.add(new Champions("Udyr"));
    championList.add(new Champions("Urgot"));
    championList.add(new Champions("Varus"));
    championList.add(new Champions("Vayne"));
    championList.add(new Champions("Veigar"));
    championList.add(new Champions("Vel’Koz"));
    championList.add(new Champions("Vi"));
    championList.add(new Champions("Viktor"));
    championList.add(new Champions("Vladmir"));
    championList.add(new Champions("Volibear"));
    championList.add(new Champions("Warwick"));
    championList.add(new Champions("Wukong"));
    championList.add(new Champions("Xerath"));
    championList.add(new Champions("Xin Zhao"));
    championList.add(new Champions("Yasuo"));
    championList.add(new Champions("Yorick"));
    championList.add(new Champions("Zac"));
    championList.add(new Champions("Zed"));
    championList.add(new Champions("Ziggs"));
    championList.add(new Champions("Zilean"));
    championList.add(new Champions("Zyra"));

    return championList;
  }

  public static void functionality() {
    Random rng = new Random();
    String champion = null;
    String lane = null;
    String summoner = null;
    String maxAbility = null;
    String item = null;
    //champ
    ArrayList<Champions> champions = championArrayListCreator();
    int championsRNG = rng.nextInt(champions.size());
    champion = champions.get(championsRNG).championName;
    System.out.println(champion);

    //lane
    ArrayList<String> lanes = new ArrayList<>(Arrays.asList("Top","Mid","Bot","Support","Jungle"));
    int laneRNG = rng.nextInt(lanes.size());
    lane = lanes.get(laneRNG);
    System.out.println(lane);

    //summoners
    if (lane.equals("Jungle")) {
      ArrayList<String> summonersSmite = new ArrayList<>(Arrays.asList("Flash","Ghost","Cleanse","Teleport","Ignite","Barrier","Exhaust","Heal"));
      int summonersRNGSmite = rng.nextInt(summonersSmite.size());
      summoner = "Smite + " + summonersSmite.get(summonersRNGSmite);
      System.out.print(summoner);
    }
    else {
      for (int i = 0;i < 2 ;i++) {
        ArrayList<String> summoners = new ArrayList<>(Arrays.asList("Flash","Ghost","Cleanse","Teleport","Ignite","Barrier","Exhaust","Heal"));
        int summonersRNG = rng.nextInt(summoners.size());
        summonersRNG = rng.nextInt(summoners.size());
        summoner = summoners.get(summonersRNG);
        System.out.print(summoner);
        if (i < 1){
          System.out.print(" + ");
        }
        summoners.remove(summonersRNG);
      }
    }

    System.out.println();

    //ability max
    ArrayList<String> maxAbilities = new ArrayList<>(Arrays.asList("Q Max","W Max","E Max"));
    int maxAbilitiesRNG = rng.nextInt(maxAbilities.size());
    maxAbility = maxAbilities.get(maxAbilitiesRNG);
    System.out.println(maxAbility);

    //items
    ArrayList<Items> items = itemArrayListCreator();
    for (int i = 0;i < 6 ; i++) {
      int itemsRNG = rng.nextInt(items.size());
      item = items.get(itemsRNG).itemName;
      System.out.print(item);
      if (i < 5){
        System.out.print(" + ");
      }
      items.remove(itemsRNG);
    }
    System.out.println();
    System.out.println("Type r to reroll:");
  }
}
