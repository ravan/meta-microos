SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-sparc-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "1bc307af406b7431a8de6e15094f8b2155d34b74730c4dcd9eff54a20b12455e3b1b3fbb3bd33126f37efb52b8ae24c770b62a0eed9de5b202b98e857fe2e54e"

RPROVIDES:${PN} += "cross-sparc-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
