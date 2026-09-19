SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoDataODBC123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "8248b80802e932f4ad642cb815734c4a5e864cd8dfb0e4544ebf2af206549aab2a9265cd996febb603ee5ea81e8b13d3957de91e8f3b1facff0eaa264859f4a9"

RPROVIDES:${PN} += "libPocoDataODBC.so.123 \
libPocoDataODBC123 \
poco-dataodbc"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoData.so.123 \
libPocoFoundation.so.123 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libodbc.so.2 \
libstdc++.so.6"

inherit rpm
