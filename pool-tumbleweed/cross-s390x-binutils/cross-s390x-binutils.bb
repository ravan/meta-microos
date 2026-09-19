SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-s390x-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "29b5defa36bd88fd5db2263b1382fcbc74395a673e3472b287558195da9d815a681e778d7adcd62ee0fb774a3781741485f81b4e7ca2f7e25d6f932cbcd1252a"

RPROVIDES:${PN} += "cross-s390x-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
