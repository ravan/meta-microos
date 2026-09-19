SUMMARY = "Java Units of Measurement AssertJ Library"
DESCRIPTION = "Units of Measurement AssertJ Library - extending and complementing JSR 363."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "uom-lib-assertj-1.2-4.7.noarch.rpm"
RPM_HASH = "86c5c3e25ee19fad2f88542a3b21e094ac8b8fe07b33792f6d3df7bbc25e20edf0886dcc6f32e2324d3308a4b817f4e2ab272b883e6d38494a06688306251635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-tech.uom.lib-uom-lib-assertj \
mvn-tech.uom.lib-uom-lib-assertj-pom- \
uom-lib-assertj"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.measure-unit-api \
mvn-junit-junit \
mvn-org.assertj-assertj-core"

inherit rpm
