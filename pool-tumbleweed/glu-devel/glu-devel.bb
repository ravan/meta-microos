SUMMARY = "Development files for the GLU API"
DESCRIPTION = "GLU offers simple interfaces for building mipmaps; checking for the \
presence of extensions in the OpenGL (or other libraries which follow \
the same conventions for advertising extensions); drawing \
piecewise-linear curves, NURBS, quadrics and other primitives \
(including, but not limited to, teapots); tesselating surfaces; \
setting up projection matrices and unprojecting screen coordinates to \
world coordinates. \
 \
This package contains includes headers and static libraries for \
compiling programs with GLU."
LICENSE = "SGI-B-2.0"

PV = "9.0.3"

RPM_NAME = "glu-devel-9.0.3-3.6.aarch64.rpm"
RPM_HASH = "1f9d5252031d747958cd15a20b020ab5c2aa7ffb9f6ce1a255645655d470387322874993cc705bf0a0e052701eeff6f857bc25eb2ffe228674da9f67e891663b"

RPROVIDES:${PN} += "Mesa-libGLU-devel \
glu-devel \
pkgconfig-glu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libGLU1 \
pkgconfig-gl \
pkgconfig-opengl"

inherit rpm
