SUMMARY = "Qt 6 OpcUa library - Development files"
DESCRIPTION = "Development files for the Qt 6 OpcUa library."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-only) & GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-opcua-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "0ebaabfbced6df6806d09dca479c94f1dfdca2f3e1c58f76440b8e4686acc12b8ba7ef4e3fd22d095e278150502e7a61cef752c254c3b368e10a2394a2aa9b53"

RPROVIDES:${PN} += "cmake-Qt6OpcUa \
cmake-Qt6OpcUaTools \
cmake-Qt6QOpen62541Plugin \
pkgconfig-Qt6OpcUa \
qt6-opcua-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6OpcUa6 \
libc.so.6 \
libstdc++.so.6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network"

inherit rpm
