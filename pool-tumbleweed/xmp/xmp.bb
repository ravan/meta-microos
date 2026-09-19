SUMMARY = "Extended Module Player for MOD/S3M/XM/IT/etc."
DESCRIPTION = "The Extended Module Player is a command-line mod player for Unix-like \
systems that plays over 90 mainstream and obscure module formats from \
Amiga, Atari, Acorn, Apple IIgs, C64, and PC, including Protracker \
(MOD), Scream Tracker 3 (S3M), Fast Tracker II (XM), and Impulse \
Tracker (IT) files."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "xmp-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "edc645266af176e6d36d37ffdaa391ff9fe89ab178ea178ee2c958f43e629bdcc40b02ebc9110ca2eef2e30eaa787cba91e20fc79a3580e1a2833c3c70f13d8b"

RPROVIDES:${PN} += "config-xmp \
xmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libpulse-simple.so.0 \
libpulse.so.0 \
libxmp.so.4"

inherit rpm
