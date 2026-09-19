SUMMARY = "KDE PIM Libraries: Text editing functionality"
DESCRIPTION = "This package provides text editing functionality for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6TextEdit6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "34bb162404e7916d44ce5847a86b15f7aa6b5a2b618b60b267ae114f9ae0f1708b9df75c3660f3ef787ee17610b9c02b3daeca7cc831cf14d560dcb8d12f52ba"

RPROVIDES:${PN} += "libKPim6TextEdit.so.6 \
libKPim6TextEdit6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kpimtextedit \
ld-linux-aarch64.so.1 \
libKF6Codecs.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOWidgets.so.6 \
libKF6SonnetUi.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6TextCustomEditor.so.1 \
libKF6TextEmoticonsWidgets.so.1 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
