SUMMARY = "Development files for libmsiecf"
DESCRIPTION = "libmsiecf is a library to parse MS Internet Explorer Cache Files. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libmsiecf."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260525"

RPM_NAME = "libmsiecf-devel-20260525-1.11.aarch64.rpm"
RPM_HASH = "b9c1d7db9251bb5d2137c509b63b2aecf8b44de39f0fb87e5738613f249f966c7d9bd174af86795a03f0aa920c0920e31771d4ce18ca3fa9a607863a3d0e7a18"

RPROVIDES:${PN} += "libmsiecf-devel \
pkgconfig-libmsiecf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libmsiecf1"

inherit rpm
