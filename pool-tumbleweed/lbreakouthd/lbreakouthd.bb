SUMMARY = "Classic Breakout-Style Game"
DESCRIPTION = "LBreakoutHD is a scaleable 16:9 remake of LBreakout2, a Breakout-style \
arcade game for Linux featuring a number of added graphical enhancements \
and effects. You control a paddle at the bottom of the playing field \
and must destroy bricks at the top by bouncing balls against them."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4"

RPM_NAME = "lbreakouthd-1.2.4-1.1.aarch64.rpm"
RPM_HASH = "175a38868f93371913cb27456edb28c88cc0911a50b9ec3fc9f95f2a719f7b256237db21e6625e1c6cad695705881ca402ccbe8fd4c80c982f5748d1b5c98a11"

RPROVIDES:${PN} += "lbreakouthd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
user-games"

inherit rpm
