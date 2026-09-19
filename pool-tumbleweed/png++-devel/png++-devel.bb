SUMMARY = "C++ wrapper for libpng library"
DESCRIPTION = "PNG++ provides a C++ interface to libpng, the PNG reference implementation library."
LICENSE = "BSD-3-Clause"

PV = "0.2.10"

RPM_NAME = "png++-devel-0.2.10-1.18.noarch.rpm"
RPM_HASH = "5cb83ae32a42b37bec73505806dea58f65d7821388142c0dd7a1123b11fff5dd3aa2eee134ef47f3952374c65d99eddcf11241ffd1b011f611d0bef87999566c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "png++-devel"

RDEPENDS:${PN} += "pkgconfig-libpng"

inherit rpm
