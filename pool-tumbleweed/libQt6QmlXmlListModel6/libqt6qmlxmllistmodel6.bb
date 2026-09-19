SUMMARY = "Qt 6 QmlXmlListModel library"
DESCRIPTION = "The Qt 6 QmlXmlListModel library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QmlXmlListModel6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "74480f63fb1efd01ccbe88984a4cbae6b0bfbae8d41db4494a24115e181c9ee5599e5140b09369ecf00742c01507c7350fe12aaa671487faec9b65fabf9e401f"

RPROVIDES:${PN} += "libQt6QmlXmlListModel.so.6 \
libQt6QmlXmlListModel6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
