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
      itemList.add(new Items("Liandry's Torment"));
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
      itemList.add(new Items("Sorcerer's Shoes"));
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

      int indexOne = 0;
      int indexTwo = 0;

      for (int i = 0; i < itemList.size(); i++) {
        if (itemList.get(i).getItemName().equals("Red Enchantment: Bloodrazor")) {
          indexOne = i;
        }
        if (itemList.get(i).getItemName().equals("Blue Enchantment: Warrior")) {
          indexTwo = i;
        }
      }

      for (int i = indexOne; i <= indexTwo; i++){
        itemList.get(i).setIsJungle(true);
      }

      for (int i = 0; i < itemList.size(); i++) {
        if (itemList.get(i).getItemName().equals("Berserker's Greaves")) {
          itemList.get(i).setIsBoot(true);
        }
        if (itemList.get(i).getItemName().equals("Boots of Mobility")) {
          itemList.get(i).setIsBoot(true);
        }
        if (itemList.get(i).getItemName().equals("Boots of Swiftness")) {
          itemList.get(i).setIsBoot(true);
        }
        if (itemList.get(i).getItemName().equals("Ionian Boots Of Lucidity")) {
          itemList.get(i).setIsBoot(true);
        }
        if (itemList.get(i).getItemName().equals("Mercury's Treads")) {
          itemList.get(i).setIsBoot(true);
        }
        if (itemList.get(i).getItemName().equals("Ninja Tabi")) {
          itemList.get(i).setIsBoot(true);
        }
        if (itemList.get(i).getItemName().equals("Sorcerer's Shoes")) {
          itemList.get(i).setIsBoot(true);
        }
      }

      return itemList;
  }

  public static ArrayList<Champions> championArrayListCreator() {
    ArrayList<Champions> championList = new ArrayList();

    championList.add(new Champions("Aatrox",true));
    championList.add(new Champions("Ahri",false));
    championList.add(new Champions("Akali",true));
    championList.add(new Champions("Alistar",true));
    championList.add(new Champions("Amumu",true));
    championList.add(new Champions("Anivia",false));
    championList.add(new Champions("Annie",false));
    championList.add(new Champions("Ashe",false));
    championList.add(new Champions("Aurelion Sol",false));
    championList.add(new Champions("Azir",false));
    championList.add(new Champions("Bard",false));
    championList.add(new Champions("Blitzcrank",true));
    championList.add(new Champions("Brand",false));
    championList.add(new Champions("Braum",true));
    championList.add(new Champions("Caitlyn",false));
    championList.add(new Champions("Camille",true));
    championList.add(new Champions("Cassiopeia",false));
    championList.add(new Champions("Cho’Gath",true));
    championList.add(new Champions("Corki",false));
    championList.add(new Champions("Darius",true));
    championList.add(new Champions("Diana",false));
    championList.add(new Champions("Dr. Mundo",true));
    championList.add(new Champions("Draven",false));
    championList.add(new Champions("Ekko",true));
    championList.add(new Champions("Elise",false));
    championList.add(new Champions("Evelynn",true));
    championList.add(new Champions("Ezreal",false));
    championList.add(new Champions("Fiddlesticks",false));
    championList.add(new Champions("Fiora",true));
    championList.add(new Champions("Fizz",true));
    championList.add(new Champions("Galio",true));
    championList.add(new Champions("Gangplank",true));
    championList.add(new Champions("Garen",true));
    championList.add(new Champions("Gnar",false));
    championList.add(new Champions("Gragas",true));
    championList.add(new Champions("Graves",false));
    championList.add(new Champions("Hecarim",false));
    championList.add(new Champions("Heimerdinger",false));
    championList.add(new Champions("Illaoi",true));
    championList.add(new Champions("Irelia",true));
    championList.add(new Champions("Ivern",false));
    championList.add(new Champions("Janna",false));
    championList.add(new Champions("Jarvan IV",true));
    championList.add(new Champions("Jax",true));
    championList.add(new Champions("Jayce",false));
    championList.add(new Champions("Jhin",false));
    championList.add(new Champions("Jinx",false));
    championList.add(new Champions("Kalista",false));
    championList.add(new Champions("Karma",false));
    championList.add(new Champions("Karthus",false));
    championList.add(new Champions("Kassadin",true));
    championList.add(new Champions("Katarina",true));
    championList.add(new Champions("Kayle",false));
    championList.add(new Champions("Kennen",false));
    championList.add(new Champions("Kha’Zix",true));
    championList.add(new Champions("Kindred",false));
    championList.add(new Champions("Kled",true));
    championList.add(new Champions("Kog’Maw",false));
    championList.add(new Champions("LeBlanc",false));
    championList.add(new Champions("Lee Sin",true));
    championList.add(new Champions("Leona",true));
    championList.add(new Champions("Lissandra",false));
    championList.add(new Champions("Lucian",false));
    championList.add(new Champions("Lulu",false));
    championList.add(new Champions("Lux",false));
    championList.add(new Champions("Malphite",true));
    championList.add(new Champions("Malzahar",false));
    championList.add(new Champions("Maokai",true));
    championList.add(new Champions("Master Yi",true));
    championList.add(new Champions("Miss Fortune",false));
    championList.add(new Champions("Mordekaiser",true));
    championList.add(new Champions("Morgana",false));
    championList.add(new Champions("Nami",false));
    championList.add(new Champions("Nasus",true));
    championList.add(new Champions("Nautilus",true));
    championList.add(new Champions("Nidalee",false));
    championList.add(new Champions("Nocturne",true));
    championList.add(new Champions("Nunu",true));
    championList.add(new Champions("Olaf",true));
    championList.add(new Champions("Orianna",false));
    championList.add(new Champions("Pantheon",true));
    championList.add(new Champions("Poppy",true));
    championList.add(new Champions("Quinn",false));
    championList.add(new Champions("Rammus",true));
    championList.add(new Champions("Rek’Sai",true));
    championList.add(new Champions("Rengar",true));
    championList.add(new Champions("Riven",true));
    championList.add(new Champions("Rumble",true));
    championList.add(new Champions("Ryze",false));
    championList.add(new Champions("Sejuani",true));
    championList.add(new Champions("Shaco",true));
    championList.add(new Champions("Shen",true));
    championList.add(new Champions("Shyvana",true));
    championList.add(new Champions("Singed",true));
    championList.add(new Champions("Sion",true));
    championList.add(new Champions("Sivir",false));
    championList.add(new Champions("Skarner",true));
    championList.add(new Champions("Sona",false));
    championList.add(new Champions("Soraka",false));
    championList.add(new Champions("Swain",false));
    championList.add(new Champions("Tahm Kench",true));
    championList.add(new Champions("Taliyah",false));
    championList.add(new Champions("Talon",true));
    championList.add(new Champions("Taric",true));
    championList.add(new Champions("Teemo",false));
    championList.add(new Champions("Thresh",false));
    championList.add(new Champions("Tristana",false));
    championList.add(new Champions("Trundle",true));
    championList.add(new Champions("Tryndamere",true));
    championList.add(new Champions("Twisted Fate",false));
    championList.add(new Champions("Twitch",false));
    championList.add(new Champions("Udyr",true));
    championList.add(new Champions("Urgot",false));
    championList.add(new Champions("Varus",false));
    championList.add(new Champions("Vayne",false));
    championList.add(new Champions("Veigar",false));
    championList.add(new Champions("Vel’Koz",false));
    championList.add(new Champions("Vi",true));
    championList.add(new Champions("Viktor",false));
    championList.add(new Champions("Vladmir",false));
    championList.add(new Champions("Volibear",true));
    championList.add(new Champions("Warwick",true));
    championList.add(new Champions("Wukong",true));
    championList.add(new Champions("Xerath",false));
    championList.add(new Champions("Xin Zhao",true));
    championList.add(new Champions("Yasuo",true));
    championList.add(new Champions("Yorick",true));
    championList.add(new Champions("Zac",true));
    championList.add(new Champions("Zed",true));
    championList.add(new Champions("Ziggs",false));
    championList.add(new Champions("Zilean",false));
    championList.add(new Champions("Zyra",false));

    return championList;
  }

  public static void items(Boolean hasSmite, Champions champion) {
    //items randomizer
    Random rng = new Random();
    String item = null;
    int size = 0;

    ArrayList<Items> items = itemArrayListCreator();
    ArrayList<Items> boots = new ArrayList();
    ArrayList<Items> jungle = new ArrayList();
    ArrayList<Items> finalList = new ArrayList(6);

    //take out items that cant be used
    if (champion.getIsMelee()) {
      for (int i = 0; i < items.size(); i ++) {
        if (items.get(i).getItemName().equals("Rapid Firecannon")) {
          items.remove(i);
          i--;
        }
        if (items.get(i).getItemName().equals("Runaan's Hurricane")) {
          items.remove(i);
          i--;
        }
      }
    }
    else {
      for (int i = 0; i < items.size(); i ++) {
        if (items.get(i).getItemName().equals("Ravenous Hydra")) {
          items.remove(i);
          i--;
        }
        if (items.get(i).getItemName().equals("Titanic Hydra")) {
          items.remove(i);
          i--;
        }
      }
    }

    //create array of boots
    for (int i = 0; i < items.size(); i ++) {
      if (items.get(i).getIsBoot().equals(true)) {
        boots.add(items.get(i));
        items.remove(i);
        i--;
      }
    }

    //get a random boot
    int bootRNG = rng.nextInt(boots.size());
    finalList.add(boots.get(bootRNG));

    //create array of jungle items
    for (int i = 0; i < items.size(); i ++) {
      if (items.get(i).getIsJungle().equals(true)) {
        jungle.add(items.get(i));
        items.remove(i);
        i--;
      }
    }

    //get a random jungle item and other items if has smite
    if (hasSmite) {
      int jungleRNG = rng.nextInt(jungle.size());
      System.out.print(jungle.get(jungleRNG).getItemName() + " + ");
      for (int i = 0; i < 4; i++) {
        int itemsRNG = rng.nextInt(items.size());
        finalList.add(items.get(itemsRNG));
        items.remove(itemsRNG);
      }
    }
    else {
      //get random set of items
      for (int i = 0;i < 5; i++) {
        int itemsRNG = rng.nextInt(items.size());
        finalList.add(items.get(itemsRNG));
        items.remove(itemsRNG);
      }
    }

    size = finalList.size();
    for (int i = 0; i < size; i++) {
      int itemOrderRNG = rng.nextInt(finalList.size());
      System.out.print(finalList.get(itemOrderRNG).getItemName());
      finalList.remove(itemOrderRNG);
      if(i < (size - 1)) {
        System.out.print(" + ");
      }
    }
    System.out.println();
  }

  public static void functionality() {
    Random rng = new Random();
    Champions champion = null;
    String lane = null;
    String summoner = null;
    String maxAbility = null;
    Boolean jungle = false;

    ArrayList<String> lanes = new ArrayList<>(Arrays.asList("Top","Mid","Bot","Support","Jungle"));
    ArrayList<String> summoners = new ArrayList<>(Arrays.asList("Flash","Ghost","Cleanse","Teleport","Ignite","Barrier","Exhaust","Heal"));
    ArrayList<Integer> masteries = new ArrayList();
    ArrayList<String> maxAbilities = new ArrayList<>(Arrays.asList("Q Max","W Max","E Max"));

    System.out.println();

    //champ
    ArrayList<Champions> champions = championArrayListCreator();
    int championsRNG = rng.nextInt(champions.size());
    champion = champions.get(championsRNG);
    System.out.println(champion.getChampionName());

    //lane
    int laneRNG = rng.nextInt(lanes.size());
    lane = lanes.get(laneRNG);
    if (lane.equals("Jungle")) {
      jungle = true;
    }
    System.out.println(lane);

    //summoners
    if (jungle) {
      int summonersRNGSmite = rng.nextInt(summoners.size());
      summoner = "Smite + " + summoners.get(summonersRNGSmite);
      System.out.print(summoner);
    }
    else {
      for (int i = 0;i < 2 ;i++) {
        int summonersRNG = rng.nextInt(summoners.size());
        summoner = summoners.get(summonersRNG);
        summoners.remove(summonersRNG);
        System.out.print(summoner);
        if (i < 1){
          System.out.print(" + ");
        }
      }
    }
    System.out.println();

    //masteries
    int a;
    int b;
    int c = 18;
    int aRNG = rng.nextInt(13);
    a = aRNG;
    b = 12 - a;

    masteries.add(a);
    masteries.add(b);
    masteries.add(c);

    for(int i = 0; i < 3; i++){
    int masteriesRNG = rng.nextInt(masteries.size());
    int masteriess = masteries.get(masteriesRNG);
    masteries.remove(masteriesRNG);

    System.out.print(masteriess);
    if(i < 2){
    System.out.print(" + ");
    }
    }
    System.out.println(" ");

    //ability max
    int maxAbilitiesRNG = rng.nextInt(maxAbilities.size());
    maxAbility = maxAbilities.get(maxAbilitiesRNG);
    System.out.println(maxAbility);

    items(jungle,champion);

    System.out.println();
    System.out.println("Type r to reroll:");
  }
}
