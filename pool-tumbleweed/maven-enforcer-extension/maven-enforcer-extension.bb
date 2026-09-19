SUMMARY = "Maven Enforcer Extension"
DESCRIPTION = "The Enforcer Extension provides a way to globally define rules without \
making use of pom inheritence. This way you don't have to adjust the \
pom.xml, but you can enforce a set of rules."
LICENSE = "Apache-2.0"

PV = "3.6.3"

RPM_NAME = "maven-enforcer-extension-3.6.3-1.2.noarch.rpm"
RPM_HASH = "be93f92e3d239431126bb7246501d4d39e6730f9018aba25be536eca21073e81297c8347b4f6f2d3f14da219fb711bf71a082eadb2a0605e2b384288e62528da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-enforcer-extension \
mvn-org.apache.maven.extensions-maven-enforcer-extension \
mvn-org.apache.maven.extensions-maven-enforcer-extension-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
