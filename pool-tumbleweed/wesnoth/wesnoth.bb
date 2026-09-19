SUMMARY = "Fantasy Turn-Based Strategy Game"
DESCRIPTION = "Battle for Wesnoth is a fantasy turn-based strategy game. Battle for \
control of villages, using variety of units which have advantages and \
disadvantages in different types of terrains and against different \
types of attacks. Units gain experience and advance levels, and are \
carried over from one scenario to the next campaign."
LICENSE = "EPL-1.0 & GPL-2.0-or-later"

PV = "1.18.8"

RPM_NAME = "wesnoth-1.18.8-1.1.aarch64.rpm"
RPM_HASH = "e6f75e9ecc013acb044a8bde493f575468a8035d2ee2d15ed1d88fbfc8644b0c347d6f3653d6b1a5ae1e985a44f82367ad184a8e799c198d6c2b58956e1e2d1f"

RPROVIDES:${PN} += "wesnoth"

RDEPENDS:${PN} += "dejavu \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libboost-locale.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libboost-random.so.1.91.0 \
libc.so.6 \
libcairo.so.2 \
libcrypto.so.3 \
libcurl.so.4 \
libdbus-1.so.3 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libhistory.so.8 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libvorbisfile.so.3 \
sazanami-fonts \
wesnoth-data \
wesnoth-fslayout"

inherit rpm
