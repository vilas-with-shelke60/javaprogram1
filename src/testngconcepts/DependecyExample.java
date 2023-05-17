package testngconcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependecyExample {
   @Test
	void startCar() {
		System.out.println("Car started");
		Assert.fail();//driver car depends on start car
		              //if first method fail then all method is failed becz it is dependence on 1 st method
	}
   @Test(dependsOnMethods={"startCar"})
  	void driveCar() {//drive car is depends on start car
  		System.out.println("Car driving");
  	}
   @Test(dependsOnMethods={"driveCar"})
  	void stopCar() {
  		System.out.println("Car stopped");
  	}
   @Test(dependsOnMethods={"driveCar" ,"stopCar"}, alwaysRun = true)
  	void parkCar() {//we can add multiple dependency
  		System.out.println("Car parked");
  	}
	//depends one to another
}
