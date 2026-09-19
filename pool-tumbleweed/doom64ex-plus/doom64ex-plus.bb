SUMMARY = "An improved modern version of Doom64EX"
DESCRIPTION = "Doom 64 EX+ is a continuation project of Samuel 'Kaiser' Villarreal's \
Doom 64 EX aimed to recreate DOOM 64 as closely as possible with \
additional modding features. \
 \
Doom64EX is a reverse-engineering project aimed to recreate \
Doom64 as close as possible with additional modding features. \
 \
You must place file DOOM64.WAD (case-sensitive) from the Steam or GOG version \
of Doom 64 into either folder /usr/share/games/doom64ex-plus or ~/.local/share/doom64ex-plus"
LICENSE = "GPL-2.0-or-later"

PV = "4.0.0.3"

RPM_NAME = "doom64ex-plus-4.0.0.3-3.6.aarch64.rpm"
RPM_HASH = "19b5a15fde55f5af8119ef69dc9569d7d53304bf65f9d87dd824febac7da32e8f198deefb11b029578f06c15ebcaeed4cd0017177a35beab59a89c3a915bc5a7"

RPROVIDES:${PN} += "doom64ex-plus"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL3.so.0 \
libc.so.6 \
libfluidsynth.so.3 \
libm.so.6 \
libpng16.so.16"

inherit rpm
