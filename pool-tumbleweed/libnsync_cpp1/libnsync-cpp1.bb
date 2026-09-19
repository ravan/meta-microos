SUMMARY = "Library that exports various synchronization primitives"
DESCRIPTION = "Library for C++ that exports various synchronization primitives"
LICENSE = "Apache-2.0"

PV = "1.29.2"

RPM_NAME = "libnsync_cpp1-1.29.2-1.4.aarch64.rpm"
RPM_HASH = "c405fbb4174bff6d0c6799bf38a30173021b7a6f11934c094ecf19f14adf8a48dbea8f59783d105cff52777ef452e576a3aeafaf4b10c06acfd13c068d42a532"

RPROVIDES:${PN} += "libnsync-cpp.so.1 \
libnsync-cpp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libstdc++.so.6"

inherit rpm
