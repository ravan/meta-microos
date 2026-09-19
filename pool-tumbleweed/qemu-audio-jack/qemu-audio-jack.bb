SUMMARY = "JACK based audio support for QEMU"
DESCRIPTION = "This package contains a module for JACK based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-audio-jack-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "685cd88aedf6338977587f12f3560f7cbaa519bb698884e84c535f32ba6906f1cec1730bf12871639a256690947a39353b7207539626ea5cb2505bb557c225f1"

RPROVIDES:${PN} += "qemu-audio-jack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjack.so.0"

inherit rpm
