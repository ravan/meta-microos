SUMMARY = "Qt 6 3DQuickRender library"
DESCRIPTION = "The Qt 6 3DQuickRender library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt63DQuickRender6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "99ef6ecc3c331cd9d27b43823f5dab04ef65715f3a4ec6eee844c4837fcf515dc5ce4c55cfa73470b8e0c134b55e6717cb5c0f82d7e5989b5f589c3b5d51f295"

RPROVIDES:${PN} += "libQt63DQuickRender.so.6 \
libQt63DQuickRender6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt63DQuick.so.6 \
libQt63DRender.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
