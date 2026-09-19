SUMMARY = "Shared library for CLHEP RefCount"
DESCRIPTION = "This package provides the CLHEP RefCount shared library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "libCLHEP-RefCount-2_4_7_2-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "148a150d461dd290cb2abfd4f92b23f16e3784b6609f04ab0957187b37abff2c78b7efe8a89a2e27f027d14713e0d84b08dfff9d4131c37bafc71b0dacd4934c"

RPROVIDES:${PN} += "libCLHEP-RefCount-2-4-7-2 \
libCLHEP-RefCount-2.4.7.2.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libstdc++.so.6"

inherit rpm
