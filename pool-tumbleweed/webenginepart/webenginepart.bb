SUMMARY = "KDE WebEngine web browser component"
DESCRIPTION = "This package contains a HTML rendering engine for Konqueror using Qt web engine."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "webenginepart-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "5da102a21958ac8e441ef1fe2e133b845878677fd0fbbc760583b5f12b196df8bfe114b248c53b25f49c831ebe268d161763623cf8513d6b428f64c5727e5d2d"

RPROVIDES:${PN} += "libkwebenginepart.so \
webenginepart"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6JobWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Konq.so.7 \
libKF6KonqSettings.so.7 \
libKF6Parts.so.6 \
libKF6Service.so.6 \
libKF6SonnetCore.so.6 \
libKF6SonnetUi.so.6 \
libKF6Wallet.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
