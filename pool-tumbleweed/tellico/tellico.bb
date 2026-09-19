SUMMARY = "A Collection Manager"
DESCRIPTION = "Tellico is an application for organizing your collections. It provides \
default templates for books, bibliographies, videos, music, video games, coins, \
stamps, trading cards, comic books, and wines."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.2"

RPM_NAME = "tellico-4.2.2-1.1.aarch64.rpm"
RPM_HASH = "2975379a32779e0a079a4512b8ade68dee073f2e1e28d618ebf0c17c9efb0ec62280d9afce2e0f2419502fc24304ec0b4a4f2cf024d06e903b1bad9c537202e2"

RPROVIDES:${PN} += "config-tellico \
tellico"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libKCddb6.so.5 \
libKF6Archive.so.6 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6FileMetaData.so.3 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6IconWidgets.so.6 \
libKF6ItemModels.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NewStuffCore.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6Service.so.6 \
libKF6Solid.so.6 \
libKF6SonnetCore.so.6 \
libKF6SonnetUi.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKSaneWidgets6.so.6 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libcdio.so.19 \
libcsv.so.3 \
libexempi.so.8 \
libexslt.so.0 \
libm.so.6 \
libpoppler-qt6.so.3 \
libstdc++.so.6 \
libtag.so.2 \
libv4l1.so.0 \
libxml2.so.16 \
libxslt.so.1 \
libyaz.so.5"

inherit rpm
