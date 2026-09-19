SUMMARY = "KDE spell checking library: QML files"
DESCRIPTION = " \
Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL. \
This package contains files that allow use of sonnet with \
QtQuick based applications."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-sonnet-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "811900f15c134f2616ed74f56714d7dff10936463ac653553451bb826d666ec12f017a631e8fdeee24a14e07fb6feb899cb4d91afbd273124e79d8bf6fdbb396"

RPROVIDES:${PN} += "kf6-sonnet-imports \
libsonnetquickplugin.so \
qt6qmlimport-org.kde.sonnet \
qt6qmlimport-org.kde.sonnet.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6SonnetCore.so.6 \
libKF6SonnetCore6 \
libKF6SonnetUi6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
