SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-i386-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "8af179402e8f7d21d276d2b5ebeb01e54dd5ff5c0eb9038034ce99460d147f33d17673d658ec4d08df5445b6c90f3b2b19d2875c6cb5eed5d073bcc351c8406f"

RPROVIDES:${PN} += "cross-i386-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
