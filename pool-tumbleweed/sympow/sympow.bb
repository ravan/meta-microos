SUMMARY = "Program to compute symmetric power elliptic curve L-functions"
DESCRIPTION = "SYMPOW is a mathematical program to compute special values of \
symmetric power elliptic curve L-functions; it can compute up to \
about 64 digits of precision."
LICENSE = "BSD-2-Clause"

PV = "2.023.7"

RPM_NAME = "sympow-2.023.7-1.8.aarch64.rpm"
RPM_HASH = "f1a4a665fd35e6c24f9555fe6726512ee11cc58352aac1047fe04a7f4256a4fb3ef4dd19b07375fc2bf7ba9139c2d502b8e67b79a79d6c79464209fd2695f7cf"

RPROVIDES:${PN} += "sympow"

RDEPENDS:${PN} += "/usr/bin/sh \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
pari-gp \
sed"

inherit rpm
