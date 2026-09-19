SUMMARY = "Exchange-correlation functionals with arbitrary-order derivatives"
DESCRIPTION = "XCFun is a library of exchange-correlation (XC) functionals to be used in \
density-functional theory (DFT) codes."
LICENSE = "MPL-2.0"

PV = "2.1.1"

RPM_NAME = "libxcfun2-2.1.1-1.22.aarch64.rpm"
RPM_HASH = "81753b82dd88d7f66ecf752e6c7163d44ae8b751e429112f6eb6e24acef21742980377fce05862082d4f8d0bf381e5928515b111bd8580c426c245f5ee758bc6"

RPROVIDES:${PN} += "libxcfun.so.2 \
libxcfun2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
