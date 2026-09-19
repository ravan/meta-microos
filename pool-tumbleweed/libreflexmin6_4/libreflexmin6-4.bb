SUMMARY = "Minimal C++ regex library of RE-flex"
DESCRIPTION = "The minimal RE-flex runtime library (shared object): the matcher engine \
without the pattern converter, POSIX support and Unicode tables, for linking \
generated scanners that do not need them."
LICENSE = "BSD-3-Clause"

PV = "6.4.0"

RPM_NAME = "libreflexmin6_4-6.4.0-1.1.aarch64.rpm"
RPM_HASH = "2e3352fb46d67448e303efb7d0a471135d794588397d3ad60ecd7fdd220b5d0952cacbaa418012cdc9ed06febc9d5abbdac21e34af01cf686d61936f3de07837"

RPROVIDES:${PN} += "libreflexmin.so.6.4 \
libreflexmin6-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
