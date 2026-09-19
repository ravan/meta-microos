SUMMARY = "Library to convert ASCII/Latin text into PostScript"
DESCRIPTION = "The library liba2ps used by the program a2ps to convert ASCII text into PostScript."
LICENSE = "GPL-3.0-or-later"

PV = "4.15.8"

RPM_NAME = "liba2ps1-4.15.8-1.1.aarch64.rpm"
RPM_HASH = "0ab0bb9c2b99386a021ce0a6d930ddc1deaa71ca88f3541c9bdfcf48a5d2c63e073be9130c1ecb04191a34c4ede51305d33fe02e9ae9b0172b6c0af15df3f0cc"

RPROVIDES:${PN} += "liba2ps.so.1 \
liba2ps1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
