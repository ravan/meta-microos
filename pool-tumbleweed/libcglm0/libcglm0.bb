SUMMARY = "OpenGL mathematics (glm) for C"
DESCRIPTION = "cglm is a C99-compatible version of the previous OpenGL Mathematics \
(GLM) implementation, a mathematics library for graphics software \
based on the OpenGL Shading Language (GLSL) specifications."
LICENSE = "MIT"

PV = "0.9.6"

RPM_NAME = "libcglm0-0.9.6-1.4.aarch64.rpm"
RPM_HASH = "f10556f234d1be69dea147e899fb553be8a141fd9a800f474e3edfab31e6ae078decb7022927d4c8007991d4f4434f0b25185f4d8edbf0a62796c7eede592c82"

RPROVIDES:${PN} += "libcglm.so.0 \
libcglm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
