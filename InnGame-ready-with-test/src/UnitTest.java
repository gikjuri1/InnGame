import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {

    @org.junit.jupiter.api.Test
    void getWorld() {
        Unit u = new Unit("John");
        u.setWorld("Earth");
        Assert.assertEquals(u.getWorld(),"Earth");
    }

    @org.junit.jupiter.api.Test
    void checkUndo() throws NothingToUndo {

        Unit u = new Unit("Qwerty");
        String oldName = u.getName();
        u.setName("ASDFG");
        u.undo();
        Assert.assertEquals(oldName, u.getName());
    }
}