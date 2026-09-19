SUMMARY = "Qt Quick support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for Qt Quick operations support."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "libQCoro6Quick0-0.13.0-1.6.aarch64.rpm"
RPM_HASH = "bf1977629e78e6217c7df3dd116b3214caa1f379036e458c9508903d2e3eec3661bba9fa82c1e5ad74bc1e45353e69223f7eb64d51754aed8fea62e805a4b1d8"

RPROVIDES:${PN} += "libQCoro6Quick.so.0 \
libQCoro6Quick0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
