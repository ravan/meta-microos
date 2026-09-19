SUMMARY = "Development files for the CVT library"
DESCRIPTION = "libxcvt is a library providing a standalone version of the X server \
implementation of the VESA Coordinated Video Timings (CVT) standard \
timing modelines generator. \
 \
This package contains the development headers for the library found \
in libxcvt0."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "libxcvt-devel-0.1.3-1.7.aarch64.rpm"
RPM_HASH = "ab82947e7c2cd3cdd1829a2e1f1b2a1433599f5366761f3ab9213eff01b2ad45e83d191cd78d5e073147746be792fa426a20088583a9d01915aa9c1b76d3464c"

RPROVIDES:${PN} += "libxcvt-devel \
pkgconfig-libxcvt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcvt0"

inherit rpm
