SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "libLTO18-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "df5aaff2dd0b51325ddff39c55a8f91cf755dc6979147ad110c3e468fab3768d56ef05682620bea33cbf560d609134f2cfc88499e589e5ede3eccfb529ca7abb"

RPROVIDES:${PN} += "libLTO.so.18.1 \
libLTO18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.18.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
