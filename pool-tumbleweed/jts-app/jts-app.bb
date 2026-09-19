SUMMARY = "JTS Applications & tools"
DESCRIPTION = "Applications & tools for working with JTS."
LICENSE = "EPL-1.0"

PV = "1.20.0"

RPM_NAME = "jts-app-1.20.0-1.6.noarch.rpm"
RPM_HASH = "b5abd3344661753ebfaab834f675506ddaefd9ea326d04c2a89a66b960df0d45896e9be70d15b6c001cf9dc3715a87426223ebc42b84342ddc6c85bd9e4cdfa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jts-app \
mvn-org.locationtech.jts-jts-app \
mvn-org.locationtech.jts-jts-app-pom- \
mvn-org.locationtech.jts-jts-tests \
mvn-org.locationtech.jts-jts-tests-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-lang3 \
mvn-org.jdom-jdom2 \
mvn-org.locationtech.jts-jts-core \
mvn-org.locationtech.jts.io-jts-io-common"

inherit rpm
