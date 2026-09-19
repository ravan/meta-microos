SUMMARY = "Shared library for CLHEP RandomObjects"
DESCRIPTION = "This package provides the CLHEP RandomObjects shared library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "libCLHEP-RandomObjects-2_4_7_2-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "43f19619b4da161dc571e3777a8164d3d68ecff1ad7fd3497eb93900066bd2cea2d19447e1485aad5b9bca537b8afff6bea0e2c2c9c28ebeee29665dfabe6b2e"

RPROVIDES:${PN} += "libCLHEP-RandomObjects-2-4-7-2 \
libCLHEP-RandomObjects-2.4.7.2.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libCLHEP-Matrix-2.4.7.2.so \
libCLHEP-Random-2.4.7.2.so \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
