package sk.hibernate.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import sk.hibernate.dao.CustomerDao;
import sk.hibernate.dao.impl.CustomerDaoImpl;
 
@WebServlet("/customer/delete")
public class CustomerDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CustomerDeleteController() {
		// Do Nothing
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String custId = request.getParameter("custId");

		if (custId == "" || custId == null)
			request.getRequestDispatcher("/").forward(request, response);
		else {
			Long id = Long.parseLong(custId);
			CustomerDao customerDao = CustomerDaoImpl.getInstance();

			customerDao.deleteCustomer(id);

			response.sendRedirect(request.getContextPath() + "/");
		}
	}
}
