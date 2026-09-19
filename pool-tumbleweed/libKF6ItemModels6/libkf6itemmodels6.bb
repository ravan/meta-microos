SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6ItemModels6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "c0013849811869a57efe474e73dd760b971298317f9ee9994a2d74cb79ece3b0949d811f51b2ba7ce31391f9bda8f0fbe29a5c2c5add88261682e14ceb448dbd"

RPROVIDES:${PN} += "libKF6ItemModels.so.6 \
libKF6ItemModels6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
