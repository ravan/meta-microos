SUMMARY = "C++ regex library of RE-flex"
DESCRIPTION = "The RE-flex regex matching/lexing runtime library (shared object)."
LICENSE = "BSD-3-Clause"

PV = "6.4.0"

RPM_NAME = "libreflex6_4-6.4.0-1.1.aarch64.rpm"
RPM_HASH = "2508e05738f4e617c10480d4b2b29f76e0c5ab364d043afbe301b553f6215e6004f929e97f055f34b15be96384031af9a834110bdb01739c5ec3c9ebe3b72515"

RPROVIDES:${PN} += "libreflex.so.6.4 \
libreflex6-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
