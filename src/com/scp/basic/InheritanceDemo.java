package com.scp.basic;

class InheritanceDemo {
	int id;
	String name;

	public InheritanceDemo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof InheritanceDemo) {
			InheritanceDemo idemo = (InheritanceDemo) object;
			if (this.id == idemo.id && this.name.equals(idemo.name))// this also not required just for no confusion
			{
				return true;
			}
			return false;
		}
	return false;
	}

	/*
	 * @Override public boolean equals(Object object) { try{ int id= this.id; String
	 * name= this.name; InheritanceDemo idemo= (InheritanceDemo) object; int
	 * objectId= idemo.id; String objectName= idemo.name; if(id==objectId &&
	 * name.equals(objectName)) { return true; } return false; } catch (Exception e)
	 * { return false; } }
	 */

	public static void main(String[] args) {
		InheritanceDemo a = new InheritanceDemo(101, "amar");
		InheritanceDemo b = new InheritanceDemo(101, "amar");

		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a.equals("amar"));
		System.out.println(a.equals(null));
	}

}
