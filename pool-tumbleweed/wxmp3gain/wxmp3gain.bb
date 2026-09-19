SUMMARY = "Front-end for mp3gain based on wxWidgets"
DESCRIPTION = "A front-end for mp3gain based on the wxWidgets toolkit."
LICENSE = "GPL-3.0-or-later"

PV = "4.0"

RPM_NAME = "wxmp3gain-4.0-3.9.aarch64.rpm"
RPM_HASH = "3fd3a19257745e7d9675bd1ac433804f455c88453b4b43737391e7e5b0457d0ce12d85eef3ef68b4d2c6e153661aa28b41821a4b63e0f546a2eae34041825c16"

RPROVIDES:${PN} += "wxmp3gain"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0 \
mp3gain"

inherit rpm
