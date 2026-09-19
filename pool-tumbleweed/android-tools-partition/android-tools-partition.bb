SUMMARY = "Android dynamic partition tools"
DESCRIPTION = "This package contains the Android dynamic partition tools."
LICENSE = "Apache-2.0 & MIT"

PV = "37.0.0"

RPM_NAME = "android-tools-partition-37.0.0-1.2.aarch64.rpm"
RPM_HASH = "fb66e51043e8858cc13161ea053e837e9ca3af1855d4e611ca998b5d4d4aa879980a7c1eda7ad949335c71d5f35876ada287476e08820ff92fd994fc1bb7f16d"

RPROVIDES:${PN} += "android-tools-partition"

RDEPENDS:${PN} += "android-tools \
ld-linux-aarch64.so.1 \
libabsl-status.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf.so.34.2.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
