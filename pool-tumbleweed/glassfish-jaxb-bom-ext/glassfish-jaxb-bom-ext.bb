SUMMARY = "JAXB BOM with all dependencies"
DESCRIPTION = "JAXB Bill of Materials (BOM) with all dependencies."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-bom-ext-2.3.1-12.4.noarch.rpm"
RPM_HASH = "a60023e8293896bf36c61e99c9b84f8c22b31e44fa3f3fb48753563d3a1df8318754e2ea4045e90aeb9a4fedd6b726179f69b2a01655832bf030e151148983d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-bom-ext \
mvn-com.sun.xml.bind-jaxb-bom-ext-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.glassfish.jaxb-jaxb-bom-pom-"

inherit rpm
