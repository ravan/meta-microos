SUMMARY = "Development files for SLEEF"
DESCRIPTION = "SLEEF is a library that implements vectorized versions of C standard math \
functions. This library also includes DFT subroutines. \
 \
These are the development files for SLEEF."
LICENSE = "BSL-1.0"

PV = "3.9.0"

RPM_NAME = "sleef-devel-3.9.0-5.5.aarch64.rpm"
RPM_HASH = "22ac013fa70e7143b5583d62a44a33d5c8f00e386409c121052493559bd8456b4ff62d58cd5a30f5cf99f7ddc9def8e8b0e187e087bf68e1f871c9aefd1bd1ae"

RPROVIDES:${PN} += "cmake-sleef \
pkgconfig-sleef \
sleef-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsleef3"

inherit rpm
