SUMMARY = "Rhino Engine"
DESCRIPTION = "Rhino Javascript JSR-223 Script Engine wrapper."
LICENSE = "MPL-2.0"

PV = "1.7.15.1"

RPM_NAME = "rhino-engine-1.7.15.1-1.5.noarch.rpm"
RPM_HASH = "4fb74892812b61952d4740d9cb02b354bb36babf89d69c261ba33a764002c40f062858536b8d17d37b56233fdd9d061c830ffb3f2d9bf797352ea38564537b15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.mozilla-rhino-engine \
mvn-org.mozilla-rhino-engine-pom- \
rhino-engine"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.mozilla-rhino \
rhino"

inherit rpm
