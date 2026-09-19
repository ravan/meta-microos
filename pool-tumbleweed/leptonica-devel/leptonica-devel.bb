SUMMARY = "Leptonica Development Files"
DESCRIPTION = "Development files for the Leptonica library."
LICENSE = "BSD-2-Clause"

PV = "1.87.0"

RPM_NAME = "leptonica-devel-1.87.0-1.5.aarch64.rpm"
RPM_HASH = "2d57e101bcaadc928471cff1a6902ca7cea4e657e60a9ec976196c05b86005da08b51195e0fe915a07e25b6bc0891bbe7dae006f1d7c940bc11a5736b29ae670"

RPROVIDES:${PN} += "leptonica-devel \
liblept-devel \
libleptonica-devel \
pkgconfig-lept"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libleptonica6"

inherit rpm
