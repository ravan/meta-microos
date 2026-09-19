SUMMARY = "C library defering selection of GL API and window system until runtime"
DESCRIPTION = "Waffle is a C library that allows deferring the selection of GL API \
and window system until runtime. For example, on Linux, Waffle enables \
an application to select X11/EGL with an OpenGL 3.3 core profile, Wayland \
with OpenGL ES2, and other window system / API combinations. \
 \
Waffle's immediate goal is to enable Piglit, Mesa's OpenGL test suite, to test \
multiple GL flavors."
LICENSE = "BSD-2-Clause"

PV = "1.8.1"

RPM_NAME = "libwaffle-1-0-1.8.1-2.3.aarch64.rpm"
RPM_HASH = "ab3cb57ebac5c723c37770777343ec8a9743f63c5238b379a3483d716b6b277f16aa68a123caeaf6ac081a2ccc1a1acb9b784e76f123350230c7feaee840f68e"

RPROVIDES:${PN} += "libwaffle-1-0 \
libwaffle-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libc.so.6 \
libxcb.so.1 \
waffle"

inherit rpm
