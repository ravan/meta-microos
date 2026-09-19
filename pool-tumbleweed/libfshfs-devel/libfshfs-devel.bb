SUMMARY = "Development files for libfshfs, Mac OS Hierarchical File System (HFS) library"
DESCRIPTION = "libfshfs is a library to access the Mac OS Hierarchical File System \
(HFS) format. see libfshfs for details. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfshfs."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260826"

RPM_NAME = "libfshfs-devel-20260826-1.1.aarch64.rpm"
RPM_HASH = "85c6332ec0179ae459d7c09e9acd0fdb2e81278bce6b2b2af44033cdceeac6ded0a7e6fa7808e77faf72311a32884fdc18690ee0d55699122e205aae246bae45"

RPROVIDES:${PN} += "libfshfs-devel \
pkgconfig-libfshfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfshfs1"

inherit rpm
