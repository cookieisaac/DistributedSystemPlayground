#Install Java JDK
yum install java-1.8.0-openjdk-devel.x86_64
java -version
javac -version

#Install Maven
wget http://shinyfeather.com/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz
tar xvf apache-maven-3.3.9-bin.tar.gz
export M2_HOME=`pwd`/apache-maven-3.3.9
export M2=$M2_HOME/bin
export PATH=$M2:$PATH
mvn -version

#Install Kompics
git clone git://github.com/kompics/kompics.git
cd kompics
mvn clean install

#Download, Compile and Run First Kompics Project: Hello World
wget http://kompics.sics.se/current/_downloads/helloworld.zip
unzip helloworld.zip
cd helloworld
mvn clean compile
mvn exec:java -Dexec.mainClass="se.sics.test.Main"