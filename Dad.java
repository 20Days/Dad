package me.Days;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Dad extends JavaPlugin
{
	public void onEnable()
	{
		getLogger().info("8w======D");
		getLogger().info("8=w=====D");
		getLogger().info("8==w====D");
		getLogger().info("8===w===D");
		getLogger().info("8====w==D");
		getLogger().info("8=====w=D");
		getLogger().info("8======wD");
		getLogger().info("8=======D~~~~~~~~~~~~~~~~ Daddy is turned on!");
		new PlayerListener(this);
	}
	
	public void onDisable() {getLogger().info("----------Daddy is turned off!----------");}
	
	public static int eggCount = 0;
	public static int playerOnlineCount = 0;
	public static int playerSleepingCount = 0;
	
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{   
		if(cmd.getName().equalsIgnoreCase("smite") && sender instanceof Player)
		{
			if(args.length == 1)
			{
				Player target = sender.getServer().getPlayer(args[0]);
				
				Player player = (Player) sender; 
				
				if (player.isOp())
				{
					if (target == null) 
				    {
				        sender.sendMessage(args[0] + " is not online or you did not put one!");
				        return false;
				    }
					else 
					{
						player.getWorld().strikeLightning(target.getLocation());
					}
				}
				else
					player.sendMessage("Yeah... so you dont got perms to this... so you cant..");
			}
			else
			 sender.sendMessage("Need to put a target dipshit");
			return true;
		}
		
		if(cmd.getName().equalsIgnoreCase("explode") && sender instanceof Player)
		{
			if(args.length == 1)
			{
				Player target = sender.getServer().getPlayer(args[0]);
				
				Player player = (Player) sender; 
				
				if (player.isOp())
				{
					if (target == null) 
				    {
				        sender.sendMessage(args[0] + " is not online or you did not put one!");
				        return false;
				    }
					else 
					{
						player.getWorld().createExplosion(target.getLocation(), 0);
					}
				}
				else
					player.sendMessage("Yeah... so you dont got perms to this... so you cant..");
			}
			else
			 sender.sendMessage("Need to put a target dipshit");
			return true;
		}
		
		if(cmd.getName().equalsIgnoreCase("hidefrom") && sender instanceof Player)
		{
			if(args.length == 1)
			{
				Player target = sender.getServer().getPlayer(args[0]);
				
				Player player = (Player) sender; 
				
				if (player.isOp())
				{
					if (target == null) 
				    {
				        sender.sendMessage(args[0] + " is not online or you did not put one!");
				        return false;
				    }
					else 
					{
						target.hidePlayer(player);
					}
				}
				else
					player.sendMessage("Yeah... so you dont got perms to this... so you cant..");
			}
			else
			 sender.sendMessage("Need to put a target dipshit");
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("vanish") && sender instanceof Player)
		{
			if(args.length == 1)
			{
				Player target = sender.getServer().getPlayer(args[0]);
				
				Player player = (Player) sender; 
				
				if (player.getName() == "20Days")
				{
					
				}
			}
		}
		
		if(cmd.getName().equalsIgnoreCase("revealto") && sender instanceof Player)
		{
			if(args.length == 1)
			{
				Player target = sender.getServer().getPlayer(args[0]);
				
				Player player = (Player) sender; 
				
				if (player.isOp())
				{
					if (target == null) 
				    {
				        sender.sendMessage(args[0] + " is not online or you did not put one!");
				        return false;
				    }
					else 
					{
						if(target.toString().equalsIgnoreCase("all"))
						{
							for (Player p : Bukkit.getOnlinePlayers()) 
								if (p.getWorld() == player.getPlayer().getWorld())
									if(p != player)
										p.showPlayer(player);
						}
						else
							target.showPlayer(player);
					}
					
				}
				else
					player.sendMessage("Yeah... so you dont got perms to this... so you cant..");
			}
			else
			 sender.sendMessage("Need to put a target dipshit");
			return true;
		}
		
		if(cmd.getName().equalsIgnoreCase("igniteplayer") && sender instanceof Player)
		{
			if(args.length == 1)
			{
				Player target = sender.getServer().getPlayer(args[0]);
				
				Player player = (Player) sender; 
				
				if (player.isOp())
				{
					if (target == null) 
				    {
				        sender.sendMessage(args[0] + " is not online or you did not put one!");
				        return false;
				    }
					else 
					{
						target.setFireTicks(1000);
					}
				}
				else
					player.sendMessage("Yeah... so you dont got perms to this... so you cant..");
			}
			else
			 sender.sendMessage("Need to put a target dipshit");
			return true;
		}
		
		if(cmd.getName().equalsIgnoreCase("killplayer") && sender instanceof Player)
		{
			if(args.length == 1)
			{
				Player target = sender.getServer().getPlayer(args[0]);
				
				Player player = (Player) sender; 
				
				if (player.isOp())
				{
					if (target == null) 
				    {
				        sender.sendMessage(args[0] + " is not online or you did not put one!");
				        return false;
				    }
					else 
					{
						target.setHealth(0.0D);
					}
				}
				else
					player.sendMessage("Yeah... so you dont got perms to this... so you cant..");
			}
			else
			 sender.sendMessage("Need to put a target dipshit");
			return true;
		}
		
		if(cmd.getName().equalsIgnoreCase("cunt") && sender instanceof Player && args.length == 1)
		{
			Player target = sender.getServer().getPlayer(args[0]);
			
			Player player = (Player) sender; 
			
			if (player.isOp())
			{
				if (target == null) 
			    {
			        sender.sendMessage(args[0] + " is not online or you did not put one!");
			        return false;
			    }
				else 
				{
					target.setDisplayName("Cunt");
					target.setPlayerListName("Cunt");
					target.setCustomName("Cunt");
					target.setCustomNameVisible(true);
				}
			}
			else
				player.sendMessage("Yeah... so you dont got perms to this... so you cant..");
			
			return true;
		}
		
		if (cmd.getName().equalsIgnoreCase("cuntpunch") && sender instanceof Player && args.length == 1)
		{
			Player target = sender.getServer().getPlayer(args[0]);
			
			Player player = (Player) sender;
			
			if (player.isOp())
			{
				if (target == null) 
			    {
			        sender.sendMessage(args[0] + " is not online or you did not put one!");
			        return false;
			    }
				else
					target.kickPlayer("Your cunt has been punched really hard! And it hurt a little tbh. ;-;");
			}
			else
				player.sendMessage("Yeah... so you dont got perms to this... so you cant..");
				
			
			return true;
		}
		
		if (cmd.getName().equalsIgnoreCase("eggcount") && sender instanceof Player)
		{
			Player player = (Player) sender;
			
			player.sendMessage("Number of eggs thrown is: " + eggCount);
			
			return true;
		}
		
		if (cmd.getName().equalsIgnoreCase("test") && sender instanceof Player)
		{
			Player player = (Player) sender;
			World world = player.getPlayer().getWorld();
			
			if (player.isOp())
			{
				player.sendMessage("Player Online Count is: " + playerOnlineCount);
				player.sendMessage("Player Sleeping Count is: " + playerSleepingCount);
				player.sendMessage("-=-=-=-=-=-=-=-=-=Online Players=-=-=-=-=-=-=-=-=-");
				for (Player p : Bukkit.getOnlinePlayers()) 
					if (p.getWorld() == player.getPlayer().getWorld())
			            player.sendMessage(p.getName());
				player.sendMessage("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				player.sendMessage("World Time is: " + world.getTime());
				player.sendMessage("World Full Time is: " + world.getFullTime());

			}
			else
			{
				player.sendMessage("Fuck off kid, you dont got the perms for this shit!");
			}
			
			return true;
		}
		
		if(cmd.getName().equalsIgnoreCase("shrug") && sender instanceof Player)
		{
			Player player = (Player) sender;
			
			for (Player p : Bukkit.getOnlinePlayers())
				if (p.getWorld() == player.getPlayer().getWorld())
					p.sendMessage("<" + player.getName() + ">" + "¯\\_('u')_/¯");
		}
		return false;
	}
	
	public static void addEgg() {eggCount++;}

	public static String getEggCount() {return String.valueOf(eggCount);}
	
	public static Boolean canTurnDay()
	{
		double idk = (double)playerSleepingCount/playerOnlineCount;   //gets % of people asleep
		if(idk >= .50)         //if there is 50% or more sleeping time is set to day (need to add slight delay to make 
			return true;       // it seem more legitimate lol)
		else
			return false;
	}	
}
