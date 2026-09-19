SUMMARY = "Free OpenGL Character Renderer"
DESCRIPTION = "QuesoGLC is a free (as in free speech) implementation of the OpenGL \
Character Renderer (GLC). QuesoGLC is based on the FreeType library, \
provides Unicode support and is designed to be easily ported to any \
platform that supports both FreeType and the OpenGL API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libGLC0-0.7.2-5.3.aarch64.rpm"
RPM_HASH = "eca009bfb852130141a94f4f2d6c4b249136f6cb1507c4e281e14128771c8aa7135045477e58ee2a1e02220199ae170292b1e606f72866cb62c7488ee574408d"

RPROVIDES:${PN} += "libGLC.so.0 \
libGLC0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.3 \
libGLU.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfribidi.so.0 \
libm.so.6"

inherit rpm
