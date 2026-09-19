SUMMARY = "Boost.Container runtime library"
DESCRIPTION = "This package contains the Boost.Container runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_container1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "a5152f338fdec8d01820a7be329d70fa75179ddd36ebc6a6a1bb7bec6f1452f83f547e9c797c3c9578a285520f71663a0fa78cfd6bc299275bbda89fbf8dfb43"

RPROVIDES:${PN} += "libboost-container.so.1.91.0 \
libboost-container1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
