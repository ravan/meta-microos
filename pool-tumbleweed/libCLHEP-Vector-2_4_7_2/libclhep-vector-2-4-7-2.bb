SUMMARY = "Shared library for CLHEP Vector"
DESCRIPTION = "This package provides the CLHEP Vector shared library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "libCLHEP-Vector-2_4_7_2-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "b1f1f9da2874b6fa31d46255adfd1f252b602021d02d358708fc3000b1a820ceca99d0ff799740b1967c1839521afc30123920ce39b71ed4e651f67bfe0faa05"

RPROVIDES:${PN} += "libCLHEP-Vector-2-4-7-2 \
libCLHEP-Vector-2.4.7.2.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
