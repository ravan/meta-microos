SUMMARY = "Development files for libjasper, a JPEG-2000 library"
DESCRIPTION = "This package contains libjasper, a library implementing the JPEG-2000 \
image compression standard Part 1."
LICENSE = "JasPer-2.0"

PV = "4.2.9"

RPM_NAME = "libjasper-devel-4.2.9-1.4.aarch64.rpm"
RPM_HASH = "9deebbc94ec52eb8bfb66a0cbae3315cb9e558d97c9f08d94731c84035f1f27e032d7f074a272733ffb1979df799f92383353fadbb292d1e9ed139448d7dc3d9"

RPROVIDES:${PN} += "libjasper-devel \
pkgconfig-jasper"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjasper7 \
libjpeg-devel \
pkgconfig-libjpeg"

inherit rpm
