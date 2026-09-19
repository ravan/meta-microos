SUMMARY = "Web Services Description Language Toolkit for Java"
DESCRIPTION = "The Web Services Description Language for Java Toolkit (WSDL4J) allows \
the creation, representation, and manipulation of WSDL documents \
describing services.  This codebase will eventually serve as a \
reference implementation of the standard created by JSR110."
LICENSE = "CPL-1.0"

PV = "1.6.3"

RPM_NAME = "wsdl4j-1.6.3-14.6.noarch.rpm"
RPM_HASH = "f815dc3092499c2a50ca8b8f5876c5a9546ab84cf8d755b06ce8677e74381ee8a530867f6a282cdca992c8bf9ab540e38a903b3586c477f0485c3c4b96ab4f34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-axis-axis-wsdl4j \
mvn-axis-axis-wsdl4j-pom- \
mvn-wsdl4j-wsdl4j \
mvn-wsdl4j-wsdl4j-pom- \
osgi-javax.wsdl \
wsdl4j"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem \
xerces-j2"

inherit rpm
