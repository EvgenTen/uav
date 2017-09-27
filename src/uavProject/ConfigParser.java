package uavProject;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class ConfigParser {

	public static NodeList parseConfigFile(String filename) throws Exception {

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();

		File file = new File(filename);
		Document doc = db.parse(file);

		NodeList devicesList = doc.getElementsByTagName("device");
		return devicesList;
	}

}
