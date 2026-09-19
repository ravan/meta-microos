SUMMARY = "Development files for OpenFST"
DESCRIPTION = "OpenFST is a library for constructing, combining, optimizing and \
searching weighted finite-state transducers (FSTs)."
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "openfst-devel-1.8.4-1.7.aarch64.rpm"
RPM_HASH = "159b3e22fded6f30fc31209692e81d3f764729cc82c6835a48359552405d245963fe4ad2e9fae29c21e2132b2ef4fbca2991628ed58519915441e9e178808208"

RPROVIDES:${PN} += "openfst-devel"

RDEPENDS:${PN} += "libfst26"

inherit rpm
