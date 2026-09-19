SUMMARY = "Rendering backend library"
DESCRIPTION = "Aquamarine is a very light linux rendering backend library. It \
provides basic abstractions for an application to render on a Wayland \
session (in a window) or a native DRM session."
LICENSE = "BSD-3-Clause"

PV = "0.15.0"

RPM_NAME = "libaquamarine14-0.15.0-1.1.aarch64.rpm"
RPM_HASH = "74fad66a369b9aca5fec44f86c5a6d04f801e64f774819321724d1f14252ff5bd82c2473aaa4aeab4de0c933b0f003415b14e3f9698a83be22b2b8a0122d6395"

RPROVIDES:${PN} += "libaquamarine.so.14 \
libaquamarine14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libOpenGL.so.0 \
libc.so.6 \
libdisplay-info.so.3 \
libdrm.so.2 \
libgbm.so.1 \
libgcc-s.so.1 \
libhyprutils.so.13 \
libinput.so.10 \
libm.so.6 \
libpixman-1.so.0 \
libseat.so.1 \
libstdc++.so.6 \
libudev.so.1 \
libwayland-client.so.0"

inherit rpm
