package collection.injection.xml;

import java.util.List;

public class ListInjection {
    List<String> configFileList;

	/*public void setConfigFileList(List<String> configFileList) {
		this.configFileList = configFileList;
		System.out.println(configFileList+"  is injected");
		System.out.println("Injected list type is :: "+configFileList.getClass().getName());
	}*/
    
    public ListInjection(List<String> configFileList) {
		this.configFileList = configFileList;
		System.out.println(configFileList+"  is injected");
		System.out.println("Injected list type is :: "+configFileList.getClass().getName());
	}
    
    
    public void processConfigFiles() {
    	System.out.println("Processing ....."+configFileList.get(0));
    }

	
    
}
