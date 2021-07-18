module brookinfraestructure{
    requires java.sql;
    requires org.slf4j;
    requires lombok;
    requires bookApplication;
    requires book;

    exports bookinfraestructure.repository;
    exports bookinfraestructure;

}