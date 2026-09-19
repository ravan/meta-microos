SUMMARY = "Shared library for CLHEP Exceptions"
DESCRIPTION = "This package provides the CLHEP Exceptions shared library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "libCLHEP-Exceptions-2_4_7_2-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "49ac25ab1b3617b148b52ddf3e0ffddf9749d9b530febad9e362d322ec38b9a46c2702bcd53ba6744bd657d3870fa7685de3f58756e95a2da23ef1fc01355bce"

RPROVIDES:${PN} += "libCLHEP-Exceptions-2-4-7-2 \
libCLHEP-Exceptions-2.4.7.2.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libCLHEP-RefCount-2.4.7.2.so \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
