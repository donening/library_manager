package com.library.cs.library.reposity;

import com.library.cs.library.entity.BookInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 张越
 * @apiNote the jpa reposity of table book
*/
public interface BookReposity extends JpaRepository<BookInfo, String> {
    
}
