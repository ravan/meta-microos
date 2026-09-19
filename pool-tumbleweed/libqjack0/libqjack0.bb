SUMMARY = "Connect to the Jack Sound Server with Qt"
DESCRIPTION = "QJack makes you connect with the Jack soundserver system with Qt."
LICENSE = "GPL-2.0-or-later"

PV = "0.0+20170112"

RPM_NAME = "libqjack0-0.0+20170112-5.6.aarch64.rpm"
RPM_HASH = "fdb893674f3f88e8381e362990cc4c0141ad77005a144002de4cefa36379f1f28b96ee01a0eafbf79a9fd4e90e67a643bff03295d7a0dedd4beb42d9358bf3d2"

RPROVIDES:${PN} += "libqjack.so.0 \
libqjack0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libstdc++.so.6"

inherit rpm
