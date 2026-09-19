SUMMARY = "Development headers and libraries for libcerf"
DESCRIPTION = "libcerf is a self-contained numeric library that provides an efficient and \
accurate implementation of complex error functions, along with Dawson, \
Faddeeva, and Voigt functions. \
 \
This package contains development headers and libraries for libcerf"
LICENSE = "MIT"

PV = "2.4"

RPM_NAME = "libcerf-devel-2.4-3.9.aarch64.rpm"
RPM_HASH = "932b2ac272a96a3bc2522e0519cde1803c10eeaeea2b0961940cf627691b8f7afe8659edc53ddffd965514c9cb3678386aba13558747acad8b14beba2b3fa1fa"

RPROVIDES:${PN} += "cmake-cerf \
libcerf-devel \
pkgconfig-libcerf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcerf2"

inherit rpm
