SUMMARY = "Transport and Economic Simulation Game"
DESCRIPTION = "Simutrans is a transport and economic simulation with some ecological \
aspects. The goal of the game is to build an infrastructure which \
allows you to transport goods between the various industries and towns, \
and to support the towns with water and energy. A second goal is to \
become as rich as possible, but you will have to reinvest a good part \
of your earned money to expand your infrastructure network."
LICENSE = "Artistic-1.0"

PV = "124.4.1"

RPM_NAME = "simutrans-124.4.1-1.2.aarch64.rpm"
RPM_HASH = "4806e97f6c35671d14c76236516adf8f5ded91fa695344a15504cc100363734866b2d81ae5edc6d7e3f576c054b7fa6a56fd4a7849856db23ee9ed28cb02de7c"

RPROVIDES:${PN} += "simutrans"

RDEPENDS:${PN} += "/usr/bin/sh \
fluid-soundfont-gm \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libbz2.so.1 \
libc.so.6 \
libfluidsynth.so.3 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
