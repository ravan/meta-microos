SUMMARY = "JAXB schema generator"
DESCRIPTION = "The tool to generate XML schema based on java classes."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-jxc-2.3.1-12.4.noarch.rpm"
RPM_HASH = "61784d987c4c8006eaff28a4537006d30b05b614b0265918dcd2d88b9634f8c692dfaa4420131e4d8bf149afffc0bf9ddab3a9304d595d07b19ea5504a7020cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-jxc \
mvn-org.glassfish.jaxb-jaxb-jxc \
mvn-org.glassfish.jaxb-jaxb-jxc-jdk9 \
mvn-org.glassfish.jaxb-jaxb-jxc-jdk9-pom- \
mvn-org.glassfish.jaxb-jaxb-jxc-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.istack-istack-commons-runtime \
mvn-org.glassfish.jaxb-jaxb-runtime \
mvn-org.glassfish.jaxb-jaxb-xjc \
mvn-org.glassfish.jaxb-txw2"

inherit rpm
