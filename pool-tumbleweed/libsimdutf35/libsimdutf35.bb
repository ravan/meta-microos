SUMMARY = "Shared libraries for simdutf"
DESCRIPTION = "The package contains shared libraries."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "9.1.2"

RPM_NAME = "libsimdutf35-9.1.2-1.1.aarch64.rpm"
RPM_HASH = "3aaacb6cb0f3d0781dc7cbb5145707e23764e868990fc8d81a4af54fc86bd7278cbc2e4a76599675267cfde5adfbe8aa903dab6898b5991df725b57109cfdb2a"

RPROVIDES:${PN} += "libsimdutf.so.35 \
libsimdutf35"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
