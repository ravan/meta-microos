SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "cross-pru-binutils-2.45-4.3.aarch64.rpm"
RPM_HASH = "b3ceb267bb44ece0246b62b0f10ebb76294dc3b916f4db082e725acd6109a5f7508d463010841b81dc4302477068df19869d61a30fc115e7bf928e245fe59fee"

RPROVIDES:${PN} += "cross-pru-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
