package com.craftthatblock.ctbapi;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * @author CraftThatBlock
 */
public class EventBase extends Event {
	private static final HandlerList handlers = new HandlerList();

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
