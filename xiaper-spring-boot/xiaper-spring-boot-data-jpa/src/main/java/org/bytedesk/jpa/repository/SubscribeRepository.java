package org.bytedesk.jpa.repository;

import org.bytedesk.jpa.model.Subscribe;
import org.bytedesk.jpa.model.User;
import org.bytedesk.jpa.model.Thread;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author bytedesk.com
 */
@Repository
public interface SubscribeRepository extends JpaRepository<Subscribe, Long>, JpaSpecificationExecutor {

    List<Subscribe> findByUser(User user);

    Optional<Subscribe> findFirstByThreadAndUser(Thread thread, User user);

    @Transactional
    void deleteByThread(Thread thread);

    @Transactional
    void deleteByUser(User user);

}