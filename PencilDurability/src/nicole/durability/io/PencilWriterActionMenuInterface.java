package nicole.durability.io;

import java.util.*;

import nicole.durability.actions.*;

public interface PencilWriterActionMenuInterface {

	List<MenuAction> getMenuActions();

	boolean openMainMenuWithQuitOption();

}
