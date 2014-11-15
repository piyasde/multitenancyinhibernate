Multitenancy in Hibernate (with Hibernate 4.3.7 and PostgreSql 9.3.1)
======================================================================

This is a complete working sample for Multitenancy in Hibernate and PostGreSql.
 
Our approach towards multitenancy is - to have separate schema for each tenant in same database.
 
Version used -
==============
Hibernate 4.3.7 
PostGreSql 9.3.1
 
To show the proof of concept -
 
We had made 2 separate schema in same database and inserted separate dummy data in the tables.
We had called the method to show the data from the table, where the schemaname is given as input parameter.
 



