SUMMARY = "QML bindings for libaccounts-qt and libsignon-qt"
DESCRIPTION = "This QML module provides an API to manage the user's online accounts and get \
their authentication data. It's a tiny wrapper around the Qt-based APIs of \
libaccounts-qt and libsignon-qt."
LICENSE = "LGPL-2.1-only"

PV = "0.7git.20231028T182937~05e79eb"

RPM_NAME = "accounts-qml-module-0.7git.20231028T182937~05e79eb-1.8.aarch64.rpm"
RPM_HASH = "3c99bf003dc9c4fe88399e35163c1a7e0e68b874b8e384968aad134b2fd6e24b7f7b891b9243069af5254cebb5b267bf347dca88a78898791ca29e7f542143ad"

RPROVIDES:${PN} += "accounts-qml-module \
libAccounts.so \
qt6qmlimport-SSO.OnlineAccounts \
qt6qmlimport-SSO.OnlineAccounts.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libaccounts-qt6.so.1 \
libc.so.6 \
libsignon-qt6.so.1 \
libstdc++.so.6"

inherit rpm
