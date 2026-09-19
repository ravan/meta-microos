SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-hppa-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "766730204d813ef9fe14461834e983e02ac3ee297d4d6a1a16395bbae80d279b55921751effec568e9db3ccd80a28946ce2db6a7193cc3afb5887177377fe524"

RPROVIDES:${PN} += "cross-hppa-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
