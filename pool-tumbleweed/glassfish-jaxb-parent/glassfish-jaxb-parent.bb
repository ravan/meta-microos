SUMMARY = "JAXB parent POM"
DESCRIPTION = "This package contains parent POM."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-parent-2.3.1-12.4.noarch.rpm"
RPM_HASH = "7086c214fe62c6f352f0fcacccc990ef4acdf87d1f6ceeaa5079c7e07a2e0f99cc1e3dcd72fdb0748ac33f3a0953cb6850accf7643def0b67aa0144f8204ac0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-parent \
mvn-com.sun.xml.bind.mvn-jaxb-parent-pom-"

RDEPENDS:${PN} += "javapackages-filesystem \
mvn-com.sun.xml.bind-jaxb-bom-ext-pom- \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-dependency-plugin \
mvn-org.codehaus.mojo-build-helper-maven-plugin"

inherit rpm
