package elib.repository.role;

import elib.entity.Role;

import java.util.List;

public interface RoleRepository {
  Role create(Role role);
  Role update(Role role);
  int delete(Role role);
  List<Role> findAll();
  Role find (Long id);
}
