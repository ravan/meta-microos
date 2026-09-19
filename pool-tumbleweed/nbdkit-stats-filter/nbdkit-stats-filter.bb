SUMMARY = "Statistics filter for nbdkit"
DESCRIPTION = "Display statistics about operations."
LICENSE = "BSD-3-Clause"

PV = "1.48.0"

RPM_NAME = "nbdkit-stats-filter-1.48.0-1.1.aarch64.rpm"
RPM_HASH = "b04657417139d65f72b759b04c1755a7ae752d3a37eae20d59b46cf008b35301c7f54bcb2d845c69840d1155d58bf47e5a417d9a27c06531987d8ee74eae00c6"

RPROVIDES:${PN} += "nbdkit-stats-filter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
nbdkit-server"

inherit rpm
