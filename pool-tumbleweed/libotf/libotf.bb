SUMMARY = "Library for Handling OpenType Fonts"
DESCRIPTION = "Library for handling OpenType fonts,especially those needed for CJK and other non-Latin \
languages."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.16"

RPM_NAME = "libotf-0.9.16-2.9.aarch64.rpm"
RPM_HASH = "bc907d351194a5cceeb5037049011de81309709b967dddd28e33da870e0e7287322a544b560b945072bc01d7bcae3f13ae256ba4083000f15430d57c534b2c29"

RPROVIDES:${PN} += "libotf"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6 \
libfreetype.so.6 \
libotf.so.1"

inherit rpm
