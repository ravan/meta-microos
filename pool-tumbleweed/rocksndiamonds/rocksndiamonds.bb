SUMMARY = "Colorful Boulderdash'n'Emerald Mine'n'Sokoban'n'Stuff"
DESCRIPTION = "This is a nice little game with color graphics and sound for your Unix system \
with color X11.  You need an 8-Bit color display or better.  It will not work \
on black&white systems, and maybe not on gray scale systems. \
 \
If you know the game Boulder Dash (Commodore C64) or Emerald Mine (Amiga), \
you know what Rocks'n'Diamonds is about."
LICENSE = "GPL-2.0-or-later"

PV = "4.4.2.4"

RPM_NAME = "rocksndiamonds-4.4.2.4-1.1.aarch64.rpm"
RPM_HASH = "5d59c72c98405a65e6858538aab315b82ab502caa259b12cee73946c85cacd16f55790c3b17a30c42a3a78bc7daaeea6745f881092e56223f939747f92c58f30"

RPROVIDES:${PN} += "rocksndiamonds"

RDEPENDS:${PN} += "group-games \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libc.so.6 \
libm.so.6 \
libz.so.1 \
rocksndiamonds-data \
user-games"

inherit rpm
