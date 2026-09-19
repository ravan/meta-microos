SUMMARY = "Audio-Visual Demonstration for Text Terminal"
DESCRIPTION = "BB is a high quality audio-visual demonstration for your text terminal. \
It is a portable demo, so you can run it on plenty of operating \
systems and DOS."
LICENSE = "GPL-2.0-or-later"

PV = "1.3~rc1"

RPM_NAME = "bb-1.3~rc1-2.9.aarch64.rpm"
RPM_HASH = "a1e5de8da762cf78239fb373badb9e342a1f935c32c9c11c9ca6859310194ce55d6e22d93b3e74f054a1345a5cd26140b3ffa73c0fb7d0bda27f310eea2e5ed6"

RPROVIDES:${PN} += "bb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaa.so.1 \
libc.so.6 \
liblzo2.so.2 \
libm.so.6 \
libmikmod.so.3"

inherit rpm
