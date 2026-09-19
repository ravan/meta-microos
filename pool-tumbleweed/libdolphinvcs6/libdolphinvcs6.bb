SUMMARY = "KDE File Manager"
DESCRIPTION = "This package contains the libraries used by Dolphin and Konqueror."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libdolphinvcs6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "e4da917055abe743ca8581a851ae6442111030957c16782145ce0abfcfd930394be8747a15b00641c774e6996562e44def60a103f69ead33ff5fd7a96e11157a"

RPROVIDES:${PN} += "libdolphinvcs.so.6 \
libdolphinvcs6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
