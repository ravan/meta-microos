SUMMARY = "Next Generation Units of Measurement Implementation"
DESCRIPTION = "Units of Measurement Libraries - JSR 385 Reference Implementation"
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "indriya-1.3-6.4.noarch.rpm"
RPM_HASH = "d0ca7b1652316a2e1e81595b04d086bbe4a83967808faad899200dc30078c2012886671fdbaabbf4cc6c78e74161d45ec623c6b59cc3c0e97a548a015472349d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "indriya \
mvn-tech.units-indriya \
mvn-tech.units-indriya-pom- \
osgi-tech.units.indriya"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.measure-unit-api \
mvn-tech.uom.lib-uom-lib-common"

inherit rpm
