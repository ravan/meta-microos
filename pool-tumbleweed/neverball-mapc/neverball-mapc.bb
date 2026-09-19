SUMMARY = "Mapc is a program designed to compile the levels"
DESCRIPTION = "Mapc is a program designed to compile the levels made with Radiant \
to make them usable in Neverball and Neverputt. \
All instructions are based upon using command lines. \
 \
The output will be saved to Imap.sol. \
 \
https://icculus.org/neverball/mapping/"
LICENSE = "GPL-2.0-or-later"

PV = "1.6+git.20240820"

RPM_NAME = "neverball-mapc-1.6+git.20240820-1.2.aarch64.rpm"
RPM_HASH = "660486e12e4b142260008e989bdb948c2047fa7d261b52a0a5f3fd77bcc1aefdb87407dbdac69cf7a34a5a5eea43eb985812d41afec225512734b24d2e178383"

RPROVIDES:${PN} += "neverball-mapc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-net-2.0.so.0 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
neverball"

inherit rpm
