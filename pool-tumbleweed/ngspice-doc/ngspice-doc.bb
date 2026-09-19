SUMMARY = "Documentation for the ngspice Mixed-signal simulator"
DESCRIPTION = "Ngspice is a mixed-level/mixed-signal circuit simulator. \
 \
This package contains the user manual in PDF format."
LICENSE = "CC-BY-SA-4.0 & BSD-3-Clause"

PV = "42"

RPM_NAME = "ngspice-doc-42-1.9.noarch.rpm"
RPM_HASH = "37bd15a5c1b55b0dcec8cd6c4997a93523e8941eaf73dc3a24c4f431bf6643a59bde2878177faddd8a8ab1d40c96165e5c90e71ba5d439c3698a90a81f9889fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ngspice-doc"

RDEPENDS:${PN} += ""

inherit rpm
