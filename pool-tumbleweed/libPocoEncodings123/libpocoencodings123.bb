SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoEncodings123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "9a58df1c0bc89a7de266b93d5c0cd23e8ade17fbfca5f62ace50cf4a0877b62a5fd1a8c9d81c689e18072bc2ac3bf4386575222c98eeb950524d100eee08ada3"

RPROVIDES:${PN} += "libPocoEncodings.so.123 \
libPocoEncodings123 \
poco-encodings"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.123 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
