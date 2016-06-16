package cn.edu.hfut.xcsoft.passport.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.edu.hfut.xcsoft.passport.model.User;

@Repository
@Transactional
public class UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(User user) {
		sessionFactory.getCurrentSession().merge(user);
	}
	
	public User validUser(String account, String password) {
		return (User) sessionFactory.getCurrentSession()
				.createQuery("FROM User u WHERE u.email = :email AND u.password = :password")
				.setParameter("email", account)
				.setParameter("password", password)
				.uniqueResult();
	}
}
