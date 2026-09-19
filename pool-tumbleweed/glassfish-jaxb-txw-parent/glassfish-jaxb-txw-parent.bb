SUMMARY = "JAXB TXW parent POM"
DESCRIPTION = "This package contains TXW parent POM."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-txw-parent-2.3.1-12.4.noarch.rpm"
RPM_HASH = "5bccc70ab26bceac929556485843d6f8774317caf65a959a44fa6a7176abf77a616bb5af574c8d8ad66de495aa59cea25f336c938b780e18ce26e27b49ff7053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-txw-parent \
mvn-com.sun.xml.bind.mvn-jaxb-txw-parent-pom-"

RDEPENDS:${PN} += "javapackages-filesystem \
mvn-com.sun.xml.bind.mvn-jaxb-parent-pom-"

inherit rpm
