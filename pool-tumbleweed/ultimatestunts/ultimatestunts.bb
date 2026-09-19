SUMMARY = "A racing game in the style of 'Stunts'"
DESCRIPTION = "Ultimate Stunts is a remake of the famous DOS game 'Stunts'. Racing in \
Ultimate Stunts involves some really spectacular stunts, like \
loopings, corkscrews, bridges to jump over, etc. You can also design \
your own tracks."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.7.1"

RPM_NAME = "ultimatestunts-0.7.7.1-3.4.aarch64.rpm"
RPM_HASH = "d788c68010a7c5a2523ea20676b4a3830ea7323d220600d67a0934fe6f87a6861f17c78f9b46e637aa190420ef17b814fb4c86dc07688594e4b9fd0abfd5a66e"

RPROVIDES:${PN} += "config-ultimatestunts \
ultimatestunts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libalut.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libstdc++.so.6 \
libvorbisfile.so.3 \
ultimatestunts-data"

inherit rpm
