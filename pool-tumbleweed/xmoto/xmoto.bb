SUMMARY = "2D motocross platform game"
DESCRIPTION = "X-Moto is a challenging 2D motocross platform game, where physics play \
an all important role in the gameplay. You need to control your bike to \
its limit, if you want to have a chance finishing the more difficult of \
the challenges.  First you'll try just to complete the levels, while \
later you'll compete with yourself and others, racing against the \
clock."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.3"

RPM_NAME = "xmoto-0.6.3-1.7.aarch64.rpm"
RPM_HASH = "32ce7dd8bdf5f33d0d05eb590d91370c3c42f098b3d0e83882f33b2c02e11a231e96086ae907dfee191fd825cd371ffa4928a71fd0681aeccf6f8a123febf514"

RPROVIDES:${PN} += "xmoto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libbz2.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libjpeg.so.8 \
liblua5.4.so.5 \
libm.so.6 \
libpng16.so.16 \
libsqlite3.so.0 \
libstdc++.so.6 \
libxml2.so.16 \
libz.so.1 \
xmoto-data"

inherit rpm
