SUMMARY = "Qt 6 QmlNetwork library"
DESCRIPTION = "QML Binding for the QNetworkInformation C++ class. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6QmlNetwork6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "77a7a65ce5cb62266ccdef4725961d4d19efd7c229a40a66527ea8db7fad39c471544af97729da71b636e6923d4aea32d61414a590529fe2185bd6a9f03c8fd4"

RPROVIDES:${PN} += "libQt6QmlNetwork.so.6 \
libQt6QmlNetwork6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
