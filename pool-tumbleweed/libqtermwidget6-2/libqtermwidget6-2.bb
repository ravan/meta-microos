SUMMARY = "The terminal widget for QTerminal"
DESCRIPTION = "QTermWidget is an open-source project originally based on the KDE4 Konsole \
application, but it took its own direction later on. The main goal of this \
project is to provide a Unicode-enabled, embeddable Qt widget for using as \
a built-in console (or terminal emulation widget)."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "2.4.0"

RPM_NAME = "libqtermwidget6-2-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "aead22e931331d7095815771dfd93a2432722bfb5e5c1eda6e3e0e2f85ec99b2238f538f1c416053871156303e0aa5b90283ed11ebadc06b1470fb8ac651fa92"

RPROVIDES:${PN} += "libqtermwidget6-2 \
libqtermwidget6.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
libutf8proc.so.3 \
qtermwidget-data"

inherit rpm
