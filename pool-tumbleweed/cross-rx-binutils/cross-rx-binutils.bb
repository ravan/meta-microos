SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-rx-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "63273d9d44e8683e8fa1dfba14d6f4ea171b3eb1661b92987e0d14f253b83c49c914e96efbb5eb984d1c60d4f5ef08cea8978976ce4c977064f15794c59b3ca7"

RPROVIDES:${PN} += "cross-rx-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
