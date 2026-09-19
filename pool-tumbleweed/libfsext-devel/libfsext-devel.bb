SUMMARY = "Development files for libfsext, Extended File System (ext) library"
DESCRIPTION = "libfsext is a library to access the extended file system (ext) format.  see libfsext for details. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfsext."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260821"

RPM_NAME = "libfsext-devel-20260821-1.1.aarch64.rpm"
RPM_HASH = "8ab01fa4d5a07decacb186f48fb62935e212a8306ddbb5b507710e77e778b9f803c573abd02b9fef63126abcfb6ee7774e726af2d7b678bfceddf0223db94b20"

RPROVIDES:${PN} += "libfsext-devel \
pkgconfig-libfsext"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfsext1"

inherit rpm
