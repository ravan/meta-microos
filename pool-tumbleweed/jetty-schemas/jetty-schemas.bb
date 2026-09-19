SUMMARY = "XML Schemas for Jetty"
DESCRIPTION = "XML Schemas for Jetty."
LICENSE = "(Apache-2.0 | EPL-1.0) & (CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "4.0.3"

RPM_NAME = "jetty-schemas-4.0.3-4.4.noarch.rpm"
RPM_HASH = "eea7f88cc62d8df5f6a3a02682e258720b59fc0932db191a796aa3a93b6848c7beea3bfbef9f4fea2888c63cf293c0c2e26c2b73c31727aae7937c82e26cc9ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-schemas \
mvn-org.eclipse.jetty.toolchain-jetty-schemas \
mvn-org.eclipse.jetty.toolchain-jetty-schemas-pom- \
osgi-org.eclipse.jetty.schemas"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
