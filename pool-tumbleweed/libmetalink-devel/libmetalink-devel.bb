SUMMARY = "Metalink Library"
DESCRIPTION = "Libmetalink is a Metalink library written in C language. It is intended to \
provide the programs written in C to add Metalink functionality such as parsing \
Metalink XML files."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "libmetalink-devel-0.1.3-5.5.aarch64.rpm"
RPM_HASH = "9b9203270591dc7caa1b67c5c486db842a95a5deabd9fab546ea2c0de85f3b5501572f392c4c41b1147fcce9acd660893de5957b6f4f97b8ce258c0d66057cbe"

RPROVIDES:${PN} += "libmetalink-devel \
pkgconfig-libmetalink"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libmetalink3"

inherit rpm
