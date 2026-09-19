SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoMongoDB123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "2e9b4c553ff92c214a0201af9998d2cfe4116d2bc6e5a4c8d752b6c0784ae816dbd7f5ee17897e33d7d92b911b123b85f2f137d92a745b4310d109d04f2d1a89"

RPROVIDES:${PN} += "libPocoMongoDB.so.123 \
libPocoMongoDB123 \
poco-mongodb"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.123 \
libPocoNet.so.123 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
