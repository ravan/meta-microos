SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-sparc64-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "4f318e3c2ae4f320b5fc6a9034def5db871430df5c4d404eaae35b9b90e04f10b42a93346aacee33e001cd0c4d322c9460f8b788cb3a065518428061c69853d4"

RPROVIDES:${PN} += "cross-sparc64-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
