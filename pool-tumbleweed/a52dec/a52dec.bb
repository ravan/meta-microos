SUMMARY = "ATSC A/52 stream decoder library"
DESCRIPTION = "liba52 is a library for decoding ATSC A/52 streams."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "a52dec-0.8.0-1.12.aarch64.rpm"
RPM_HASH = "8eee601edd70b57ca8c73a5c10a19a13e2d31f2daf0f1665934152d95adbe88c118ca7df86638011c6ab1a367cbfc9b2c47e5feec4e0770f0330b9790bdcadf7"

RPROVIDES:${PN} += "a52 \
a52dec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
liba52-0 \
liba52.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
