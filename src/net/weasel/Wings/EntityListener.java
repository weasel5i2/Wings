package net.weasel.Wings;

import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;

public class EntityListener extends org.bukkit.event.entity.EntityListener 
{
	public static Wings plugin;
	
	public EntityListener( Wings instance ) 
	{
		plugin = instance;
	}

	public void onEntityDamage(EntityDamageEvent event)
	{
	    if ((event.getCause().equals(EntityDamageEvent.DamageCause.FALL)) && ((event.getEntity() instanceof Player)))
	    try 
	    {
	    	Player player = ((Player)event.getEntity());
	    	
	        if( Wings.isFlying(player) >= 0 ) event.setCancelled( true );
	    }
	    catch (Exception e) 
	    {
	    	// Do nothing..
	    }
	}
}
