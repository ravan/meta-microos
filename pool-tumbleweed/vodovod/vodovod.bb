SUMMARY = "Pipe connecting action puzzle game"
DESCRIPTION = "You get a limited number of pipes on each level and need to combine \
them such that water from the house at the top of the screen can flow \
to the storage tank at the bottom. Points will be awarded per each \
pipe segment through which water flows, and the goal of the game is \
to reach a high score. Some of the levels also have obstacles where \
pipes cannot be placed. The game is playable with joystick/joypad as \
well."
LICENSE = "GPL-2.0+"

PV = "1.10_svn23"

RPM_NAME = "vodovod-1.10_svn23-4.10.aarch64.rpm"
RPM_HASH = "312abf2da5c6f5deaca3ecfb41ebb2c4e57737007a06fd37176a9d222a9e6cd8b1f8ab68c5d9c5e2672828520997c74007a82a9c1a7c4b1382a6e2388556f955"

RPROVIDES:${PN} += "vodovod"

RDEPENDS:${PN} += "group-games \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libSDL-ttf-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
user-games"

inherit rpm
