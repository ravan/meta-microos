SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-epiphany-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "f91c0bac4be7c14801739f87525c715951074c4e4e22e85e59839cf025d517825741694a207f733c059382ad2d9f72e615d18cb7c8c077b42fb3cac477017218"

RPROVIDES:${PN} += "cross-epiphany-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
