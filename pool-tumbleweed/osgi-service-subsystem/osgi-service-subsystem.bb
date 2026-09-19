SUMMARY = "OSGi Service Log"
DESCRIPTION = "OSGi Companion Code for org.osgi.service.subsystem Version 1.1.0."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "osgi-service-subsystem-1.1.0-1.8.noarch.rpm"
RPM_HASH = "e5271fbe92e8f89a42f802ca4bb0072e6c141423b76c8606f95a291a2150f3c6c28d7aa996f4b28a5776c9e4bc7d57bc4822e4188d6c911cc566fb7cc1924225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.osgi-org.osgi.service.subsystem \
mvn-org.osgi-org.osgi.service.subsystem-pom- \
osgi-org.osgi.service.subsystem \
osgi-service-subsystem"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
