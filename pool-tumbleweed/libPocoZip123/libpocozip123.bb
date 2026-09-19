SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoZip123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "2ee3266a2674e0d7e2ab884d538206c5fd9dc4c0e6b2aa6571c06b9442d6a39646fe5431d11624b7c37d2275bd477686ac0c1f404e9449d9f8f0279cda0ecc72"

RPROVIDES:${PN} += "libPocoZip.so.123 \
libPocoZip123 \
poco-zip"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.123 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
