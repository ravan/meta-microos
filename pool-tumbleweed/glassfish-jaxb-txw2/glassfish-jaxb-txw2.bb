SUMMARY = "TXW2 Runtime"
DESCRIPTION = "TXW is a library that allows you to write XML documents."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-txw2-2.3.1-12.4.noarch.rpm"
RPM_HASH = "4c34b7e2ae95a645d6b298b0856b1a18d045486914df9f8f17e19bd3860b2f4369f2cbd725de2c5bf92e9353a0f89dc818ae5da0df87269cb7f791060adbed70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-txw2 \
mvn-org.glassfish.jaxb-txw2 \
mvn-org.glassfish.jaxb-txw2-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
