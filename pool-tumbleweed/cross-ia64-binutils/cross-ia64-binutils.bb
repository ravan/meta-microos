SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-ia64-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "182f6929ca5ab36de1be82a361cdb0fcbbafafca94f4c31b296122d005d2147bec42eb5eac975c9c66fcb45fc46d0d3624a000eeac71336806775ce441c3ec92"

RPROVIDES:${PN} += "cross-ia64-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
