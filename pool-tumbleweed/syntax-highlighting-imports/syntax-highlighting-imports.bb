SUMMARY = "QML components for syntax-highlighting"
DESCRIPTION = "This package contains QML imports for syntax-highlighting."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.116.0"

RPM_NAME = "syntax-highlighting-imports-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "1230c36b6d90d499b61a6d52be415fd4c2ba20ebbf621c7c109982f05a7ea5e9b017d417a22ed2538960c040b4e391c89841a8aa6b9e0f6c1a717e91b88d9706"

RPROVIDES:${PN} += "libkquicksyntaxhighlightingplugin.so \
qt5qmlimport-org.kde.syntaxhighlighting.1 \
syntax-highlighting-imports"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5SyntaxHighlighting.so.5 \
libKF5SyntaxHighlighting5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
