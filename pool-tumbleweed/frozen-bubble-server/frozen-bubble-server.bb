SUMMARY = "Puzzle with Bubbles - Server"
DESCRIPTION = "Server for frozen-bubble. \
 \
Colorful 3D rendered penguin animations, 100 levels of 1p game, hours and \
hours of 2p game, nights and nights of 2p/3p/4p/5p game over LAN or Internet, \
a level-editor, 3 professional quality digital soundtracks, 15 stereo sound \
effects, 8 unique graphical transition effects, 8 unique logo eye-candies."
LICENSE = "GPL-2.0-or-later"

PV = "2.212"

RPM_NAME = "frozen-bubble-server-2.212-18.5.aarch64.rpm"
RPM_HASH = "6096fc550721e0b010063ee464b4a6e7b547085eb451df3c5b807af575be9148365c4ed3b3601af744c25bc80c2346e6b30664459e48b90b74eca197ce4e802c"

RPROVIDES:${PN} += "config-frozen-bubble-server \
frozen-bubble-server"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
systemd"

inherit rpm
