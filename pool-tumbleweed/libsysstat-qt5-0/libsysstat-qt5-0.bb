SUMMARY = "Library used to query system info and statistics"
DESCRIPTION = "Development libraries for libsysstat."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.6"

RPM_NAME = "libsysstat-qt5-0-0.4.6-2.9.aarch64.rpm"
RPM_HASH = "041664c6fcc04dcd339638f0e0611fad87475d0bf56401df938b96378a829993d6669cff5a2d6deea7f82c83984dc29f0ead761a9bf40e7d9f0a21e8678368da"

RPROVIDES:${PN} += "libsysstat \
libsysstat-qt5-0 \
libsysstat-qt5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
