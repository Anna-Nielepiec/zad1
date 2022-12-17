package org.example.repository.database;

import org.example.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySqlDatabaseConnection extends DefaultDatabaseConnection {

//    @Autowired
//    public MySqlDatabaseConnection(BookServiceImpl bookService) {
//        super(bookService);
//    }
//
//    @Override
//    public Object establishConnection() {
//        Object connection = new MySqlConnection();
//        connecition.setHost("mySqlDatabaseHost");
//        connecition.setPort("port");
//        connecition.setUsername("username");
//        connecition.setPassword("password");
//        return connecition.connect();
//    }
//
//    @Override
//    public Boolean closeConnection(Object connection) {
//        connection.killTransaction();
//        return super.closeConnection(connection);
//    }
}

//private abstract class DefaultDatabaseConnection implements DatabaseConnection {
//
//    private BookServiceImpl bookService;
//
//    public DefaultDatabaseConnection(BookServiceImpl bookService) {
//        this.bookService = bookService;
//    }
//
//    @Override
//    public Boolean closeConnection(Object connection) {
//        bookService.findAllBooks();
//        return connection.close();
//    }
//}
//
//public interface DatabaseConnection {
//
//    Object establishConnection();
//
//    Boolean closeConnection(Object connection);
//}
//
//
//
//
//public interface DatabaseConnection {
//
//    Object establishConnection();
//
//    default Boolean closeConnection(Object connection) {
//        return connection.close();
//    }
//}