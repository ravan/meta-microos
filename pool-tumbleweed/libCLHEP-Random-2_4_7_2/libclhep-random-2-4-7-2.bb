SUMMARY = "Shared library for CLHEP Random"
DESCRIPTION = "This package provides the CLHEP Random shared library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "libCLHEP-Random-2_4_7_2-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "72c28e059dc93edcdb4292fbe45dc1135144493aaff3c2e5d6a266ba9a47baeee8dff01f3246d1935ad89b6a2c769f9ae0e84a9eeb589640cbd3bcdcb5c8bd8b"

RPROVIDES:${PN} += "libCLHEP-Random-2-4-7-2 \
libCLHEP-Random-2.4.7.2.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
