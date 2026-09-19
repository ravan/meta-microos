SUMMARY = "Java Units of Measurement Common Library"
DESCRIPTION = "Units of Measurement Common Library - extending and complementing JSR 363."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "uom-lib-common-1.2-4.7.noarch.rpm"
RPM_HASH = "ffd528bf90ac10175420691c528abf916a467f1aaf444b6ad838bcf74377eb94ff6c73140e57d709034cbc8dcebdb105f542d02b51e4d04321fbb55227889461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-tech.uom.lib-uom-lib-common \
mvn-tech.uom.lib-uom-lib-common-pom- \
osgi-tech.uom.lib.uom-lib-common \
uom-lib-common"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.measure-unit-api"

inherit rpm
