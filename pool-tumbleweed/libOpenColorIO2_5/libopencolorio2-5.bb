SUMMARY = "Complete Color Management Solution Geared Towards Motion Picture Production"
DESCRIPTION = "OpenColorIO (OCIO) is a color management solution geared towards motion picture \
production with an emphasis on visual effects and computer animation. \
 \
OCIO is compatible with the Academy Color Encoding Specification (ACES) and is \
LUT-format agnostic, supporting many popular formats."
LICENSE = "BSD-3-Clause"

PV = "2.5.2"

RPM_NAME = "libOpenColorIO2_5-2.5.2-1.3.aarch64.rpm"
RPM_HASH = "f5fcfdc899ced5f845ac8330041b823aa2222798f51eec00f0df7b3b9be2fee14bc63d2e7db319735eb76bf24797dc8cf7ceb6a593bcab27d1dd6da4f603f195"

RPROVIDES:${PN} += "libOpenColorIO.so.2.5 \
libOpenColorIO2-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libImath-3-2.so.30 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libminizip-ng.so.4 \
libpystring.so.0.0 \
libstdc++.so.6 \
libyaml-cpp.so.0.9 \
libyaml-cpp0-9"

inherit rpm
