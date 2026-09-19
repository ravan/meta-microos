SUMMARY = "Development files for the 16-bit FP EXR picture handling library"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains header files."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "3.4.14"

RPM_NAME = "openexr-devel-3.4.14-1.1.aarch64.rpm"
RPM_HASH = "567374796477ab847fe07df74e1ef820f55f615f1db92ea0c90bd07377736ee4d46c85f7fccc89e5f3086874e77578dbb252fbbc44b0b6aa12e158ab5fb4c8c7"

RPROVIDES:${PN} += "OpenEXR-devel \
cmake-OpenEXR \
ilmbase-devel \
libopenexr-devel \
openexr-devel \
pkgconfig-OpenEXR"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Imath-devel \
libOpenEXR-3-4-33 \
libOpenEXRCore-3-4-33 \
libOpenEXRUtil-3-4-33 \
pkgconfig \
pkgconfig-Imath \
pkgconfig-libdeflate \
pkgconfig-openjph \
pkgconfig-zlib"

inherit rpm
