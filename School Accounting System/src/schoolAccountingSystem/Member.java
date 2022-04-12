package schoolAccountingSystem;

abstract class Member {

	protected String name;
	protected int id;
	
	public Member(String name, int id) {
		this.name=name;
		this.id=id;
	}
	abstract String getName();
	abstract int getId();
}
