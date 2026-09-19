SUMMARY = "JTS IO"
DESCRIPTION = "Extension to assist in read / write operations."
LICENSE = "EPL-1.0"

PV = "1.20.0"

RPM_NAME = "jts-io-1.20.0-1.6.noarch.rpm"
RPM_HASH = "0c6c25bd3182481d891a77b19e46170bc56cba343f12aeb459aadf3a303192fe9772339deaedb54f417b549fc27ad3a5c90f26b6ce79ac0f2ff073b2ab6da779"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jts-io \
mvn-com.vividsolutions-jts-io \
mvn-com.vividsolutions-jts-io-pom- \
mvn-org.locationtech.jts-jts-io-pom- \
mvn-org.locationtech.jts.io-jts-io-common \
mvn-org.locationtech.jts.io-jts-io-common-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.googlecode.json-simple-json-simple \
mvn-org.locationtech.jts-jts-core"

inherit rpm
