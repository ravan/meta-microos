SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-ppc64le-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "f73c22959f52a55905e556b13b1382d564bb05561f384ce8bde6e71d1daec8c2c20efa83c5bc8cd8566486d3af2bbe5f5869badaf5988ee2b638e3f1c499cc1f"

RPROVIDES:${PN} += "cross-ppc64le-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
