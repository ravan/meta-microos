SUMMARY = "The system GNU D Compiler"
DESCRIPTION = "The system GNU D Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "16"

RPM_NAME = "gcc-d-16-1.1.aarch64.rpm"
RPM_HASH = "6810dd1e69b937eebe783624657c29bf2700f6230428741acba867642598ce7b69fda853431b993f243ed3b99af47a0b84382ee058dba1e86d18691607cede31"

RPROVIDES:${PN} += "gcc-d"

RDEPENDS:${PN} += "gcc \
gcc16-d"

inherit rpm
