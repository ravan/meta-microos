SUMMARY = "Java Architecture for XML Binding"
DESCRIPTION = "Glassfish - JAXB (JSR 222) API."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.4.0"

RPM_NAME = "glassfish-jaxb-api-2.4.0-7.9.noarch.rpm"
RPM_HASH = "141bdb87004c28e75df39e2b28dcf5d43d29b2909047bbae1698ab13c7c25b3af4f80dd12a08974d01ff2571cfab7a690d9ec0c3c2c6197e0380ef075baf72b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-api \
mvn-javax.xml.bind-jaxb-api \
mvn-javax.xml.bind-jaxb-api-pom- \
osgi-jaxb-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.activation-javax.activation-api"

inherit rpm
