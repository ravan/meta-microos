SUMMARY = "Mission and Objective based 2D Platform Game"
DESCRIPTION = "Blob Wars : Metal Blob Solid. This is Episode I of the Blob Wars Saga. \
This is a platform game, not unlike those found on the Amiga and SNES. \
The object of the game is to take on the role of solider Blob, Bob, \
and play through the various levels and attempt to rescue as many MIA \
(Missing In Action) Blobs as possible. This is not quite as straight \
forward as it sounds, since the MIAs will often be not directly \
reachable and will require some extra thought. Bob also has to \
contend with environmental hazards, alien invaders and assimilated Blobs."
LICENSE = "GPL-2.0-or-later"

PV = "2.00"

RPM_NAME = "blobwars-2.00-4.10.aarch64.rpm"
RPM_HASH = "6995519a44eddcf57d0d6bbebb96af1277229557b47a842ddaabcb3ff8d082d85266cab746ffac9d7bc00356cbe3ffbf87c5312c9ed1301559028a08c8b9d472"

RPROVIDES:${PN} += "blobwars"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
