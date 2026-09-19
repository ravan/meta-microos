SUMMARY = "Java Unit of Measurement Libraries (JSR 363)"
DESCRIPTION = "Units of Measurement Libraries - extending and complementing JSR 363."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "uom-lib-1.2-4.7.noarch.rpm"
RPM_HASH = "fa3f0702ca40cba30cfacc2762ce07db5fc583b20cc4e7679cdc53c9554aa69f3a7674a5e0b8694697d15ce80cb52b5dc12140d298b4fc4bc7c2e3081fb52b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-tech.uom.lib-uom-lib-pom- \
uom-lib"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-tech.uom-uom-parent-pom-"

inherit rpm
