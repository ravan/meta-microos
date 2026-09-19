SUMMARY = "Qt 6 QmlMeta library"
DESCRIPTION = "The Qt 6 QmlMeta library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QmlMeta6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "1998818d6e2978d4d8e8a9ae90c62f6af1d3de5a4f5799986ab869a77fc2330481ed1b6f7048ef5d458fa1211ee2221c897b568101bc91bdc23ade7a80efc7c7"

RPROVIDES:${PN} += "libQt6QmlMeta.so.6 \
libQt6QmlMeta6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6QmlModels.so.6 \
libQt6QmlWorkerScript.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
