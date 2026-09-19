SUMMARY = "Worksheet GUI for mathematical software"
DESCRIPTION = "A frontend to several existing mathematical software such as R, Sage \
and Maxima: Cantor. Cantor offers a worksheet as a nice GUI for all \
those backends and is not targeted to kids but to scientists."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "cantor-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "f48deab67ca191615a017988be917af1c84738d8e5203b061aed5fc46ae48c6196000654fcaccd920832b742d79635c2521b64a059c15040c1924db264151ead"

RPROVIDES:${PN} += "cantor \
cantor5 \
libcantor-config.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libAnalitza.so.9 \
libAnalitzaGui.so.9 \
libKF6Archive.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6IconWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NewStuffCore.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6Parts.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6TextEditor.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Help.so.6 \
libQt6PrintSupport.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libR.so \
libc.so.6 \
libcantorlibs.so.28 \
libgcc-s.so.1 \
libluajit-5.1.so.2 \
libpython3.13.so.1.0 \
libqalculate.so.23 \
libstdc++.so.6 \
libxml2.so.16 \
libxslt.so.1"

inherit rpm
