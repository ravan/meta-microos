SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoPrometheus123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "618b864f62c0ede4c37d553d04c9a0186592971a1f59cca81e92f666a90a4ce08af2ae2a68b3a6b83a1a110a291bc31ce051dcddad63e6bb76a4452f410ab2c8"

RPROVIDES:${PN} += "libPocoPrometheus.so.123 \
libPocoPrometheus123 \
poco-prometheus"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.123 \
libPocoNet.so.123 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
