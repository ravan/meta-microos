SUMMARY = "Core library of qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides the core library."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "libQCoro6Core0-0.13.0-1.6.aarch64.rpm"
RPM_HASH = "351f5f2ed407e7c18469b88c2ce8114eadea8a4cd65cb8a2a4c90f53ae8ac050bb0f0d7939f5f6676d84faa4acd3c5c8e804fe7da0adc7fa7be5738fd49d1c85"

RPROVIDES:${PN} += "libQCoro6Core.so.0 \
libQCoro6Core0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
