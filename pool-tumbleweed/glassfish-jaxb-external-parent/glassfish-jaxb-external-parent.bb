SUMMARY = "JAXB External parent POM"
DESCRIPTION = "JAXB External parent POM."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-external-parent-2.3.1-12.4.noarch.rpm"
RPM_HASH = "e9df830b201f2207c7deffb6c77ebfc7b18b5d0e88a74a5996ac81de357b48af67335fc943ec3f4d7c12461ba4f0275daf0c404bceb023a5f8df48001b24fbbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-external-parent \
mvn-com.sun.xml.bind.mvn-jaxb-external-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.xml.bind.mvn-jaxb-parent-pom-"

inherit rpm
