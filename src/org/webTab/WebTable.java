package org.webTab;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\nandhini\\eclipse-workspace\\Selenium\\Driver\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.techlistic.com/p/demo-selenium-practice.html");
		List<WebElement> Table=driver.findElements(By.xpath("(//table)"));
		for(int i=Table.size()-1;i<Table.size();i++) {
			WebElement Tab=Table.get(i);
			WebElement Body=Tab.findElement(By.tagName("tbody"));
			
			List<WebElement> Row=Body.findElements(By.tagName("tr"));
		for(int j=0;j<Row.size();j++) {
			if (j==2) {
	         WebElement Row1=Row.get(j);
			List<WebElement> Data=Row1.findElements(By.tagName("td"));
		for(int k=0;k<Data.size();k++) {
			//if (k==3) {
				
			WebElement Data1=Data.get(k);
			String Text=Data1.getText();
			System.out.println(Text);
			//}
		}
				}
			}
		}
		
	}

} 
	
