package uavProject;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Main {

	public static void main(String[] args) {

		try {
			NodeList devicesList = ConfigParser.parseConfigFile("c:/uav.xml");

			for (int i = 0; i < devicesList.getLength(); i++) {
				Element currentDevice = (Element) devicesList.item(i);
				String currentDeviceName = currentDevice.getAttribute("name");

				System.out.println(currentDeviceName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
