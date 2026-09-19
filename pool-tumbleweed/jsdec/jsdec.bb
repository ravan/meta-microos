SUMMARY = "Simple decompiler for Rizin"
DESCRIPTION = "Simple decompiler for Rizin. \
Converts asm to pseudo-C code."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.9.0"

RPM_NAME = "jsdec-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "f594c2ca2b5e1ca978eebd71212dbcc763684966c7f1a7c86eef8c6b90d3361cda01dbd6315507243bc93b1139ee283e42b0fd0b29e1d5448416742ae1c24d71"

RPROVIDES:${PN} += "jsdec \
libcore-pdd.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
librz-arch.so.0.9 \
librz-config.so.0.9 \
librz-cons.so.0.9 \
librz-core.so.0.9 \
librz-util.so.0.9 \
rizin"

inherit rpm
