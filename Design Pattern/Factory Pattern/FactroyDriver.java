package Factory_Pattern;

public class FactroyDriver {

	
	public static void main(String[] args) {
		
		
		
		ShapeFactory session = new ShapeFactory();
		
		Shape shape1 = session.getShape("circle");
		
		shape1.draw();
		
		Shape shape2 = session.getShape("square");
		
		shape2.draw();
		
		Shape shape3 = session.getShape("rectangle");
		
		shape3.draw();
		
	}
}
