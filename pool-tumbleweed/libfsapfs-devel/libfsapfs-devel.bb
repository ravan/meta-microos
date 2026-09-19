SUMMARY = "Development files for libfsapfs"
DESCRIPTION = "Development files for libfsapfs."
LICENSE = "LGPL-3.0-only"

PV = "20240429"

RPM_NAME = "libfsapfs-devel-20240429-2.21.aarch64.rpm"
RPM_HASH = "9c07189c16264f43b3b3807bd0e53e5eb578863dd914245e1ccd9e4e916520b72d2daaea4bd0ab28527c73b5fd151b3085e24c554419695647f6f5da531bd743"

RPROVIDES:${PN} += "libfsapfs-devel \
pkgconfig-libfsapfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsapfs1"

inherit rpm
