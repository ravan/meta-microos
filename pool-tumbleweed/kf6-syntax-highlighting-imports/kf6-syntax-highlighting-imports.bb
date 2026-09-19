SUMMARY = "QML components for syntax-highlighting"
DESCRIPTION = "This package contains QML imports for syntax-highlighting."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "6.30.0"

RPM_NAME = "kf6-syntax-highlighting-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "704f389b02895cbc2bf42f04642aedf956a2eadfa0caec3b4f8c50b719954f537dfc3b12f5ee2e2e8c92c59f83a8264b2ce3296db80f5431d23d2e5bafc72355"

RPROVIDES:${PN} += "kf6-syntax-highlighting-imports \
libkquicksyntaxhighlightingplugin.so \
qt6qmlimport-org.kde.syntaxhighlighting \
qt6qmlimport-org.kde.syntaxhighlighting.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6SyntaxHighlighting.so.6 \
libKF6SyntaxHighlighting6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
