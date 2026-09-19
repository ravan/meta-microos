SUMMARY = "Emu10k1 patch loader for ALSA"
DESCRIPTION = "This package contains the patch loader program for Emu10k1 and Emu10k1 on ALSA."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.8p1"

RPM_NAME = "ld10k1-0.1.8p1-29.4.aarch64.rpm"
RPM_HASH = "c460e6744ac699246c2a42efb45a7f7d7605468edc834626a61f5adb1df090c6d591efcfb1309d4d63ac484db5c059f0f451c77d76060db811428c7b4277f0d6"

RPROVIDES:${PN} += "alsa-tools-/usr/bin/lo10k1 \
ld10k1"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
liblo10k1.so.0"

inherit rpm
