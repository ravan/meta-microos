SUMMARY = "Userspace daemon part (ublksrv) of the ublk framework"
DESCRIPTION = "This is the userspace daemon part(ublksrv) of the ublk framework."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "ublksrv-1.6-2.3.aarch64.rpm"
RPM_HASH = "b4bef7bf0f3f23d79938c702c336c93f2d94489c90492c4e18320b6f7524ec343f5a35228f78ac70348e329fe8041acc4f04542b15dc0b09eb8abe8749cb2ee5"

RPROVIDES:${PN} += "ublksrv"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libublksrv.so.0 \
liburing.so.2"

inherit rpm
