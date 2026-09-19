SUMMARY = "Development files for libfvalue"
DESCRIPTION = "Library to provide generic file value functions for the libyal family of libraries. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfvalue."
LICENSE = "LGPL-3.0-or-later"

PV = "20260531"

RPM_NAME = "libfvalue-devel-20260531-1.7.aarch64.rpm"
RPM_HASH = "aa03705d25ecbeca8f9b790ed7e49b1bdc6c9b84799d0be6e270aafd514e3ecf1307e12e3aaf24313fdabaf06ff463ca34fd7112680a44cce0cf3cf5b591e791"

RPROVIDES:${PN} += "libfvalue-devel \
pkgconfig-libfvalue"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfvalue1"

inherit rpm
