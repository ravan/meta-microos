SUMMARY = "HK2 module of HK2 itself"
DESCRIPTION = "This is so that other modules can depend on HK2 as an HK2 module."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-hk2-2.5.0-11.6.noarch.rpm"
RPM_HASH = "25c6834121a8e67b5e2f0c82fab40a65fe019f8826ce4d5c6cd5b35861078ee4d1ab23d65e459853f98d8965e40232cb0b8803ccec46d104acae5004396baa51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-hk2 \
mvn-org.glassfish.hk2-hk2 \
mvn-org.glassfish.hk2-hk2-pom- \
osgi-org.glassfish.hk2.hk2"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.glassfish.hk2-class-model \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-core \
mvn-org.glassfish.hk2-hk2-locator \
mvn-org.glassfish.hk2-hk2-runlevel \
mvn-org.glassfish.hk2-hk2-utils"

inherit rpm
