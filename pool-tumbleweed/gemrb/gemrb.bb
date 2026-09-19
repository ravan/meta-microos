SUMMARY = "Game engine made with pre-rendered background"
DESCRIPTION = "GemRB is an implementation of Bioware's Infinity Engine which was \
written to support pseudo-3D role playing games based on the \
Dungeons & Dragons ruleset. \
 \
You will need the original game files of Baldur's Gate and the Icewind \
Dale series or Planescape: Torment to play."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.5"

RPM_NAME = "gemrb-0.9.5-1.2.aarch64.rpm"
RPM_HASH = "7024624a35934bb6e8c52a4e5bba9260e570fbcb3509a9686f7be1677fa69423d3abfa95059a51551bd13b97e3e5a33b1dba42d905fd21ee021e3b83e257c385"

RPROVIDES:${PN} += "config-gemrb \
gemrb \
libgemrb-core.so.0.9.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libOpenGL.so.0 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmvec.so.1 \
libopenal.so.1 \
libpng16.so.16 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
libvlc.so.5 \
libvorbisfile.so.3 \
libz.so.1"

inherit rpm
