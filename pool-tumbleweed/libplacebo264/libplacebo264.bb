SUMMARY = "Library for GPU-accelerated video/image rendering primitives"
DESCRIPTION = "This library contains GPU-accelerated video/image rendering \
primitives, as well as a standalone vulkan-based image/video \
renderer. It is based on the core rendering algorithms and ideas \
of mpv."
LICENSE = "LGPL-2.1-or-later"

PV = "5.264.1"

RPM_NAME = "libplacebo264-5.264.1-5.5.aarch64.rpm"
RPM_HASH = "105e0d5081325f58710dac6c07d73eff94d0bcc8b1c7d44b13ff046bd705900c1b4fdb5a4eca52a21b9565f6a8a81bd96d0343b5d1fe7824797c5cec386a24e9"

RPROVIDES:${PN} += "libplacebo.so.264 \
libplacebo264"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdovi.so.3 \
liblcms2.so.2 \
libm.so.6 \
libshaderc-shared.so.1 \
libunwind.so.8 \
libvulkan.so.1"

inherit rpm
