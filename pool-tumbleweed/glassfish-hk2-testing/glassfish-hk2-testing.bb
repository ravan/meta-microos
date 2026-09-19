SUMMARY = "Utilities for testing with HK2"
DESCRIPTION = "Hundred Kilobytes Kernel utilities for testing."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-testing-2.5.0-11.6.noarch.rpm"
RPM_HASH = "f0f4eac17a4bd08e12d03db455bdb65446b07931a4521c6226089302b015a090bc0485c11d7ff3a98d02f0aff1334e225cab99bdbfb8011ce0776fdb1508d0ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-locator-extras \
glassfish-hk2-locator-no-proxies \
glassfish-hk2-locator-no-proxies2 \
glassfish-hk2-runlevel-extras \
glassfish-hk2-testing \
glassfish-hk2-testng \
mvn-org.glassfish.hk2-hk2-junitrunner \
mvn-org.glassfish.hk2-hk2-junitrunner-pom- \
mvn-org.glassfish.hk2-hk2-testing-pom- \
osgi-org.glassfish.hk2.junitrunner"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.inject-javax.inject \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-locator \
mvn-org.ow2.asm-asm-all"

inherit rpm
