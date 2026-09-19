SUMMARY = "Framework for integration of KDE frameworks widgets with Qt Designer"
DESCRIPTION = "This framework provides plugins for Qt Designer that allow it to display \
the widgets provided by various KDE frameworks, as well as a utility \
(kgendesignerplugin) that can be used to generate other such plugins \
from ini-style description files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kdesignerplugin-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "103d61714b5514dce81933501ec1d3de96bb65a1fdbf3d5b3efb07013d0acc25c4403f656640b35b863c03ea3d84121f5512a2264f00a1f418826ec60fd50f9b"

RPROVIDES:${PN} += "kdesignerplugin"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
