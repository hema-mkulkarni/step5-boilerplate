package com.stackroute.activitystream.config;

/*This class will contain the application-context for the application. 
 * Define the following annotations:
 * @Configuration - Annotating a class with the @Configuration indicates that the 
 *                  class can be used by the Spring IoC container as a source of 
 *                  bean definitions
 * @EnableTransactionManagement - Enables Spring's annotation-driven transaction management capability.
 * @EnableJpaRepositories -  Will scan the package of the annotated configuration class for Spring Data repositories by default.                
 * */
 
public class PersistenceJPAConfig{
 
   /*
    * Define the bean for EntityManagerFactory, LocalContainerEntityManagerFactoryBean gives full control over EntityManagerFactory configuration and is 
    * appropriate for environments where fine-grained customization is required.
    * Create a new LocalContainerEntityManagerFactoryBean object. We need to create this object because it creates the JPA EntityManagerFactory.
    */
 
 
    /*
	 * Define the bean for DataSource. In our application, we are using MySQL as the dataSource.
	 * To create the DataSource bean, we need to know:
	 * 1. Driver class name
	 * 2. Database URL
	 * 3. Username
	 * 4. Password
	 */
   
 
    /*
     *  Define the bean for Transaction Manager, PlatformTransactionManager implements the programmatic approach to implement transactions.
     */
   
    /*
     * Define the bean for PersistenceExceptionTranslationPostProcessor to enable exception translation. 
     */
    
    
    /*
     * Define all the Hinernate properties
     */
  
}
