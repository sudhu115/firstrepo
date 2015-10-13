class Sphere {
   // what does a sphere need to have to define it ?
   // a Diameter so lets define it
   double diameter;

   // now we need to define a constructor to define our sphere object
   Sphere(double d) {
	  diameter = d;
   }
   // a getter method to get the Sphere diameter
   double getDiameter() {
	  return diameter;
   }
   // now that our spere exists lets have methods to get Volume and Area
   // Volume: formula if I remember well from my high school is 4/3 Pi * R3
   double getVolume() {
	  double radius = diameter / 2.0;
	  double volume = 4.0 / 3.0 * Math.PI * radius * radius * radius;
	  return volume;
   }
   // Surface: formula if I remember weel from my hight choole is 4 Pi * R2
   double getSurface() {
	 double radius = diameter / 2.0;
	 double surface = 4.0 * Math.PI * radius * radius;
	 return surface;
  }
}

  
