SUMMARY = "Development files for libfsfat"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsfat."
LICENSE = "LGPL-3.0-or-later"

PV = "20260826"

RPM_NAME = "libfsfat-devel-20260826-1.1.aarch64.rpm"
RPM_HASH = "54f5dda71a7e17091dab1ec4f15efd7374f807fc49417e975144150b6f0af02c511291467a96e455bcda00a567d7f8bd576faa9b06588f9cf45d550c5ded0e09"

RPROVIDES:${PN} += "libfsfat-devel \
pkgconfig-libfsfat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsfat1"

inherit rpm
