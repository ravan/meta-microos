SUMMARY = "HK2 configuration modules"
DESCRIPTION = "Hundred Kilobytes Kernel configuration modules."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-configuration-2.5.0-11.6.noarch.rpm"
RPM_HASH = "c3af9f122bb95ec053132341f10e814e05078aa5d2a8a000bec590c2583865a507d21d7d091f224ad56f1391ea9f787f9a794065718464cc8dcb51f49c137750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-configuration \
mvn-org.glassfish.hk2-hk2-configuration-hub \
mvn-org.glassfish.hk2-hk2-configuration-hub-pom- \
mvn-org.glassfish.hk2-hk2-configuration-integration \
mvn-org.glassfish.hk2-hk2-configuration-integration-pom- \
mvn-org.glassfish.hk2-hk2-configuration-persistence-pom- \
mvn-org.glassfish.hk2-hk2-configuration-pom- \
mvn-org.glassfish.hk2-hk2-property-file \
mvn-org.glassfish.hk2-hk2-property-file-pom- \
osgi-org.glassfish.hk2.configuration-hub \
osgi-org.glassfish.hk2.configuration-integration \
osgi-org.glassfish.hk2.property-file"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.annotation-javax.annotation-api \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-locator \
mvn-org.glassfish.hk2-hk2-utils"

inherit rpm
