SUMMARY = "Development files for liblinebreak"
DESCRIPTION = "The liblinebreak-devel package contains libraries and header files for \
developing applications that use liblinebreak."
LICENSE = "Zlib"

PV = "2.1"

RPM_NAME = "liblinebreak-devel-2.1-16.35.aarch64.rpm"
RPM_HASH = "bbc16eec4a696bbfb25930999885fa97cf17f3cecfc3a3f7130a05bf1dfc518e223627d8c413b4089d2a4e6582d8f8f359a462cdf94d4707220c84812002261e"

RPROVIDES:${PN} += "liblinebreak-devel"

RDEPENDS:${PN} += "liblinebreak"

inherit rpm
