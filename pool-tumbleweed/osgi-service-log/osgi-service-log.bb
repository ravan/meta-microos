SUMMARY = "OSGi Service Log"
DESCRIPTION = "OSGi Companion Code for org.osgi.service.log Version 1.5.0."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "osgi-service-log-1.5.0-2.10.noarch.rpm"
RPM_HASH = "aaa0a2cae0cd84b2b787654e8002daffb9a26cd39686b3fdb6d20b387c1677edfed20699b4ee525d8837899e8dfda1a3e5155b937c9ece98694a483fe2a65605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.osgi-org.osgi.service.log \
mvn-org.osgi-org.osgi.service.log-pom- \
osgi-org.osgi.service.log \
osgi-service-log"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
