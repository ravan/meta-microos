SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-riscv64-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "c1601ac0cc12ac1cebcb79653621ea11b568d03cbb75fd68c9dfc3d8dc384eb8936d97d36fe08e813cd52de761a7314ab5f1ae9d48f55fe823991293400e9270"

RPROVIDES:${PN} += "cross-riscv64-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
