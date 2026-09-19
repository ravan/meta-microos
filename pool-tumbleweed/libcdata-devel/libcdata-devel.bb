SUMMARY = "Development files for libcdata, a C generic data library"
DESCRIPTION = "A library for C generic data functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcdata."
LICENSE = "LGPL-3.0-or-later"

PV = "20260703"

RPM_NAME = "libcdata-devel-20260703-1.2.aarch64.rpm"
RPM_HASH = "b642d81347bd92df581ba529578438502f67b100ad9383c484b62f1ff5e3ce36624508ca2c28efd5732675bffc3ce0cd113ebc3fe9410a5a3ebff1010cfabb92"

RPROVIDES:${PN} += "libcdata-devel \
pkgconfig-libcdata"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcdata1"

inherit rpm
