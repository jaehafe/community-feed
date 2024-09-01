package org.jh.community_feed.user.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jh.community_feed.common.repository.entity.TimeBaseEntity;

@Entity
@Table(name = "community_user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity extends TimeBaseEntity {

    @Id
    private Long id;
}
