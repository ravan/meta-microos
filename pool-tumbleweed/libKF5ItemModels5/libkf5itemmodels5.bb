SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5ItemModels5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "85d0ba724d8fb7f48057b1be4285d078281970aabc1b67aa11dd57d5c2a4dc8a030c9503dfae9482482be51a0db6a8360b589a7bf83f778f8b9e439b7ee039f0"

RPROVIDES:${PN} += "libKF5ItemModels.so.5 \
libKF5ItemModels5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
