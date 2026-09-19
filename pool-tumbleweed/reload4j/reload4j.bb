SUMMARY = "Revival of EOLed log4j 1.x"
DESCRIPTION = "The reload4j project is a fork of Apache log4j version 1.2.17 \
in order to fix most pressing security issues. It is intended \
as a drop-in replacement for log4j version 1.2.17; replacement \
of log4j.jar with reload4j.jar in a build without needing to \
make changes to source code."
LICENSE = "Apache-2.0"

PV = "1.2.25"

RPM_NAME = "reload4j-1.2.25-2.9.noarch.rpm"
RPM_HASH = "d97216cd0d8252eea0a2c33b32e8dd25a1eb7fb2f0736fae8898a718e543d4b7eb2d80d277cb4b6b228fb2e383622365584bd755df3b1d331fbdc2237322d274"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j12 \
log4j12-mini \
mvn-ch.qos.reload4j-reload4j \
mvn-ch.qos.reload4j-reload4j-pom- \
mvn-log4j-log4j \
mvn-log4j-log4j-1.2.12 \
mvn-log4j-log4j-1.2.14 \
mvn-log4j-log4j-1.2.16 \
mvn-log4j-log4j-1.2.17 \
mvn-log4j-log4j-12 \
mvn-log4j-log4j-pom- \
osgi-org.apache.log4j \
reload4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
