//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.10.13 um 08:05:59 PM CEST 
//


package com.consol.citrus.samples.todolist.soap.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.consol.citrus.samples.todolist.soap.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.consol.citrus.samples.todolist.soap.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTodoListResponse }
     * 
     */
    public GetTodoListResponse createGetTodoListResponse() {
        return new GetTodoListResponse();
    }

    /**
     * Create an instance of {@link GetTodoListResponse.List }
     * 
     */
    public GetTodoListResponse.List createGetTodoListResponseList() {
        return new GetTodoListResponse.List();
    }

    /**
     * Create an instance of {@link AddTodoEntryRequest }
     * 
     */
    public AddTodoEntryRequest createAddTodoEntryRequest() {
        return new AddTodoEntryRequest();
    }

    /**
     * Create an instance of {@link AddTodoEntryResponse }
     * 
     */
    public AddTodoEntryResponse createAddTodoEntryResponse() {
        return new AddTodoEntryResponse();
    }

    /**
     * Create an instance of {@link GetTodoListRequest }
     * 
     */
    public GetTodoListRequest createGetTodoListRequest() {
        return new GetTodoListRequest();
    }

    /**
     * Create an instance of {@link GetTodoListResponse.List.TodoEntry }
     * 
     */
    public GetTodoListResponse.List.TodoEntry createGetTodoListResponseListTodoEntry() {
        return new GetTodoListResponse.List.TodoEntry();
    }

}
