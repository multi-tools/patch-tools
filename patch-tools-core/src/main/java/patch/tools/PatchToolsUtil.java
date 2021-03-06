/*
 * 	Copyright PatchTools Contributors.
 *
 * 	PatchTools is licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package patch.tools;

public class PatchToolsUtil {

	public static Class[] getArgumentTypes(Object[] objects) {
		if (objects == null) {
			return null;
		}

		Class[] constructorTypes = new Class[objects.length];
		for (int i = 0; i < constructorTypes.length; i++) {
			constructorTypes[i] = objects[i].getClass();
		}
		return constructorTypes;
	}

}
