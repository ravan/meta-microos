SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-x86_64-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "0e77ae4b0f37d6ea2d603e360782f848ba6c03eb327fdb571c2af027d8636935ceb8b75987d6fec5fb752ce2dae7811991222b7ba94e2cbacaad970b96bb6e2e"

RPROVIDES:${PN} += "cross-x86-64-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
