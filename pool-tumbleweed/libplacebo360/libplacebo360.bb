SUMMARY = "Library for GPU-accelerated video/image rendering primitives"
DESCRIPTION = "This library contains GPU-accelerated video/image rendering \
primitives, as well as a standalone vulkan-based image/video \
renderer. It is based on the core rendering algorithms and ideas \
of mpv."
LICENSE = "LGPL-2.1-or-later"

PV = "7.360.1"

RPM_NAME = "libplacebo360-7.360.1-1.5.aarch64.rpm"
RPM_HASH = "f3d312f79c639ed2cd7a05330c69327e00393105e3bfbaecbe16c20b9517fa4b9ab69bbd03f4a3e652042e4e4a7475b68a24e83352827347d4dc4554ebbb9203"

RPROVIDES:${PN} += "libplacebo.so.360 \
libplacebo360"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdovi.so.3 \
liblcms2.so.2 \
libm.so.6 \
libshaderc-shared.so.1 \
libstdc++.so.6 \
libunwind.so.8 \
libvulkan.so.1"

inherit rpm
