SUMMARY = "Non-ABI stable API for the Qt 6 OpcUa library"
DESCRIPTION = "This package provides private headers of libQt6Opcua that do not have any \
ABI or API guarantees."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-only) & GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-opcua-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "8d3172537bd0b1e672bb6ccef040b7eea6ba1f9c29edd6761d77d87e7ea063b0d2fa19447d31b75ddd7a81efcd9b4d00ae803845ac852f7065aa878f8d6e96db"

RPROVIDES:${PN} += "cmake-Qt6OpcUaPrivate \
qt6-opcua-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6NetworkPrivate \
cmake-Qt6OpcUa"

inherit rpm
