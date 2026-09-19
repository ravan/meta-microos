SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoRedis123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "335613a67f4650bb0317bca3c804eb631cf0770d08edf761a752d29f3a36b3ad07076809b2a37b7676c5e5b5f0f3f2e21af34a3198a104bf9b8ec5d39a266f1a"

RPROVIDES:${PN} += "libPocoRedis.so.123 \
libPocoRedis123 \
poco-redis"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.123 \
libPocoNet.so.123 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
