package com.template.springtemplatewithsecurity.dao.repository;

import com.bookmark.bookmarkallinone.dao.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
}
