SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-ppc-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "84eee0dc2eb20ad011559eb4c0a97c8d8cc2198f0a49b15e1667107872762a0ae131bae1a13811c11035bfea8acfa4efa98085e0014f085df85390e4c9627bdf"

RPROVIDES:${PN} += "cross-ppc-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
