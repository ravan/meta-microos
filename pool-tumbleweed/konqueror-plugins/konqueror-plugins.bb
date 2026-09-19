SUMMARY = "KDE File Manager and Browser"
DESCRIPTION = "These plugins extend the functionality of Konqueror."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "konqueror-plugins-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "d601c88f1c1513588879deea81936bcf791bed2426279b512b48a6ec6787f41493e5304ff45e36f838ef800ff395abb014e70f079bbcfa8d7470eca81e0abff1"

RPROVIDES:${PN} += "config-konqueror-plugins \
fsview5 \
konqueror-plugins \
konqueror5-plugins \
libKF6KonqSettings.so.7 \
libkonqsidebarplugin.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
konqueror \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Bookmarks.so.6 \
libKF6Codecs.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6IconWidgets.so.6 \
libKF6JobWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Konq.so.7 \
libKF6Parts.so.6 \
libKF6Service.so.6 \
libKF6Solid.so.6 \
libKF6Su.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libkonquerorprivate.so.5 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
