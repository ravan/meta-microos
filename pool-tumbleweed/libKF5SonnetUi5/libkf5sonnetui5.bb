SUMMARY = "KDE spell checking library"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5SonnetUi5-5.116.0-3.2.aarch64.rpm"
RPM_HASH = "b2498967ebae7db6304e4fa2ea832fe4e74b1c2bde5d4770c89a69633f2040f4f49919215a2fd9394d7eabfed7f194fb5bc9e614030bc0f71bc38d29ae669451"

RPROVIDES:${PN} += "libKF5SonnetUi.so.5 \
libKF5SonnetUi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5SonnetCore.so.5 \
libKF5SonnetCore5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
