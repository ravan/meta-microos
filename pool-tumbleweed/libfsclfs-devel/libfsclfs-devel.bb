SUMMARY = "Development files for libfsclfs"
DESCRIPTION = "libfsclfs is a library to access the Common Log File System (CLFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsclfs."
LICENSE = "LGPL-3.0-or-later"

PV = "20240430"

RPM_NAME = "libfsclfs-devel-20240430-1.21.aarch64.rpm"
RPM_HASH = "6bd2845ccf3d55f0aba4f8f99a14c9c761795c8120d7e217601a8af4da5077ea47ebd7d3f5318225388d021f0e24085875b43f3851ec84e7d864a1bbca1db729"

RPROVIDES:${PN} += "libfsclfs-devel \
pkgconfig-libfsclfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsclfs1"

inherit rpm
