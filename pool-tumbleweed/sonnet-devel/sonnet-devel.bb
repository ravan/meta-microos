SUMMARY = "KDE spell checking library: Build Environment"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "sonnet-devel-5.116.0-3.2.aarch64.rpm"
RPM_HASH = "1097e39252d8c215a25e7f40ac7b7b292e8424e49aa5384afcefbc811cd76351412b8961fd7dfdac27ca3186a0d97bb98c52a765efdfd9ebeba9e6290cffa656"

RPROVIDES:${PN} += "cmake-KF5Sonnet \
sonnet-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
ld-linux-aarch64.so.1 \
libKF5SonnetCore5 \
libKF5SonnetUi.so.5 \
libKF5SonnetUi5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
