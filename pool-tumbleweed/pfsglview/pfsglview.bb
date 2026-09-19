SUMMARY = "GL-based viewer for HDR files"
DESCRIPTION = "pfsglview is a viewer program based on OpenGL for viewing HDR graphic files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfsglview-2.2.0-5.10.aarch64.rpm"
RPM_HASH = "de8e016fe3d81a84f5bcca3c2e663840848453a2139c3e858bb28fb194d6dcc133ef7d61e7d27e3b1064bc15fce58ff2baf107eaf88ed252125dc554313736e3"

RPROVIDES:${PN} += "pfsglview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libGLX.so.0 \
libOpenGL.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libglut.so.3 \
libgomp.so.1 \
libm.so.6 \
libpfs.so.2 \
libstdc++.so.6"

inherit rpm
