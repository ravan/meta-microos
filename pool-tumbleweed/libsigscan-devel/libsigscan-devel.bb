SUMMARY = "Development files for libigscan"
DESCRIPTION = "libsigscan is a library for binary signature scanning \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libpff."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "libsigscan-devel-20260902-1.1.aarch64.rpm"
RPM_HASH = "0e3f10e42ca00aa9e001294f0f4f5649ee2c997918e706ffff3eea3dafae456cd89896fa884c10b531c7dfa12eb87f00c78ae2c0b35f7094dd5caa3e51cef078"

RPROVIDES:${PN} += "libsigscan-devel \
pkgconfig-libsigscan"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libsigscan1"

inherit rpm
