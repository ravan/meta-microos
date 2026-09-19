SUMMARY = "JSR107 Cache Specification"
DESCRIPTION = "JCache is the Java caching API. It was defined by JSR107. It defines a standard \
Java Caching API for use by developers and a standard SPI (“Service Provider \
Interface”) for use by implementers."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "jcache-1.1.1-2.4.noarch.rpm"
RPM_HASH = "48a9ec28d364053fbdade891bf664e1d28ccc436e36872a15cd284292370de71b21a641ff7c79d9367b257140c9bc3b5e04619b7a8915bcde56c42aeeaad74bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcache \
mvn-javax.cache-cache-api \
mvn-javax.cache-cache-api-pom- \
osgi-javax.cache.api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
