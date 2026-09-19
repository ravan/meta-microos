SUMMARY = "C++ library of various utility functions"
DESCRIPTION = "Claw is a generalist library written in C++ and providing various \
structures (multitype map, AVL binary tree) and algorithms."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.1"

RPM_NAME = "libclaw1-1.9.1-1.9.aarch64.rpm"
RPM_HASH = "9c1dbc4f01f6d586fda5bbb3372e9d1a976fbf6834f0f005f2de57d2f1618e5f29702d1a2ed8016b664a5ea7ff1e795de911377a3a118dfd790014e760b97c02"

RPROVIDES:${PN} += "libclaw-application.so.1 \
libclaw-configuration-file.so.1 \
libclaw-dynamic-library.so.1 \
libclaw-graphic.so.1 \
libclaw-logger.so.1 \
libclaw-net.so.1 \
libclaw-tween.so.1 \
libclaw1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
