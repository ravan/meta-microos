SUMMARY = "Non-ABI stable API for the Qt 6 D-Bus library"
DESCRIPTION = "This package provides private headers of libQt6DBus that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-dbus-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "f9966f7124b85deaa3897d6ce70f77628ac149f0f208a762801246396e11506c1722ec57e5b7266e5762c35ec754a2687b64d0abef157b500f421ca95081354b"

RPROVIDES:${PN} += "cmake-Qt6DBusPrivate \
qt6-dbus-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6DBus"

inherit rpm
