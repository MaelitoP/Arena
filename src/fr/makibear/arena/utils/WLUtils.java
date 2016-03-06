package fr.makibear.arena.utils;

import org.bukkit.entity.Player;

import fr.makibear.arena.WaitingLine;

public class WLUtils 
{
	public static WaitingLine getByPlayer(Player p)
	{
		for(WaitingLine wl : WaitingLine.getWaitingLines())
		{
			if(wl.getPlayers().contains(p))
				return wl;
		}
		return null;
	}
	
	public static boolean isIn(Player p)
	{
		return getByPlayer(p) != null;
	}
	
	public static WaitingLine get()
	{
		for(WaitingLine wl : WaitingLine.getWaitingLines())
			return wl;
		return null;
	}
}
