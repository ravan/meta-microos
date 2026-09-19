SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "5ab05371e2ac306461898b6a9c2826b1956f3b7101243396e78ec52320a6e7a79dc2acd0838d6a6895a8f87bc18ad305cfe832dd3029c991b0f2056a6f310a0a"

RPROVIDES:${PN} += "binutils \
libbfd-2.45.0.20251103-4.so \
libdep.so \
libgprofng.so.0 \
libopcodes-2.45.0.20251103-4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/env \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libctf-nobfd.so.0 \
libctf.so.0 \
libgcc-s.so.1 \
libsframe2 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
