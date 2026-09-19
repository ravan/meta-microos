SUMMARY = "KDE spell checking library: QML files"
DESCRIPTION = " \
Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL. \
This package contains files that allow use of sonnet with \
QtQuick based applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "sonnet-imports-5.116.0-3.2.aarch64.rpm"
RPM_HASH = "ee3f5a9436282fc9a802d6a9e9cf76727700213bdef6bc278dce11c0ab973427213de5cc55c9edad9817b1e3ba689b2622e3879e5d5275092ac9151a2f2c75f0"

RPROVIDES:${PN} += "libsonnetquickplugin.so \
qt5qmlimport-org.kde.sonnet.1 \
sonnet-imports"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5SonnetCore.so.5 \
libKF5SonnetCore5 \
libKF5SonnetUi5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
