SUMMARY = "Chinese Board Game 'Go'"
DESCRIPTION = "Chinese ancient board game."
LICENSE = "GPL-3.0-or-later"

PV = "1371149103.84a32e9c"

RPM_NAME = "gnugo-1371149103.84a32e9c-3.15.aarch64.rpm"
RPM_HASH = "d46b87041414bf91d0f72d27a8ad9fa4e35426d2780821aad7fdb8ba66ec444da31becfb1a21e8d1bc83341440cc49ecb05e6c3aba91e37f91fe3984c18ae2a6"

RPROVIDES:${PN} += "gnugo"

RDEPENDS:${PN} += "/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libtinfo.so.6"

inherit rpm
