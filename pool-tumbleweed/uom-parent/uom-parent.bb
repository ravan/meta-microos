SUMMARY = "Units of Measurement Project Parent POM"
DESCRIPTION = "Main parent POM for all Units of Measurement Maven projects."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "uom-parent-1.3-1.27.noarch.rpm"
RPM_HASH = "6f4a6e6a2a51ddc3d18ec204962cc7b63fb8a38f9551e0160ad5958ee1ebe8a357e4ecf5521f90445ec3cbc51c8265705b0e205a1104dd7b6f9c3c652f21444b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-tech.uom-uom-parent-pom- \
uom-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
