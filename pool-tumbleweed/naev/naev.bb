SUMMARY = "2D action RPG space game"
DESCRIPTION = "Naev is a 2D space trading and combat game, in a similar vein to Escape Velocity. \
 \
Naev is played from a top-down perspective, featuring fast-paced combat, many ships, \
a large variety of equipment and a large galaxy to explore. The game is \
open-ended, letting you proceed at your own pace."
LICENSE = "GPL-3.0-only"

PV = "0.12.6"

RPM_NAME = "naev-0.12.6-1.9.aarch64.rpm"
RPM_HASH = "ca121b5078670374bd6a4b6e95ea9ddd7ab3392446b9a0eeda31708c01e291f5a7d8358294a5a273ecd7314cfabe5ad211e29e1e9d242c4d6ddb88ef56c36a85"

RPROVIDES:${PN} += "naev"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libc.so.6 \
libcholmod.so.5 \
libcmark.so.0.31.1 \
libcxsparse.so.4 \
libenet.so.7 \
libfreetype.so.6 \
libglpk.so.40 \
libluajit-5.1.so.2 \
libm.so.6 \
libnfd.so.1 \
libopenal.so.1 \
libopenblas.so.0 \
libpcre2-8.so.0 \
libphysfs.so.1 \
libunibreak.so.6 \
libvorbis.so.0 \
libvorbisfile.so.3 \
libxml2.so.16 \
libyaml-0.so.2"

inherit rpm
