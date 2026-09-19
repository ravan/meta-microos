SUMMARY = "A real-time strategy game of ancient warfare"
DESCRIPTION = "0 A.D. (pronounced 'zero ey-dee') is a real-time strategy (RTS) game \
of ancient warfare. It is a historically-based war/economy game that \
allows players to relive or rewrite the history of Western \
civilizations, focusing on the years between 500 B.C. and 500 A.D. \
The project contains 3D graphics, detailed artwork, sound, and a \
flexible game engine."
LICENSE = "BSD-3-Clause & CC-BY-SA-3.0 & GPL-2.0-or-later & LGPL-3.0-or-later & MIT & ISC & MPL-2.0"

PV = "0.28.0"

RPM_NAME = "0ad-0.28.0-1.5.aarch64.rpm"
RPM_HASH = "71f266d90d23c4da8a0d72937299b8d3f28fd5bead5091b935f869f1b8d272376aa592f0fdfb1c65e60bde4c243ba233b8e74ba06eb9699a7fe1ea27e54e5d73"

RPROVIDES:${PN} += "0ad \
libAtlasUI.so \
libCollada.so"

RDEPENDS:${PN} += "/usr/bin/sh \
0ad-data \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libc.so.6 \
libcurl.so.4 \
libenet.so.7 \
libfmt.so.12 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgloox.so.18 \
libicui18n.so.78 \
libicuuc.so.78 \
libm.so.6 \
libminiupnpc.so.21 \
libmozjs-140.so.0 \
libopenal.so.1 \
libpng16.so.16 \
libsodium.so.26 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisfile.so.3 \
libwx-baseu-suse.so.16.0.0 \
libwx-baseu-xml-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0 \
libwx-gtk2u-gl-suse.so.16.0.0 \
libxml2.so.16 \
libz.so.1"

inherit rpm
