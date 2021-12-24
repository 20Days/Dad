package me.Days;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;
import org.bukkit.World;

public class PlayerListener implements Listener
{
	
	
	public PlayerListener(Dad plugin) {plugin.getServer().getPluginManager().registerEvents(this, plugin);}
	
	@EventHandler
	public void eggThrown(PlayerEggThrowEvent e) {Dad.addEgg();}
	
	@EventHandler
	public void playerJoining(PlayerJoinEvent e) {Dad.playerOnlineCount++;}
	
	@EventHandler
	public void playerLeaving(PlayerQuitEvent e)
	{
		if (Dad.playerOnlineCount >= 1)
			Dad.playerOnlineCount--;
	}
	
	@EventHandler
	public void playerKicked(PlayerKickEvent e)
	{
		if (Dad.playerOnlineCount >= 1)
			Dad.playerOnlineCount--;
	}
	
	@EventHandler
	public void enterBed(PlayerBedEnterEvent e)
	{
		Dad.playerSleepingCount++;
		
		World world = e.getPlayer().getWorld();
		//Player player = e.getPlayer();
		
		if((world.getTime() >= 12600 && world.getTime() <= 23000) || world.isThundering() || world.hasStorm())
		{
			if(Dad.canTurnDay())
			{
		        world.setTime(1000);
		        world.setStorm(false);
		        world.setThundering(false);
		        Dad.playerSleepingCount = 0;
			}	
		}
	}
	
	@EventHandler
	public void leftBed(PlayerBedLeaveEvent e)
	{
		if (Dad.playerSleepingCount >= 1)
			Dad.playerSleepingCount--;
	}
}
