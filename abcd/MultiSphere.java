
public class MultiSphere {
	// now a main method to test everyrhing
	  public static void main(String[] args) {
	  // lets create 2 sphere objects by "instantiating" the class Sphere
	  Sphere sphere1 = new Sphere(1.0);
	  Sphere sphere2 = new Sphere(2.0);
	  // display the surface and the volume
	  System.out.println("Sphere 1:  Diameter: " + sphere1.getDiameter() + " Surface: " + sphere1.getSurface() + " Volume: " + sphere1.getVolume());
	  System.out.println("Sphere 2:  Diameter: " + sphere2.getDiameter() + " Surface: " + sphere2.getSurface() + " Volume: " + sphere2.getVolume());
	  }
	}

