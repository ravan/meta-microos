SUMMARY = "A map editor for Doom engine games"
DESCRIPTION = "Eureka is a map editor for the classic DOOM games, and a few related games such as Heretic and Hexen."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.0"

RPM_NAME = "eureka-2.1.0-1.6.aarch64.rpm"
RPM_HASH = "76fa32fdfb1a2bef1c0c9c36d01f800c1a07a88bd71f76c494d3b13aeae6af89d917c4207d5c5c3ff59c7c98485b1db1c48840ec382485fb0dd72f2b38b4d8de"

RPROVIDES:${PN} += "eureka"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libGLX.so.0 \
libOpenGL.so.0 \
libX11.so.6 \
libXpm.so.4 \
libc.so.6 \
libfltk-gl.so.1.3 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
