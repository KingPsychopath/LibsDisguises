package me.libraryaddict.disguise.DisguiseTypes.Watchers;

import me.libraryaddict.disguise.DisguiseTypes.FlagWatcher;

public class ArrowWatcher extends FlagWatcher {

    protected ArrowWatcher(int entityId) {
        super(entityId);
        setValue(16, (byte) 0);
    }
    
    public void setMoving(boolean moving) {
        setValue(16, (byte) (moving ? 1 : 0));
    }
    
    public boolean isMoving() {
        return (Byte) getValue(16) == 1;
    }
    

}