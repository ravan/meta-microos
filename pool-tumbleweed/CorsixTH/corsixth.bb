SUMMARY = "Theme Hospital clone"
DESCRIPTION = "This project aims to reimplement the game engine of Theme Hospital, and be \
able to load the original game data files. This means that you will need a \
purchased copy of Theme Hospital, or a copy of the demo, in order to use \
CorsixTH. After most of the original engine has been reimplemented in open \
source code, the project will serve as a base from which extensions and \
improvements to the original game can be made."
LICENSE = "MIT"

PV = "0.70.1"

RPM_NAME = "CorsixTH-0.70.1-1.1.aarch64.rpm"
RPM_HASH = "1809bd6421a9d0585c8996ac1bf6f0cb5e2e365b4e1071be3d7bab7115f2dd8ca951211a5e030c5383c203367f0891eae62f140f321ec6eef225dfc1cfdaba1e"

RPROVIDES:${PN} += "CorsixTH"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libpng16.so.16 \
librtmidi.so.7 \
libstdc++.so.6 \
libswresample.so.6 \
libswscale.so.9 \
libz.so.1 \
lua-lpeg \
lua-luafilesystem"

inherit rpm
