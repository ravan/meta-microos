SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-s390-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "10b9a4b21767f500ce36387743fe2aed5e36e5dc4a980c489432a988196f8dce75020a74030b20d65fe74b67b627bad597b44303851db8dd2cffa659afd35f58"

RPROVIDES:${PN} += "cross-s390-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
