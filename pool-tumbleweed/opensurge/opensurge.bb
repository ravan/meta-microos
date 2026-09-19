SUMMARY = "Game based on Sonic the Hedgehog Universe"
DESCRIPTION = "Open Surge is a retro-style 2D sidescroller inspired by old-school \
games. The characters named Surge, Neon and Charge are to save the \
world from the evil Gimacian the Dark."
LICENSE = "Apache-2.0 & GPL-3.0-or-later & LGPL-2.1-or-later & CC-BY-3.0 & OFL-1.1 & MIT"

PV = "0.6.1.3"

RPM_NAME = "opensurge-0.6.1.3-1.4.aarch64.rpm"
RPM_HASH = "7ab55a5172daf5af2f3906ab04f95928ca73695175f54e19f4f73c461c4233088a54cda9fe0a3fd754a46214f489215976c2af0d315f4d0f44e3534a01f4bdad"

RPROVIDES:${PN} += "opensurge"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
liballegro-acodec.so.5.2 \
liballegro-audio.so.5.2 \
liballegro-dialog.so.5.2 \
liballegro-font.so.5.2 \
liballegro-image.so.5.2 \
liballegro-memfile.so.5.2 \
liballegro-physfs.so.5.2 \
liballegro-primitives.so.5.2 \
liballegro-ttf.so.5.2 \
liballegro.so.5.2 \
libc.so.6 \
libm.so.6 \
libphysfs.so.1 \
libsurgescript.so.0.6.1"

inherit rpm
