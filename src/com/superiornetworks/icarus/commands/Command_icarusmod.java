package com.superiornetworks.icarus.commands;

import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandPermissions(source = SourceType.ANY, permission = "")
public class Command_icarusmod extends BukkitCommand
{

    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {

        // This is currently just crap to test command loading. I will make it do something more impressive at some point in the future, but for now it will have to do...
        commandSender.sendMessage("Welcome to the Icarus Project");
        commandSender.sendMessage("We are hoping to start something amazing!");
        commandSender.sendMessage("This is more of a test command for now, so just ignore it ;) !");
        return true;

    }

}
