SUMMARY = "Development files for libebur128"
DESCRIPTION = "A library implementing the EBU R128 loudness standard. \
 \
This package contains header files and libraries needed to develop \
application that use libebur128."
LICENSE = "MIT"

PV = "1.2.6"

RPM_NAME = "libebur128-devel-1.2.6-2.6.aarch64.rpm"
RPM_HASH = "1a307d01c6818cfe0129318f5a629b82d51a799918567f1e44ef544679305f574994925c16546a531f7eb2ff1ade7a234b88d692cc42e3cd5d60e146ccfd2d83"

RPROVIDES:${PN} += "libebur128-devel \
pkgconfig-libebur128"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libebur128-1"

inherit rpm
