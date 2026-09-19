SUMMARY = "Documentation for libcamd"
DESCRIPTION = "Documentation for libcam."
LICENSE = "BSD-3-Clause"

PV = "7.14.0"

RPM_NAME = "libcamd-doc-7.14.0-1.1.noarch.rpm"
RPM_HASH = "6d3b39f3d02a78c1d69d339cf71abd79a30993dd1595a0a251dd9f6b8cb4d476a0c7d82f6794d16915d197f29626971099d5e79b2294982b129ee8496afd04d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcamd-doc"

RDEPENDS:${PN} += ""

inherit rpm
