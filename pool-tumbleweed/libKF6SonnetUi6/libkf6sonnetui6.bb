SUMMARY = "KDE spell checking library"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6SonnetUi6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "0382a9c4fe35f8eba7b1dbf8e934fbc1889cc0b4d44acf245773394a1807a305e2d0943ed433f74267ba51870f697dd1974aceaf4a0374dde2eeaeae4908546c"

RPROVIDES:${PN} += "libKF6SonnetUi.so.6 \
libKF6SonnetUi6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6SonnetCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
