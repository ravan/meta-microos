SUMMARY = "Old-school Arcade-style Tile-based Bomb-dropping Deathmatch Game"
DESCRIPTION = "3omns is an old-school arcade-style tile-based bomb-dropping deathmatch game."
LICENSE = "GPL-3.0-or-later"

PV = "0.2"

RPM_NAME = "3omns-0.2-4.10.aarch64.rpm"
RPM_HASH = "c76385dc0923cc1b8ff77e70952b5c86bea1ba9f44e696536a0f3bbcc48306ce23dd87ec6d6435bbb9f4a8c22df2d8047d7acd0ff382a111c0adb1b3b105aa6c"

RPROVIDES:${PN} += "3omns"

RDEPENDS:${PN} += "bitstream-vera-fonts \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
liblua5.3.so.5"

inherit rpm
