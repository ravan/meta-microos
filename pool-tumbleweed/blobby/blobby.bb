SUMMARY = "2D Arcade Beach Volleyball Game"
DESCRIPTION = "Blobby Volley is one of the most popular freeware games. This is caused \
first by the simple play principle and second by the funny design of \
the player. The short duration of a game is a reason for playing this \
game in meantime."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1"

RPM_NAME = "blobby-1.1.1-2.5.aarch64.rpm"
RPM_HASH = "7fd3541096ebdd724b90ba83d181c4bdf54d15a44dec46ca10c08775554eb4f8f8ccdce46f027aeb46f01102cdf9a39ac836804b27d88c7df5e062f9d9c7d378"

RPROVIDES:${PN} += "blobby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libphysfs.so.1 \
libstdc++.so.6 \
libtinyxml2.so.11"

inherit rpm
