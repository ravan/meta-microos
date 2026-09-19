SUMMARY = "Documentation files for the Open Path Guiding library"
DESCRIPTION = "Documentation files for the Open Path Guiding library."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "openpgl-doc-0.7.1-1.5.noarch.rpm"
RPM_HASH = "39a1f6de7d1ec6b0174e871499a2aae3ff6e967fffc762922ea8714c642e90d515d81125ad5ff05776bc0dbd5004b75d52451907cbe3e9502338a58316c969a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openpgl-doc"

RDEPENDS:${PN} += ""

inherit rpm
