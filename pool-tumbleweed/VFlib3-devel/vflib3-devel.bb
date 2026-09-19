SUMMARY = "Development libraries for VFlib3"
DESCRIPTION = "Development headers and libraries for VFlib3"
LICENSE = "LGPL-2.1-or-later"

PV = "3.7.2"

RPM_NAME = "VFlib3-devel-3.7.2-4.5.aarch64.rpm"
RPM_HASH = "f7594b3c77386ba4f5cf0038d9ed3b9b993956a2d99f38a8a0eb6609b2be78b153cbd42b11cab2995bbff1f22e13575f29c25f8b1f3f27d4ae75317edb8dd8e4"

RPROVIDES:${PN} += "VFlib3-devel"

RDEPENDS:${PN} += "libVFlib3-10 \
pkgconfig-freetype2 \
pkgconfig-kpathsea"

inherit rpm
