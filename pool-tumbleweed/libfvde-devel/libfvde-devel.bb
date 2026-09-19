SUMMARY = "Header files and libraries for developing applications for libfvde"
DESCRIPTION = "Header files and libraries for developing applications for libfvde \
 \
See libfvde for additional details. \
 \
This package contains libraries and header files for developing \
applications that want to make use of libfvde."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20240502"

RPM_NAME = "libfvde-devel-20240502-2.20.aarch64.rpm"
RPM_HASH = "c5fd9b3f1fceb3d3a1cd194a49038a183abce05010c4361eb4d92231ebd75843e8a159ee73f90e51b982c9067ece2ca2cb991e44a785e2b516b80098b2a69d5f"

RPROVIDES:${PN} += "libfvde-devel \
pkgconfig-libfvde"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libfvde1"

inherit rpm
