SUMMARY = "Java-based testing framework"
DESCRIPTION = "TestNG is a testing framework inspired from JUnit and NUnit but introducing \
some new functionality, including flexible test configuration, and \
distributed test running.  It is designed to cover unit tests as well as \
functional, end-to-end, integration, etc."
LICENSE = "Apache-2.0"

PV = "7.10.2"

RPM_NAME = "testng-7.10.2-1.8.noarch.rpm"
RPM_HASH = "219e0c972eec8079ac31c7aa1d06de936e29c16e5359b631dc8a283f538f995d584f58ae6625619b36e8c4e8d12d4fa684228c4152e87c675908dbe35da657da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.testng-testng \
mvn-org.testng-testng--jdk15- \
mvn-org.testng-testng-pom- \
mvn-org.testng-testng-pom-jdk15- \
osgi-org.testng \
testng"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.beust-jcommander \
mvn-org.slf4j-slf4j-api"

inherit rpm
