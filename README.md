

mvn clean compile   
mvn exec:java -Dexec.mainClass="com.hand.Number1" -Dexec.args="arg0 arg1 arg2"
mvn clean compile  
mvn  exec:java -Dexec.mainClass="com.hand.Number2" -Dexec.args="arg0 arg1 arg2"
mvn clean compile  
mvn exec:java -Dexec.mainClass="com.hand.Number3" -Dexec.args="arg0 arg1 arg2"
mvn clean compile  
mvn exec:java -Dexec.mainClass="com.hand.Number3" -Dexec.args="arg0 arg1 arg2"
