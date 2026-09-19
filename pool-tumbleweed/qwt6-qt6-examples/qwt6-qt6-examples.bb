SUMMARY = "Example programs using Qwt(Qt6)"
DESCRIPTION = "This package contains example programs demonstrating the Qwt(Qt6) widgets."
LICENSE = "SUSE-QWT-1.0 | BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "qwt6-qt6-examples-6.3.0-1.10.aarch64.rpm"
RPM_HASH = "2834455b5d10d82e9c0a4ff3e3bcfa2a0074001eb669eb2c3a35212d588f4f12f9544c8e6442468bb63b4fed598d6d81f58ce6671a2f92e207f4a3d133fdb0da"

RPROVIDES:${PN} += "qwt6-qt6-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libqwt-qt6.so.6.3 \
libstdc++.so.6 \
qwt6-qt6-devel"

inherit rpm
