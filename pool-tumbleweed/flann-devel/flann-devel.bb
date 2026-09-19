SUMMARY = "Development files for flann"
DESCRIPTION = "Fast Library for Approximate Nearest Neighbors. \
 \
This package contains the header files and libraries needed to develop \
application that use flann."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "flann-devel-1.9.2-3.14.aarch64.rpm"
RPM_HASH = "435fb06d96ae6b345231045a851916e89773d40fcb8889930e26d2c6144c063ddb6fe4cc9af5b4331c2af55295789b5cac43e89ee30fd718ba985e3fbb241b56"

RPROVIDES:${PN} += "cmake-flann \
flann-devel \
pkgconfig-flann"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libflann1-9 \
liblz4-devel"

inherit rpm
