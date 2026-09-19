SUMMARY = "Jump'n run game"
DESCRIPTION = "SuperTux is a classic 2D jump'n run sidescroller game in a similar \
style like the original SuperMario games."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later & GPL-2.0-or-later & GPL-1.0-only"

PV = "0.7.0"

RPM_NAME = "supertux2-0.7.0-1.3.aarch64.rpm"
RPM_HASH = "d197d19bdfd7c9f19b9477adcea9e0aabd598d1fee9f8c957cbdb038c25057581784c058bf08534af844e3c5d857f12192bedd2c02645f9e8b3ea1da7278e5e5"

RPROVIDES:${PN} += "libsimplesquirrel.so \
supertux2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libcurl.so.4 \
libepoxy.so.0 \
libfmt.so.12 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libphysfs.so.1 \
libpng16.so.16 \
libstdc++.so.6 \
libvorbisfile.so.3 \
libz.so.1"

inherit rpm
