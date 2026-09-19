SUMMARY = "Library for interfacing Python with VapourSynth"
DESCRIPTION = "VSScript (or libvsscript) is a library for interfacing Python \
with VapourSynth."
LICENSE = "LGPL-2.1-only"

PV = "79"

RPM_NAME = "libvsscript0-79-1.1.aarch64.rpm"
RPM_HASH = "a4cd8c1b7a9c2c5a35501a1ca8bd6ffa92bba2c19af1ffb676285f912525d141727dd483d60d0305d3a0eda13446a19018552896145b372c089b03bfab013d2d"

RPROVIDES:${PN} += "libvsscript.so.0 \
libvsscript0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python3-vapoursynth"

inherit rpm
