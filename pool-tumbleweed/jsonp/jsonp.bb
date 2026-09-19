SUMMARY = "JSR 353 (JSON Processing) RI"
DESCRIPTION = "JSR 353: Java API for Processing JSON RI."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.1.4"

RPM_NAME = "jsonp-1.1.4-1.6.noarch.rpm"
RPM_HASH = "13fca336ee30b85b6e6ddf1ae15f728c1b28ad81fe9443a5e0b1c727aa32cdf52f90bcd1f44a1ddd51b2466e5403780cd8ffd6d5946189adf3e6cd766debf804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsonp \
mvn-javax.json-javax.json-api \
mvn-javax.json-javax.json-api-pom- \
mvn-org.glassfish-javax.json \
mvn-org.glassfish-javax.json-pom- \
mvn-org.glassfish-json-pom- \
mvn-org.glassfish-jsonp-jaxrs \
mvn-org.glassfish-jsonp-jaxrs-1x \
mvn-org.glassfish-jsonp-jaxrs-1x-pom- \
mvn-org.glassfish-jsonp-jaxrs-pom- \
osgi-jakarta.json-api \
osgi-org.glassfish.javax.json \
osgi-org.glassfish.jsonp-jaxrs \
osgi-org.glassfish.jsonp-jaxrs-1x"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
