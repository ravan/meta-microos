SUMMARY = "CDDA reader"
DESCRIPTION = "This CD-DA reader distribution ('libcdio-cdparanoia') reads audio from \
CD-ROMs directly as data, with no analog step between, and writes \
the data to a file or pipe as .wav, .aifc or as raw 16-bit linear PCM."
LICENSE = "GPL-3.0-or-later"

PV = "10.2+2.0.1"

RPM_NAME = "cd-paranoia-10.2+2.0.1-1.19.aarch64.rpm"
RPM_HASH = "76eb302dfe50ed192ef086937e41464457918ede0abeed67161e3150d6be012bd0a45725e0908550680f36abb8ff35fe035112dc55f822c608a664471fbb0d35"

RPROVIDES:${PN} += "cd-paranoia"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio-cdda.so.2 \
libcdio-paranoia.so.2 \
libcdio.so.19 \
libm.so.6"

inherit rpm
