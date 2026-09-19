SUMMARY = "Caffeine JSR-107 JCache extension"
DESCRIPTION = "An adapter to expose a Caffeine cache through the JCache interfaces."
LICENSE = "Apache-2.0"

PV = "2.9.3"

RPM_NAME = "caffeine-jcache-2.9.3-2.5.noarch.rpm"
RPM_HASH = "684a8fb9a4ed29cd10065f19585b3e524eef2a4749b42068878d1c34787d82c1f0befbdf9857947992dbbc4c976647456b7f9aa4669c36a7a79f57fd0193acb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caffeine-jcache \
mvn-com.github.ben-manes.caffeine-jcache \
mvn-com.github.ben-manes.caffeine-jcache-pom- \
osgi-com.github.ben-manes.caffeine.jcache"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.ben-manes.caffeine-caffeine \
mvn-com.typesafe-config \
mvn-javax.cache-cache-api \
mvn-javax.inject-javax.inject \
mvn-org.osgi-osgi.cmpn"

inherit rpm
