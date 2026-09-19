SUMMARY = "JAXB Runtime"
DESCRIPTION = "JAXB (JSR 222) Reference Implementation"
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-runtime-2.3.1-12.4.noarch.rpm"
RPM_HASH = "3fdb8066556c9b742f2c1eacf27542e7a65e86ed1017fdc2ee987f155bc3e4e1042a11518250f0996070ee1141926e166b56223f7c811cd96ec98765faa12e5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-runtime \
mvn-com.sun.xml.bind-jaxb-impl \
mvn-com.sun.xml.bind-jaxb-impl-pom- \
mvn-org.glassfish.jaxb-jaxb-runtime \
mvn-org.glassfish.jaxb-jaxb-runtime-pom- \
osgi-com.sun.xml.bind.jaxb-impl"

RDEPENDS:${PN} += "glassfish-fastinfoset \
istack-commons-runtime \
java-headless \
javapackages-filesystem \
mvn-com.sun.istack-istack-commons-runtime \
mvn-com.sun.xml.fastinfoset-FastInfoset \
mvn-javax.activation-javax.activation-api \
mvn-javax.xml.bind-jaxb-api \
mvn-org.glassfish.jaxb-txw2 \
mvn-org.jvnet.staxex-stax-ex \
stax-ex"

inherit rpm
