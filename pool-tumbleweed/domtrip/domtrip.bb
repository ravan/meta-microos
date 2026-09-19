SUMMARY = "Lossless XML Editing for Java"
DESCRIPTION = "DomTrip is a Java library for lossless XML editing that preserves every detail of your XML \
documents during round-trip operations. Perfect for configuration file editing, document \
transformation, and any scenario where maintaining original formatting is crucial."
LICENSE = "EPL-2.0"

PV = "1.6.0"

RPM_NAME = "domtrip-1.6.0-1.1.noarch.rpm"
RPM_HASH = "10082c77f82131b8ff6d320e448305631d5529683a3709a810f1dfd00ad240756a25fea359222543cd6c7f8ec81169a9ce84056cca7ae34b371e8d7cb9af400a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "domtrip \
mvn-eu.maveniverse.maven.domtrip-domtrip-core \
mvn-eu.maveniverse.maven.domtrip-domtrip-core-pom- \
mvn-eu.maveniverse.maven.domtrip-domtrip-jaxen \
mvn-eu.maveniverse.maven.domtrip-domtrip-jaxen-pom- \
mvn-eu.maveniverse.maven.domtrip-domtrip-maven \
mvn-eu.maveniverse.maven.domtrip-domtrip-maven-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-jaxen-jaxen"

inherit rpm
