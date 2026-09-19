SUMMARY = "Boost.TypeErasure runtime library"
DESCRIPTION = "This package contains Boost::TypeErasure runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_type_erasure1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "0b65eb0ba4a73f2cd0e0fff87af6b7b5ebaade74004d818d90539eaf035f72f838cc9e13a251ca9f1ec195a348735ae57561422e2a1a2dc52d70526629fa4d62"

RPROVIDES:${PN} += "libboost-type-erasure.so.1.91.0 \
libboost-type-erasure1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
