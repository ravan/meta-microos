SUMMARY = "HK2 extras module"
DESCRIPTION = "Default implementations for HK2 services."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-extras-2.5.0-11.6.noarch.rpm"
RPM_HASH = "3ce1753ccdc27ab03114761886e9131544c318b8994c1cef377299ac3f93b301f6f185dc7499cd1fa97809ac4155ebf38f18a0458373615f9972240241151046"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-extras \
mvn-org.glassfish.hk2-hk2-extras \
mvn-org.glassfish.hk2-hk2-extras-pom- \
osgi-org.glassfish.hk2.extras"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-aopalliance-aopalliance \
mvn-javax.annotation-javax.annotation-api \
mvn-javax.inject-javax.inject \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-metadata-generator \
mvn-org.glassfish.hk2-hk2-utils"

inherit rpm
