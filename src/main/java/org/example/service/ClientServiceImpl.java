package org.example.service;

import org.example.domain.Book;
import org.example.repository.book.ReadBookRepository;
import org.example.repository.database.DatabaseConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl {

    @Autowired
    private ReadBookRepository bookRepository;

    @Autowired
    @Qualifier("oracleDatabaseConnection")
    private DatabaseConnection connectionService;

    public List<Book> connectDatabase() {
        return null;
//        Object connection = connectionService.establishConnection();
//        List<Object> clients =  connection.executeSelectStatement("");
//        connectionService.closeConnection(connection);
//        return clients;
    }
}
