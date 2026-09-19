SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoCppParser123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "574c43aa6d26b79daf88ef090397b1be97e5713f9a4b283ab513cfc9c2547d6b6c57b3eb48e03f5bc5b2fc1048ded30ddcae02f5236500e1a3ba51d5e97862e7"

RPROVIDES:${PN} += "libPocoCppParser.so.123 \
libPocoCppParser123 \
poco-cppparser"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.123 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
