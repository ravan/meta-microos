SUMMARY = "Puzzle game where you steer a beam of light using mirrors"
DESCRIPTION = "This is a nice little game with color graphics and sound for your \
Unix system with color X11. You need an 8-bit color display or better. \
It will not work on black&white systems, and maybe not on gray scale \
systems. \
 \
It was first released as 'Mindbender' in the year 1989 on the Amiga \
(with ports on other computer systems) and is in fact a clone of the \
C64 game 'Deflektor'."
LICENSE = "GPL-2.0-only"

PV = "3.3.1"

RPM_NAME = "mirrormagic-3.3.1-2.6.aarch64.rpm"
RPM_HASH = "c97cb288f68ed6ca6c77c918ef6ac1c430fb3a7068c2bace09f8989beeb2ca2754c22591ff90ad9a75623a9ed025138c2a827b172c86b0aabc62eab6126bc060"

RPROVIDES:${PN} += "mirrormagic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
