package com.example.jovan.guesthewordloledition;

import java.util.ArrayList;
import java.util.Random;

public class Word {

	private ArrayList<String> words = new ArrayList<String>();

	public void remove(int i) {
		words.remove(i);
	}

	public int size(){
		return words.size();
	}

	public Word(ArrayList<Boolean> list) {
		if (!list.get(0) && !list.get(1) && !list.get(2) && !list.get(3) && !list.get(4) && !list.get(5))
			addGame();
		if(list.get(0)) addAbilities();
		if(list.get(1)) addChampions();
		if(list.get(2)) addGame();
		if(list.get(3)) addSummonerSpells();
		if(list.get(4)) addItems();
		if(list.get(5)) addMonsters();
	}


	public Word(boolean abilities, boolean champions, boolean competitive, boolean game, 
			boolean summonerSpells, boolean items, boolean monsters) {
		if(abilities) addAbilities();
		if(champions) addChampions();
		if(game) addGame();
		if(summonerSpells) addSummonerSpells();
		if(items) addItems();
		if(monsters) addMonsters();


			if (competitive) {
				words.add("NA LCS");
				words.add("TSM");
				words.add("Dyrus");
				words.add("Santorin");
				words.add("Bjergsen");
				words.add("Wild Turtle");
				words.add("Lustboy");
				words.add("Reginald");
				words.add("Locodoco");
				words.add("TheOddOne");
			}




		words.add("");
		if (competitive) {
			words.add("Patoy");
			words.add("KEITHMCBRIEF");
		}
		if (abilities) {

		}
	}

	public String getRandomWord() {

		if (words.size() <= 0) return "No more unique words";

		Random r = new Random();
		int i = r.nextInt(words.size());
		String tmp = words.get(i);
		words.remove(i);
		return tmp;
	}
	
	private void addSkins() {
		
	}

	private static void addTeams() {
		
	}
	
	private static void addPlayers() {
		
	}
	
	private	 void addItems() {
		words.add("Amplifying Tome ");
		words.add("Ancient Coin ");
		words.add("B.F. Sword ");
		words.add("Boots of Speed ");
		words.add("Cloak of Agility ");
		words.add("Cloth Armor ");
		words.add("Dagger ");
		words.add("Doran's Blade ");
		words.add("Doran's Ring ");
		words.add("Doran's Shield ");
		words.add("Hunter's Machete ");
		words.add("Long Sword ");
		words.add("Needlessly Large Rod ");
		words.add("Pickaxe ");
		words.add("Relic Shield ");
		words.add("Ruby Crystal ");
		words.add("Spellthief's Edge ");
		words.add("Aegis of the Legion ");
		words.add("Aether Wisp ");
		words.add("Avarice Blade ");
		words.add("Boots of Mobility ");
		words.add("The Brutalizer ");
		words.add("Chain Vest ");
		words.add("Chalice of Harmony ");
		words.add("Giant's Belt ");
		words.add("Hexdrinker ");
		words.add("Hextech Revolver ");
		words.add("Last Whisper ");
		words.add("Infinity Edge ");
		words.add("Mejai's Soulstealer ");
		words.add("Negatron Cloak ");
		words.add("Mercury's Treads ");
		words.add("Ninja Tabi ");
		words.add("Phage ");
		words.add("Quicksilver Sash ");
		words.add("Rabadon's Deathcap ");
		words.add("Sheen ");
		words.add("Sightstone ");
		words.add("Spectre's Cowl ");
		words.add("Stinger ");
		words.add("Sword of the Occult ");
		words.add("Tear of the Goddess ");
		words.add("Tiamat ");
		words.add("Vampiric Scepter ");
		words.add("Void Staff ");
		words.add("Zeal ");
		words.add("Abyssal Scepter ");	
		words.add("Archangel's Staff ");	
		words.add("Athene's Unholy Grail ");	
		words.add("Banner of Command ");	
		words.add("Banshee's Veil ");	
		words.add("The Black Cleaver ");	
		words.add("The Bloodthirster ");	
		words.add("Essence Reaver ");	
		words.add("Frozen Heart ");	
		words.add("Frozen Mallet ");	
		words.add("Guardian Angel ");	
		words.add("Iceborn Gauntlet ");	
		words.add("Liandry's Torment ");	
		words.add("Lich Bane ");	
		words.add("Locket of the Iron Solari ");	
		words.add("Manamune");	
		words.add("Mikael's Crucible ");	
		words.add("Morellonomicon ");	
		words.add("Nashor's Tooth ");	
		words.add("Phantom Dancer ");	
		words.add("Randuin's Omen ");	
		words.add("Ravenous Hydra ");	
		words.add("Righteous Glory ");	
		words.add("Rod of Ages ");	
		words.add("Rylai's Crystal Scepter ");	
		words.add("Spirit Visage ");	
		words.add("Statikk Shiv ");	
		words.add("Sunfire Cape ");	
		words.add("Thornmail ");	
		words.add("Trinity Force ");	
		words.add("Warmog's Armor ");	
		words.add("Will of the Ancients ");	
		words.add("Youmuu's Ghostblade ");	
		words.add("Zeke's Herald ");	
		words.add("Zephyr ");	
		words.add("Zhonya's Hourglass ");	
		words.add("Zz'Rot Portal ");
		words.add("Blade of the Ruined King");
		words.add("Hextech Gunblade ");
		
	}
	
	private void addSummonerSpells() {
		words.add("Barrier");
		words.add("Clairvoyance");
		words.add("Clarity");
		words.add("Cleanse");
		words.add("Exhaust");
		words.add("Flash");
		words.add("Heal");
		words.add("Ignite");
		words.add("Smite");
		words.add("Teleport");
		words.add("Revive");
	}

	private void addMonsters() {
		words.add("Gromp");
		words.add("Crimson Raptor");
		words.add(" Greater Murk Wolf ");
		words.add("Blue Sentinel");
		words.add("Red Brambleback");
		words.add("Ancient Krug");
		words.add("Baron Nashor	");
		words.add("Dragon");
		words.add("Vilemaw ");
		
	}
	
	private void addGame() {
		words.add("Patch");
		words.add("Field of Justice");
		words.add("Nexux");
		words.add("Turrets");
		words.add("Lane");
		words.add("Items");
		words.add("Minions");
		words.add("Caster Minion");
		words.add("Melee Minion");
		words.add("Siege Minion");
		words.add("Super Minion");
		words.add("Inhibitors");
		words.add("Matchmaking");
		words.add("Elo");
		words.add("Normal Game");
		words.add("Ranked Game");
		words.add("Custom Game");
		words.add("Summoner's Rift");
		words.add("Twisted Treeline");
		words.add("Crystal Scar");
		words.add("Howling Abyss");
		words.add("Gold");
		words.add("Health");
		words.add("Mana");
		words.add("Buff");
		words.add("Brush");
		words.add("Surrender");
		words.add("Gank");
		words.add("Roam");
		words.add("Jungle");
		words.add("Mid");
		words.add("Top");
		words.add("Support");
		words.add("Marksman");
		words.add("Fog of War");
		words.add("Champion");
		words.add("Summoner");
		words.add("Influence Points");
		words.add("Riot Points");
		words.add("Riot");
		words.add("Skin");
		words.add("Runes");
		words.add("Masteries");
		words.add("All Ramdom, all Mid ");
		words.add("Summoner spells");
		words.add("Cooldown");
		words.add("Armor");
		words.add("Armor Penetration");
		words.add("Magic Ressist");
		words.add("Trinkets");
		words.add("Attack Damage");
		words.add("Attack Speed");
		words.add("Critical Strinke");
		words.add("Ability Power");
		words.add("Mana");
		words.add("Cooldown Reduction");
		words.add("Movment Speed");
		words.add("Champion Mastery");
		words.add("Critical Strinke");
		words.add("Life Steal");
		words.add("Spel Vamp");
		words.add("Marks)");
		words.add("Seals");
		words.add("Glyphs");
		words.add("Quintessences");
		
	}

	private void addAbilities() {
		words.add("Hallucinate [A]");
		words.add("Spell Shield [A]");
		words.add("On The Hunt [A]");
		words.add("Devour/Regurgitate [A]");
		words.add("Glacial Prison [A]");
		words.add("Command: Attack [A]");
		words.add("Command: Shockwave [A]");
		words.add("Alpha Strike	[A]");
		words.add("Meditate	[A]");
		words.add("Wuju Style	[A]");
		words.add("Iron Man	[A]");
		words.add("Black Shield	[A]");
		words.add("Javelin Toss	[A]");
		words.add("Absolute Zero [A]");
		words.add("Unstoppable Force [A]");
		words.add("Tunnel [A]");
		words.add("The Equalizer [A]");
		words.add("Massacre [A]");
		words.add("Charm [A]");
		words.add("Spirit Rush [A]");
		words.add("Mark of the Assassin [A]");
		words.add("Pulverize [A]");
		words.add("Headbutt [A]");
		words.add("Unbreakable Will  [A]");
		words.add("Pyromania [A]");
		words.add("Disintegrate [A]");
		words.add("Frost Shot [A]");
		words.add("Hawkshot [A]");
		words.add("Shurima's Legacy [A]");
		words.add("Cosmic Binding [A]");
		words.add("Headshot [A]");
		words.add("Ace in the Hole [A]");
		words.add("Rocket Grab [A]");
		words.add("Overdrive [A]");
		words.add("Magical Journey [A]");
		words.add("Stand Behind Me [A]");
		words.add("Unbreakable [A]");
		words.add("Feast [A]");
		words.add("Noxian Guillotine [A]");
		words.add("Lunar Rush  [A]");
		words.add("Moonfall [A]");
		words.add("Burning Agony [A]");
		words.add("League of Draven [A]");
		words.add("Spinning Axe [A]");
		words.add("Parallel Convergence [A]");
		words.add("Chronobreak [A]");
		words.add("Cocoon [A]");
		words.add("Rappel [A]");
		words.add("Shadow Walk [A]");
		words.add("Hate Spike [A]");
		words.add("Arcane Shift [A]");
		words.add("Trueshot Barrage [A]");
		words.add("Drain [A]");
		words.add("Playful - Trickster [A]");
		words.add("Chum the Waters [A]");
		words.add("Trial by Fire [A]");
		words.add("Parrrley [A]");
		words.add("Cannon Barrage [A]");
		words.add("Perseverance [A]");
		words.add("Decisive Strike [A]");
		words.add("Courage [A]");
		words.add("Judgment [A]");
		words.add("Demacian Justice [A]");
		words.add("Boomerang Throw [A]");
		words.add("Barrel Roll [A]");
		words.add("Body Slam [A]");
		words.add("Explosive Cask [A]");
		words.add("Buckshot [A]");
		words.add("Smoke Screen [A]");
		words.add("Collateral Damage [A]");
		words.add("Rampage [A]");
		words.add("Devastating Charge [A]");
		words.add("Onslaught of Shadows [A]");
		words.add("Transcendent Blades [A]");
		words.add("Eye of the Storm [A]");
		words.add("Monsoon [A]");
		words.add("Cataclysm [A]");
		words.add("Counter Strike [A]");
		words.add("Shock Blast [A]");
		words.add("Acceleration Gate [A]");
		words.add("Get Excited! [A]");
		words.add("Zap! [A]");
		words.add("Super Mega Death Rocket! [A]");
		words.add("Rend [A]");
		words.add("Requiem [A]");
		words.add("Riftwalk [A]");
		words.add("Bouncing Blades [A]");
		words.add("Death Lotus [A]");
		words.add("Intervention [A]");
		words.add("Void Spike [A]");
		words.add("Leap [A]");
		words.add("Living Artillery [A]");
		words.add("Distortion [A]");
		words.add("Mimic [A]");
		words.add("Sonic Wave [A]");
		words.add("Resonating Strike [A]");
		words.add("Solar Flare [A]");
		words.add("Iceborn [A]");
		words.add("Frozen Tomb [A]");
		words.add("Piercing Light [A]");
		words.add("The Culling [A]");
		words.add("Wild Growth [A]");
		words.add("Illumination [A]");
		words.add("Final Spark [A]");
		words.add("Double Strike [A]");
		words.add("Highlander [A]");
		words.add("Bullet Time [A]");
		words.add("Dark Binding [A]");
		words.add("Aqua Prison [A]");
		words.add("Tidal Wave [A]");
		words.add("Wither [A]");
		words.add("Pounce [A]");
		words.add("Paranoia [A]");
		words.add("Consume [A]");
		words.add("Blood Boil [A]");
		words.add("Spear Shot [A]");
		words.add("Grand Skyfall [A]");
		words.add("Powerball [A]");
		words.add("Slice-Dice [A]");
		words.add("Dominus [A]");
		words.add("Unseen Predator [A]");
		words.add("Battle Roar [A]");
		words.add("Bola Strike [A]");
		words.add("Broken Wings [A]");
		words.add("Valor [A]");
		words.add("Flamespitter [A]");
		words.add("Arcane Mastery [A]");
		words.add("Rune Prison [A]");
		words.add("Jack In The Box [A]");
		words.add("Shadow Dash [A]");
		words.add("Stand United [A]");
		words.add("Dragonborn [A]");
		words.add("Poison Trail [A]");
		words.add("Glory in Death [A]");
		words.add("Boomerang Blade [A]");
		words.add("Ricochet [A]");
		words.add("Crystal Spires [A]");
		words.add("Impale [A]");
		words.add("Crescendo [A]");
		words.add("Starcall [A]");
		words.add("Nevermove [A]");
		words.add("Torment [A]");
		words.add("Unleashed Power [A]");
		words.add("Thick Skin [A]");
		words.add("Frost Armor [A]");
		words.add("Arctic Assault [A]");
		words.add("Command: Dissonance [A]");
		words.add("Command: Protect [A]");
	}

	private void addChampions() {
		words.add("Champion");
		words.add("Aatrox");
		words.add("Ahri");
		words.add("Akali");
		words.add("Alistar");
		words.add("Amumu");
		words.add("Anivia");
		words.add("Annie");
		words.add("Ashe");
		words.add("Azir");
		words.add("Bard");
		words.add("Blicrank");
		words.add("Brand");
		words.add("Braum");
		words.add("Caitlyn");
		words.add("Cassiopeia");
		words.add("Cho'Gath");
		words.add("Corki");
		words.add("Darius");
		words.add("Diana");
		words.add("Dr. Mundo");
		words.add("Draven");
		words.add("Ekko");
		words.add("Elise");
		words.add("Evelynn");
		words.add("Eyreal");
		words.add("Fiddlesticks");
		words.add("Fiora");
		words.add("Galio");
		words.add("Gangplank");
		words.add("Garen");
		words.add("Gnar");
		words.add("Gragas");
		words.add("Graves");
		words.add("Heimerdinger");
		words.add("Irelia");
		words.add("Janna");
		words.add("Jarvan IV");
		words.add("Jax");
		words.add("Jayce");
		words.add("Kalista");
		words.add("Karma");
		words.add("Kassadin");
		words.add("katarina");
		words.add("Kayle");
		words.add("Kha'Yix");
		words.add("Kog'Maw");
		words.add("LeBlanc");
		words.add("Lee Sin");
		words.add("Leona");
		words.add("lissandra");
		words.add("Lulu");
		words.add("Lux");
		words.add("Malphite");
		words.add("Malzahar");
		words.add("Maokai");
		words.add("Master Yi");
		words.add("Mordekaiser");
		words.add("Morkgana");
		words.add("Nami");
		words.add("Nasus");
		words.add("Nautilus");
		words.add("Nidalee");
		words.add("Nunu");
		words.add("Olaf");
		words.add("Oriana");
		words.add("Pantheon");
		words.add("Poppy");
		words.add("Quinn");
		words.add("Rek'Sai");
		words.add("Renekton");
		words.add("Rengar");
		words.add("Riven");
		words.add("Rumble");
		words.add("Ryze");
		words.add("Shaco");
		words.add("Shen");
		words.add("Shyvana");
		words.add("Singed");
		words.add("Sion");
		words.add("Sivir");
		words.add("Sona");
		words.add("Soraka");
		words.add("Swain");
		words.add("Syndra");
		words.add("Tham Kench");
		words.add("Talon");
		words.add("Teemo");
		words.add("Thresh");
		words.add("Tristana");
		words.add("Trundle");
		words.add("Tryndamere");
		words.add("Twisted Fate");
		words.add("Udyr");
		words.add("Urgot");
		words.add("Varus");
		words.add("Vayne");
		words.add("Veigar");
		words.add("Vel'Koz");
		words.add("Viktor");
		words.add("Vladimir");
		words.add("Volibear");
		words.add("Warwick");
		words.add("Wukong");
		words.add("Xerath");
		words.add("Yasuo");
		words.add("Yorick");
		words.add("Zac");
		words.add("Zed");
		words.add("Ziggs");
		words.add("Zilean");
	}
}
