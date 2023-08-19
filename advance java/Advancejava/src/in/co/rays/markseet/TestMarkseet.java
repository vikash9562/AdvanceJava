package in.co.rays.markseet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.List;

import in.co.rays.test.TestUpdate;

public class TestMarkseet {
	
	public static void main(String[] args) throws Exception {
		
		//testAdd();
		//testUpdate();
		//testDelete();
		findByRoll();
		//testsearch();
		
		
	}

	private static void testsearch()throws Exception {
		
			MarkseetBean bean = new MarkseetBean();
			
		//	bean.setName("j");
			//bean.setId(3);
		//	bean.setRollno(838);
			//bean.setPhysics(78);
	//		bean.setChemistry(77);
		//	bean.setMaths(76);
			
			MarkseetModel model = new MarkseetModel();
			List list =	model.search(bean, 1, 4);
			
			Iterator it = list.iterator();
			
			while (it.hasNext()) {
				
				bean = (MarkseetBean)it.next();
				System.out.print(bean.getId());
				System.out.print("\t"+ bean.getName());
				System.out.print("\t"+bean.getRollno());
				System.out.print("\t"+bean.getPhysics());
				System.out.print("\t"+bean.getChemistry());
				System.out.println("\t"+bean.getMaths());
			}
				
		}

	private static void findByRoll() throws Exception {
		MarkseetModel Model = new MarkseetModel();
		
		MarkseetBean bean = Model.findByRoll(112);
		
		if(bean!=null) {
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getRollno());
		System.out.println(bean.getPhysics());
		System.out.println(bean.getChemistry());
		System.out.println(bean.getMaths());
		
		}else {
			System.out.println("roll_no not exit");
		}
	}

	private static void testDelete() throws Exception {
		
		MarkseetModel Model = new MarkseetModel();
		
		Model.testDelete(7);
		
	}

	private static void testUpdate() throws Exception {
		
		MarkseetBean bean = new MarkseetBean();
		
		bean.setId(6);
		bean.setName("jatin");
		bean.setRollno(488);
		bean.setPhysics(87);
		bean.setChemistry(55);
		bean.setMaths(88);
		
		MarkseetModel Model = new MarkseetModel();
		
		Model.testUpdate(bean);
		
	}

	private static void testAdd() throws Exception{
		
		MarkseetBean bean = new MarkseetBean();
		
		//bean.setId(6);
		bean.setName("deep");
		bean.setRollno(766);
		bean.setPhysics(98);
		bean.setChemistry(37);
		bean.setMaths(57);
		
		MarkseetModel Model = new MarkseetModel();
		Model.Add(bean);
		
		
			
	}
	
		
}


