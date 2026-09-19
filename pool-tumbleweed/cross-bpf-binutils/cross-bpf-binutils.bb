SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-bpf-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "f54dd204d8e9acc47f01dd8fb14c4dc9a4f831203e358785626e853cdc8f1a2dd236c6c0b57aa30df45bfd4270893c5f694bc06d4ab4ebdf25c002e38f2b84ad"

RPROVIDES:${PN} += "cross-bpf-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
