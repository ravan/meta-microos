SUMMARY = "Innovative 3D real-time strategy"
DESCRIPTION = "You command the forces of 'The Project' in a battle to rebuild \
the world after mankind has almost been destroyed by nuclear \
missiles. \
 \
The game offers campaign, multi-player and single-player skirmish \
modes. An extensive tech tree with over 400 different \
technologies, combined with the unit design system, allows for \
a wide variety of possible units and tactics. \
 \
Warzone 2100 was originally developed as a commercial game by \
Pumpkin Studios and published in 1999, and was released as \
open source by them in 2004, for the community to continue \
working on it. \
 \
This package provides the binaries for Warzone 2100."
LICENSE = "BSD-3-Clause & CC-BY-SA-3.0 & GPL-3.0-or-later & CC0-1.0 & LGPL-2.1-only"

PV = "4.7.0"

RPM_NAME = "warzone2100-4.7.0-1.4.aarch64.rpm"
RPM_HASH = "1a6c7373fa49b374900dc600545754d72eb626f1dcd360c6c3477cdb55d50ef39dc02de0432ea527993d854d03858d034cc3f7e030738847f477f0cc71c72ae1"

RPROVIDES:${PN} += "warzone2100"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL3.so.0 \
libc.so.6 \
libcurl.so.4 \
libfreetype.so.6 \
libfribidi.so.0 \
libgcc-s.so.1 \
libharfbuzz.so.0 \
libm.so.6 \
libminiupnpc.so.21 \
libogg.so.0 \
libopenal.so.1 \
libopus.so.0 \
libphysfs.so.1 \
libpng16.so.16 \
libprotobuf.so.36.1.0 \
libsodium.so.26 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtheoradec.so.2 \
libturbojpeg.so.0 \
libvorbis.so.0 \
libvorbisfile.so.3 \
libz.so.1 \
libzip.so.5 \
warzone2100-data"

inherit rpm
