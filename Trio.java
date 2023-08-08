package assesment3;
interface menuItem{
	
}
class sandwich implements menuItem{
	String name;
	double price;
	
	sandwich(String name, double price){
		this.name = name;
		this.price=price;
	}
}
class salad implements menuItem{
	String name;
	double price;
	
	salad(String name, double price){
		this.name = name;
		this.price=price;
	}
}
class drink implements menuItem{
	String name;
	double price;
	
	drink(String name, double price){
		this.name = name;
		this.price=price;
	}
}
class Trio implements menuItem{
	String name;
	double price;
	
	Trio(sandwich sand, salad sal, drink d){
		this.name = sand.name+"/"+sal.name+"/"+d.name;
		if(sand.price>sal.price && sand.price>d.price) {
			this.price+=sand.price;
			if(sal.price>d.price) {
				this.price+=sal.price;
			}else {
				this.price+=d.price;
			}
		}else if(sal.price>d.price) {
			this.price+=sal.price;
			if(sand.price>d.price) {
				this.price+=sand.price;
			}else {
				this.price+=d.price;
			}
		}else {
			this.price+=d.price;
			if(sal.price>sand.price) {
				this.price+=sal.price;
			}else {
				this.price+=sand.price;
			}
		}
	}
	
	public static void main(String args[]) {
		sandwich s = new sandwich("cheese",10.0);
		salad sd = new salad("tomato",7.0);
		drink d = new drink("choco",2.0);
		Trio t = new Trio(s,sd,d);
		System.out.println(t.name);
		System.out.println(t.price);
	}
	
}



