SUMMARY = "Core Spice support for QEMU"
DESCRIPTION = "This package contains a module with core Spice support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-ui-spice-core-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "9ebb727dbfd552ae59663ef0650ae1f35ebb1123e127ab901d51d33a7e82ed2883d9f837128322315295ef3326899b9f8b9363fbd910ce7a2166625091080989"

RPROVIDES:${PN} += "qemu-ui-spice-core"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpixman-1.so.0 \
libspice-server.so.1 \
qemu-audio-spice \
qemu-ui-opengl"

inherit rpm
