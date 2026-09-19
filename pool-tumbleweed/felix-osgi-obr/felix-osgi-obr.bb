SUMMARY = "Felix OSGi OBR Service API"
DESCRIPTION = "OSGi OBR Service API."
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "felix-osgi-obr-1.0.2-3.8.noarch.rpm"
RPM_HASH = "f07885cc60a523bd2c746d4c8699b78dbeff1f8792af28a573df1ae49f73224bf8c03f4a41e14eeaa6c44923aed291cbf40a381b14491f26f608fb8b720b9dc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-osgi-obr \
mvn-org.apache.felix-org.osgi.service.obr \
mvn-org.apache.felix-org.osgi.service.obr-pom- \
osgi-org.osgi.service.obr"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.osgi-osgi.core"

inherit rpm
