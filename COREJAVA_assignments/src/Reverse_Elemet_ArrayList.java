import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

public class Reverse_Elemet_ArrayList {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Fortuner");
		l1.add("Audi");
		l1.add("XUV 700");
		l1.add("Seltoz");

		System.out.println("List Before Revering : " + l1);
		Collections.reverse(l1);
		System.out.println("List After Reversing : " + l1);

	}
}
