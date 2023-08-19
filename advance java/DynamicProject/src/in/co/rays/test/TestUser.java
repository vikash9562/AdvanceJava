package in.co.rays.test;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;


public class TestUser {

	public static void main(String[] args) throws Exception {

		// testAdd();

		testUpdate();

		//testSearch();

	}

	private static void testSearch() throws Exception {
		
		String dob = "1997-08-09";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();
		
		bean.setDob(sdf.parse(dob));

		UserModel model = new UserModel();

		List list = model.search(bean, 0, 0);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (UserBean) it.next();

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFist_name());
			System.out.print("\t" + bean.getLast_name());
			System.out.print("\t" + bean.getLogin_id());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.println("\t" + bean.getAddress());

		}

	}

	private static void testUpdate() throws Exception {

		UserModel model = new UserModel();

		UserBean bean = model.findByPk(2);

		if (bean != null) {

			bean.setFist_name("sachin");
			bean.setLast_name("gupta");
			bean.setAddress("bhopal");
			bean.setLogin_id("909090");

			model.update(bean);

			System.out.println("User Exist & Updated");

		} else {
			System.out.println("User not exist...!!!");
		}

	}

	private static void testAdd() throws Exception {

		String dob = "1995-07-08";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();
		bean.setId(2);
		bean.setFist_name("kapil");
		bean.setLast_name("ahir");
		bean.setLogin_id("kapil@gmail.com");
		bean.setPassword("1234567");
		bean.setDob(sdf.parse(dob));
		bean.setAddress("bhopal");

		UserModel model = new UserModel();
		model.add(bean);

	}

}

