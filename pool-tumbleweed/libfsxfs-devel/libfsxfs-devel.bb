SUMMARY = "Development files for libfsxfs"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsxfs."
LICENSE = "LGPL-3.0-or-later"

PV = "20260901"

RPM_NAME = "libfsxfs-devel-20260901-1.1.aarch64.rpm"
RPM_HASH = "016d0cab15654fc22a756c29f1e6bc98de70a171f1863591d98a632dbc888797048caa31d666c1516a605a676ddd3dbfbbb4ba074d73dd9bf3952a61564deffc"

RPROVIDES:${PN} += "libfsxfs-devel \
pkgconfig-libfsxfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsxfs1"

inherit rpm
