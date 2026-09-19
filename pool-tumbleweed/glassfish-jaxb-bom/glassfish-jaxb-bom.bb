SUMMARY = "JAXB BOM"
DESCRIPTION = "JAXB Bill of Materials (BOM)"
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-bom-2.3.1-12.4.noarch.rpm"
RPM_HASH = "d87a95b44896de1e1ebed6a60dc7b733567687bbfd6255413b15af52bf7835fa85385e50a6e0a3d122d8b0214906c3795d399c4414d04b58e56de26e799ddd6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-bom \
mvn-org.glassfish.jaxb-jaxb-bom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-net.java-jvnet-parent-pom-"

inherit rpm
