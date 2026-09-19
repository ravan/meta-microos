SUMMARY = "QR Code generator library"
DESCRIPTION = "C++ QR Code generator library"
LICENSE = "MIT"

PV = "1.8.0+git17.856ba8a"

RPM_NAME = "libqrcodegencpp1-1.8.0+git17.856ba8a-3.6.aarch64.rpm"
RPM_HASH = "92a6a245b9b9b7569db33f8cc0ded56ee402e29a594f9680af911282c12a9678098669fbe769c7ec55cf3a86e9fed513cb59d494c3a3aa249787d3de1c298f16"

RPROVIDES:${PN} += "libqrcodegencpp.so.1 \
libqrcodegencpp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
