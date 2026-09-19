SUMMARY = "KDE spell checking library: Build Environment"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-sonnet-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "1f913ca37f207c2eabb74592498a5e50ba0ab45d265b44d30adac73634a891a316f2a81aedd5436d349c296b3c3c94ee5fba7d0ab4395afbf6663702ccdf44cf"

RPROVIDES:${PN} += "cmake-KF6Sonnet \
kf6-sonnet-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6Widgets \
ld-linux-aarch64.so.1 \
libKF6SonnetCore6 \
libKF6SonnetUi.so.6 \
libKF6SonnetUi6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
