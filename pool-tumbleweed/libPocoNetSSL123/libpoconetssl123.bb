SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoNetSSL123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "29c7681bfa4a52d3fb0368b25223c3eadcc5269dd4a5f12fd9ff17087d950996cb374149b005b2ae7b5a9906f9e12a34365071a18c9b29a25a2a38b53cdd924c"

RPROVIDES:${PN} += "libPocoNetSSL.so.123 \
libPocoNetSSL123 \
poco-netssl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoCrypto.so.123 \
libPocoFoundation.so.123 \
libPocoNet.so.123 \
libPocoUtil.so.123 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
