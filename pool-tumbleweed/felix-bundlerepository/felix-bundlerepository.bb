SUMMARY = "Bundle repository service"
DESCRIPTION = "Bundle repository service"
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.10"

RPM_NAME = "felix-bundlerepository-2.0.10-2.7.noarch.rpm"
RPM_HASH = "ac729d59cd5af130fc6f7479c8d9f29ed89ccf278c0a33af115b85e79a4c6d3e2894e5ff532fd73bfe8b5046c0a5c831230b81a97a1ace889713ea52ba2fab2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-bundlerepository \
mvn-org.apache.felix-org.apache.felix.bundlerepository \
mvn-org.apache.felix-org.apache.felix.bundlerepository-pom- \
osgi-org.apache.felix.bundlerepository"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-net.sf.kxml-kxml2 \
mvn-org.apache.felix-org.apache.felix.utils \
mvn-org.osgi-osgi.cmpn \
mvn-org.osgi-osgi.core \
mvn-xpp3-xpp3"

inherit rpm
