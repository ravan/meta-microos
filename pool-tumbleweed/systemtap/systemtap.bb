SUMMARY = "Instrumentation System"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
Developers can write instrumentation to collect data on the operation \
of the system."
LICENSE = "GPL-2.0-or-later"

PV = "5.5"

RPM_NAME = "systemtap-5.5-1.3.aarch64.rpm"
RPM_HASH = "0b61af89f4a2bfa3540f3b60115717f1c436bc92ce08780b15d45fbee9601cd05c8e65ebd4762551300b1424deb1da506b1d4dbcc52c38f2278a119fe7512366"

RPROVIDES:${PN} += "systemtap"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libdebuginfod.so.1 \
libdw.so.1 \
libelf.so.1 \
libgcc-s.so.1 \
libjson-c.so.5 \
libnspr4.so \
libnss3.so \
libsqlite3.so.0 \
libssl3.so \
libstdc++.so.6 \
systemtap-dtrace \
systemtap-runtime"

inherit rpm
