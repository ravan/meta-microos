SUMMARY = "DBus support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for D-Bus support."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "libQCoro5DBus0-0.13.0-1.2.aarch64.rpm"
RPM_HASH = "34ec0401917ea9b351ae160fbebf57e912ca256079c4f5698059ec9182ba06fd87cb2cdb78391fc08dc581d01a0ccfd847ac453ee98a5f3ac7719464ca6eff0a"

RPROVIDES:${PN} += "libQCoro5DBus.so.0 \
libQCoro5DBus0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
