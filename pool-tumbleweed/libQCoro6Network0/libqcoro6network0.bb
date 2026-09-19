SUMMARY = "Network support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for network operations support."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "libQCoro6Network0-0.13.0-1.6.aarch64.rpm"
RPM_HASH = "5d8fd8c2139b540d27db1e1191fae59dbedb585a55c87398ffdb1ad284a81e5d82b55a5d9c7b522b1a4c6ce87fc4deba02fc5381aa33cbc90c4df8d5bc954100"

RPROVIDES:${PN} += "libQCoro6Network.so.0 \
libQCoro6Network0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQCoro6Core.so.0 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
