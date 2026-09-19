SUMMARY = "GNU Modula-2 Compiler"
DESCRIPTION = "This package contains a Modula-2 compiler."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "gcc14-m2-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "00a0dbe7559a4658d1dd80da78849e3c26f4a8c30ad0c5092eb1c2211d20e8766fe4115add5bff0e2d67c92e1a917cc6b768c109f8a4f65decbefc46c0b34aec"

RPROVIDES:${PN} += "gcc14-m2"

RDEPENDS:${PN} += "gcc14 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libm2cor19 \
libm2iso19 \
libm2log19 \
libm2min19 \
libm2pim19 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++.so.6 \
libstdc++6-devel-gcc14 \
libz.so.1 \
libzstd.so.1"

inherit rpm
