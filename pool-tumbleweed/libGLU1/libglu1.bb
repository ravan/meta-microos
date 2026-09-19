SUMMARY = "OpenGL utility library"
DESCRIPTION = "GLU offers simple interfaces for building mipmaps; checking for the \
presence of extensions in the OpenGL (or other libraries which follow \
the same conventions for advertising extensions); drawing \
piecewise-linear curves, NURBS, quadrics and other primitives \
(including, but not limited to, teapots); tesselating surfaces; \
setting up projection matrices and unprojecting screen coordinates to \
world coordinates. \
 \
This package provides the SGI implementation of GLU previously shipped \
with Mesa, but meanwhile developed separately."
LICENSE = "SGI-B-2.0"

PV = "9.0.3"

RPM_NAME = "libGLU1-9.0.3-3.6.aarch64.rpm"
RPM_HASH = "fc98e44c01446a6ce96e82105fea0e53e732a75ea9fd5cc1386d748cd52efcbe89a0f84b77e690887c99fc02fe116dcacef37f4c9d12aa65d801b767a05c98b1"

RPROVIDES:${PN} += "Mesa-libGLU1 \
libGLU.so.1 \
libGLU1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenGL.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
