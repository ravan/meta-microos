SUMMARY = "GNU Modula-2 Compiler"
DESCRIPTION = "This package contains a Modula-2 compiler."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "gcc16-m2-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "8eaab897ceeecc3ce0160f4eac3098ce73f69a004a22a32a1ec63818fc8668db3b4350006c40a36b2e76eaca38f2e9a137942e9f5be9bcef629b9b6c06a00c1c"

RPROVIDES:${PN} += "gcc16-m2"

RDEPENDS:${PN} += "gcc16 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libm2cor21 \
libm2iso21 \
libm2log21 \
libm2min21 \
libm2pim21 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++.so.6 \
libstdc++6-devel-gcc16 \
libz.so.1 \
libzstd.so.1"

inherit rpm
