SUMMARY = "Enhanced Quake 2 Source Port"
DESCRIPTION = "Yamagi Quake II is an enhanced client for id Software's Quake II. The \
main focus is an unchanged single player experience; the gameplay and \
graphics are unaltered. It also features: anisotropic filtering and \
multi-sample anti-aliasing, widescreen aspect ratio and unlimited \
screen size, compatibility with most mods, optional support for \
retexturing packs and HUD scaling."
LICENSE = "GPL-2.0-only"

PV = "8.70"

RPM_NAME = "yamagi-quake2-8.70-2.2.aarch64.rpm"
RPM_HASH = "fdba068ca52c8664bc43b3d5e5ed07c2b166b55dbb3a65cc1b1cbfc6820f4265bec2803f5748b7d9936d9c6c958683020073e4f7b0c55e1e4c7b81418b78c360"

RPROVIDES:${PN} += "yamagi-quake2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libOpenGL.so.0 \
libSDL3.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
