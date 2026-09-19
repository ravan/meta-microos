SUMMARY = "Apache Felix Shell Service"
DESCRIPTION = "A simple OSGi command shell service."
LICENSE = "Apache-2.0"

PV = "1.4.3"

RPM_NAME = "felix-shell-1.4.3-5.8.noarch.rpm"
RPM_HASH = "7aace458b7a6388a39d740f322ad1d10b5fc91c4f04b123e9c3a8a772130d32a3bfe10ccdfcde83746ffd0b8010b61ce3bba3aa975418970d95f33270d221709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-shell \
mvn-org.apache.felix-org.apache.felix.shell \
mvn-org.apache.felix-org.apache.felix.shell-pom- \
osgi-org.apache.felix.shell"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.osgi-osgi.cmpn \
mvn-org.osgi-osgi.core"

inherit rpm
