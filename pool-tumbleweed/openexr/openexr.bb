SUMMARY = "Utilities for working with HDR images in OpenEXR format"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. This package \
contains a set of utilities to work with this format. \
 \
* exrheader, a utility for dumping header information \
* exrstdattr, a utility for modifying OpenEXR standard attributes \
* exrmaketiled, for generating tiled and rip/mipmapped images \
* exrenvmap, for creating OpenEXR environment maps \
* exrmakepreview, for creating preview images for OpenEXR files \
* exr2aces, converter to ACES format \
* exrmultiview, combine two or more images into one multi-view"
LICENSE = "BSD-3-Clause"

PV = "3.4.14"

RPM_NAME = "openexr-3.4.14-1.1.aarch64.rpm"
RPM_HASH = "2fecbee4198168dbb456cffb6ffc953bbaacff2e5f769c18441303d222e5e8c5f06b8d8d92cdbaeef324f90314c6597834a9f13d894bf57810d897415a2df50b"

RPROVIDES:${PN} += "OpenEXR \
openexr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libIex-3-4.so.33 \
libIlmThread-3-4.so.33 \
libImath-3-2.so.30 \
libOpenEXR-3-4.so.33 \
libOpenEXRCore-3-4.so.33 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
