SUMMARY = "OSGi Service JDBC"
DESCRIPTION = "OSGi Companion Code for org.osgi.service.jdbc Version 1.0.0."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "osgi-service-jdbc-1.0.0-2.10.noarch.rpm"
RPM_HASH = "c3e5ace4fb91a887e7aa0ff48654e1706598bfb23d5ee5ab8215c5e7c84d60b06a6c536c0b87d274d5c0e0ed56a7688693efe2ad4293644f091d9c41f98c8560"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.osgi-org.osgi.service.jdbc \
mvn-org.osgi-org.osgi.service.jdbc-pom- \
osgi-org.osgi.service.jdbc \
osgi-service-jdbc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
