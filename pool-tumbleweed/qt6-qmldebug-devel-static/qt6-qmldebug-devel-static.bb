SUMMARY = "Qt6 QmlDebug static library"
DESCRIPTION = "The Qt6 QmlDebug static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-qmldebug-devel-static-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "867f501bff1e262d17c5562a1082d7873edede7778a77df4d6cba643de6c0bde197d06577de956e0410309242b45ec3382a7c25eef18fe45d008a25fa8b52505"

RPROVIDES:${PN} += "cmake-Qt6QmlDebugPrivate \
qt6-qmldebug-devel-static \
qt6-qmldebug-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6Network \
cmake-Qt6QmlPrivate \
qt6-packetprotocol-devel-static"

inherit rpm
