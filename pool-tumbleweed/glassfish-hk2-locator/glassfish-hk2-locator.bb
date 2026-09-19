SUMMARY = "HK2 ServiceLocator Default Implementation"
DESCRIPTION = "Hundred Kilobytes Kernel ServiceLocator Default Implementation."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-locator-2.5.0-11.6.noarch.rpm"
RPM_HASH = "3e32aa45cc7f438d52adad1ae9a74f32ff695209ffa64c429a5762e08b01bb7af5bbec635d82f745724407f034059edb29e2ab68fec9620bcc51e4c2c1b5e022"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-locator \
mvn-org.glassfish.hk2-hk2-locator \
mvn-org.glassfish.hk2-hk2-locator-pom- \
osgi-org.glassfish.hk2.locator"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-aopalliance-aopalliance \
mvn-javax.annotation-javax.annotation-api \
mvn-javax.inject-javax.inject \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-utils \
mvn-org.javassist-javassist"

inherit rpm
