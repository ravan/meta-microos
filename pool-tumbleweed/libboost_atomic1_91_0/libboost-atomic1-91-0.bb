SUMMARY = "Boost.Atomic runtime library"
DESCRIPTION = "Run-Time support for Boost.Atomic, a library that provides atomic data types \
and operations on these data types, as well as memory ordering constraints \
required for coordinating multiple threads through atomic variables."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_atomic1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "71aa0291d7a0753c94d3ffa312aa404b061a4a813b34c3277173b5cf010cfd01e5d17a7fcd40c308a0a6dcfcf38ac6528e728e6d80761c4b6e8adfc4083ce777"

RPROVIDES:${PN} += "libboost-atomic.so.1.91.0 \
libboost-atomic1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
