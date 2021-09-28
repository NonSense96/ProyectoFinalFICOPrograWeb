package pe.com.fico.dao;

import java.util.List;
import java.util.Optional;

import pe.com.fico.entities.Rol;
import pe.com.fico.entities.User;
import pe.com.fico.entities.UserRol;

public interface IRolDao {

	Integer insert(Rol rol) throws Exception;

	Integer update(Rol rol) throws Exception;

	Integer delete(Rol rol) throws Exception;
	
	List<Rol> findAll()throws Exception;
	
	Optional<Rol> findById(Rol rol)throws Exception;
	
	Integer insertUserRole(List<UserRol>userRoles) throws Exception;
	
	List<UserRol> findUserRolesByUser(User user) throws Exception;
	
}