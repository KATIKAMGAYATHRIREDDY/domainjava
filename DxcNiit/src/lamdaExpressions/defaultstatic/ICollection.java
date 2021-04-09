package lamdaExpressions.defaultstatic;

public interface ICollection {
	void add();
	void remove();
	default  void addAll() {System.out.println("adding all default method");}
	default void removeAll() {System.out.println("removing all default method");}
}
