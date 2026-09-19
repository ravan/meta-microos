SUMMARY = "HTML Image Map Editor"
DESCRIPTION = "A tool to edit image maps of HTML files"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kimagemapeditor-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "0cd36184fede4e7772b969b7d52bed8e05c601e3d6979860515bb5c8710b0a16773782c7918330ac965d5863d9b675b7cded2863890128a4dabe713f845a89ab"

RPROVIDES:${PN} += "kimagemapeditor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6Parts.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
