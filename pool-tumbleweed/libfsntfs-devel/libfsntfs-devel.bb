SUMMARY = "Development files for libfsntfs"
DESCRIPTION = "libfsntfs is a library to access the New Technology File System (NTFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsntfs."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260827"

RPM_NAME = "libfsntfs-devel-20260827-1.1.aarch64.rpm"
RPM_HASH = "556cce315ad2ea302890d7ba6e048d93edb59dc52f156e046935113c2a6e9271518b81dfe18e7e651a5d1c4ab0c0ce0292f52f1891004b38863a6c0841545c4f"

RPROVIDES:${PN} += "libfsntfs-devel \
pkgconfig-libfsntfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsntfs1"

inherit rpm
