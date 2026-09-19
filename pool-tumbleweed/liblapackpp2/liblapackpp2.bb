SUMMARY = "Shared library for lapackpp"
DESCRIPTION = "This package provides the shared library for lapackpp."
LICENSE = "BSD-3-Clause"

PV = "2025.05.28"

RPM_NAME = "liblapackpp2-2025.05.28-1.5.aarch64.rpm"
RPM_HASH = "a0c59c73af64c18670dd1265610159e98dd0662df4bb56fbb70ca2cad9119531a54ef0a519f97b437b41a93ea272c546074c87c364dd78b2bf7ea994e2e6a856"

RPROVIDES:${PN} += "liblapackpp.so.2 \
liblapackpp2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblapack.so.3 \
libstdc++.so.6"

inherit rpm
