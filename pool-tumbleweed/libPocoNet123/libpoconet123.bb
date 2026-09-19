SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoNet123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "d3c113d2f8538fa2f6475ccad51595e2f508f5fc78b070f7d371dd7e422244dad3e83e717e0b2cc76c564651c02809d4f530f5cd1f3f0b8f8cf25298db00f55b"

RPROVIDES:${PN} += "libPocoNet.so.123 \
libPocoNet123 \
poco-net"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.123 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
