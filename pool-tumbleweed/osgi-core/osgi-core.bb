SUMMARY = "OSGi Core API"
DESCRIPTION = "OSGi Core Release 8, Interfaces and Classes for use in compiling bundles."
LICENSE = "Apache-2.0"

PV = "8.0.0"

RPM_NAME = "osgi-core-8.0.0-3.8.noarch.rpm"
RPM_HASH = "ae940a046532a43f070b43670248342999f8e32f8425f010f0872568e18b2c7342fe102b9ab979fc60821862f6ebe28861d0800329fb36742c311655f2532120"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.osgi-osgi.core \
mvn-org.osgi-osgi.core-pom- \
osgi-core \
osgi-osgi.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
