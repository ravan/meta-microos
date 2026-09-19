SUMMARY = "StringTemplate Maven Plugin"
DESCRIPTION = "This plugin allows to execute StringTemplate template files during build. \
The values for templates can come from static declarations or from a Java \
class specified to be executed."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "string-template-maven-plugin-1.1-5.6.noarch.rpm"
RPM_HASH = "9e2335b0072c4ed88c319ba8bde8cc4005da0f3b1172787d08dc4e61ce3f904ba4e833e944a0c1b2725a261b54d560d81d298326718b6dca49c95ee8acbb7d7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.webguys-string-template-maven-plugin \
mvn-com.webguys-string-template-maven-plugin-pom- \
string-template-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.antlr-ST4 \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.eclipse.aether-aether-util \
mvn-org.twdata.maven-mojo-executor"

inherit rpm
