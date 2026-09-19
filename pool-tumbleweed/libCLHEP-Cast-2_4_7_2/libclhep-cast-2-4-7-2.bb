SUMMARY = "Shared library for CLHEP Cast"
DESCRIPTION = "This package provides the CLHEP Cast shared library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "libCLHEP-Cast-2_4_7_2-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "432247b1eb0e50c9b2b3c5705f13c380f4e87d1f1d48ece517830f58bdd46b202a465732295d55945129d1fc4148ffa5ccb847de18f77042693d10c266053aae"

RPROVIDES:${PN} += "libCLHEP-Cast-2-4-7-2 \
libCLHEP-Cast-2.4.7.2.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
