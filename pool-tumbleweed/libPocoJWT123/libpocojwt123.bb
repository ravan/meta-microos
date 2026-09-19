SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoJWT123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "3a4c6e68b2882355c66bd909e295d5368d92e78b6d5690c2e8bebb8e56b9fa8b3dd0b88b083ace3a045b41a6f9ece9e43622a03fa5b9ec39e2bc684dd0c09dcb"

RPROVIDES:${PN} += "libPocoJWT.so.123 \
libPocoJWT123 \
poco-jwt"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoCrypto.so.123 \
libPocoFoundation.so.123 \
libPocoJSON.so.123 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
