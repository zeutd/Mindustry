package mindustry.mod;

import arc.files.*;
import arc.util.*;
import mindustry.*;

public abstract class Mod{

    /** @return the folder where configuration files for this mod should go.*/
    public Fi getConfigFolder(){
        return Vars.mods.getConfigFolder(this);
    }

    /** @return the config file for this plugin, as the file 'mods/[plugin-name]/config.json'.*/
    public Fi getConfig(){
        return Vars.mods.getConfig(this);
    }

    /** Called after all plugins have been created and commands have been registered.*/
    public void init(){

    }

    /** Called on clientside mods. You can load content here. */
    public void loadContent(){

    }

    /** Called on clientside mods after all mods loadContent() was called. You can load content here. */
    public void afterLoadContent(){

    }

    /** Register any commands to be used on the server side, e.g. from the console. */
    public void registerServerCommands(CommandHandler handler){

    }

    /** Register any commands to be used on the client side, e.g. sent from an in-game player. */
    public void registerClientCommands(CommandHandler handler){

    }
}
