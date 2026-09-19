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

RPM_NAME = "waffle-1.8.1-2.3.aarch64.rpm"
RPM_HASH = "f7d29817a3cbabd557239bd4f6be26222313cb1e4b92e2973c6c25aabb436fd5d370e83a3736dca0aecdb4ca9b52703bf6199f2be5f87fe48b55e69b15fc3685"

RPROVIDES:${PN} += "waffle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwaffle-1.so.0"

inherit rpm
