SUMMARY = "Media Player"
DESCRIPTION = "Amarok is a media player for all kinds of media. This includes MP3, Ogg \
Vorbis, audio CDs, podcasts and streams. Play lists can be stored in \
.m3u or .pls files."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.3"

RPM_NAME = "amarok-3.3.3-1.3.aarch64.rpm"
RPM_HASH = "04cc61365cd803a77c96d7fa6f1c71dfe785dfef8e73f99aaf1fc1017ad89d03f11182657b14d115e1dfe80136bc6a255ab1cf02b819e0e3e2c58ac4c48c0094"

RPROVIDES:${PN} += "amarok \
libamarok-context-applet-albums.so \
libamarok-context-applet-analyzer.so \
libamarok-context-applet-currenttrack.so \
libamarok-context-applet-lyrics.so \
libamarok-context-applet-photos.so \
libamarok-context-applet-similarartists.so \
libamarok-context-applet-wikipedia.so \
libamarok-service-lastfm-config.so \
libamarok-sqlcollection.so.1 \
libamarok-transcoding.so.1 \
libamarokcore.so.1 \
libamaroklib.so.1 \
libamarokpud.so \
libamarokshared.so.1 \
libampache-account-login.so \
libgpodder-service-config.so \
libqml-plugin.so \
qt6qmlimport-org.kde.amarok.albums \
qt6qmlimport-org.kde.amarok.albums.1 \
qt6qmlimport-org.kde.amarok.analyzer \
qt6qmlimport-org.kde.amarok.analyzer.1 \
qt6qmlimport-org.kde.amarok.currenttrack \
qt6qmlimport-org.kde.amarok.currenttrack.1 \
qt6qmlimport-org.kde.amarok.lyrics \
qt6qmlimport-org.kde.amarok.lyrics.1 \
qt6qmlimport-org.kde.amarok.photos \
qt6qmlimport-org.kde.amarok.photos.1 \
qt6qmlimport-org.kde.amarok.qml \
qt6qmlimport-org.kde.amarok.qml.1 \
qt6qmlimport-org.kde.amarok.similarartists \
qt6qmlimport-org.kde.amarok.similarartists.1 \
qt6qmlimport-org.kde.amarok.wikipedia \
qt6qmlimport-org.kde.amarok.wikipedia.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
kf6-kirigami-imports \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6DNSSD.so.6 \
libKF6GlobalAccel.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6ItemViews.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6Package.so.6 \
libKF6Solid.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6TextEditor.so.6 \
libKF6TextWidgets.so.6 \
libKF6ThreadWeaver.so.6 \
libKF6Wallet.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Sql.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6UiTools.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libfftw3.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpod.so.4 \
libgstaudio-1.0.so.0 \
libgstreamer-1.0.so.0 \
liblastfm6.so.1 \
libm.so.6 \
libmariadb.so.3 \
libmariadbd.so.19 \
libmtp.so.9 \
libmygpo-qt6.so.1 \
libstdc++.so.6 \
libtag.so.2 \
qt6-declarative-imports \
qt6qmlimport-QtQml.Models.2 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Controls.2 \
qt6qmlimport-QtQuick.Layouts.1 \
qt6qmlimport-QtWebEngine.1 \
qt6qmlimport-org.kde.amarok.albums.1 \
qt6qmlimport-org.kde.amarok.analyzer.1 \
qt6qmlimport-org.kde.amarok.currenttrack.1 \
qt6qmlimport-org.kde.amarok.lyrics.1 \
qt6qmlimport-org.kde.amarok.photos.1 \
qt6qmlimport-org.kde.amarok.qml.1 \
qt6qmlimport-org.kde.amarok.similarartists.1 \
qt6qmlimport-org.kde.amarok.wikipedia.1 \
qt6qmlimport-org.kde.kirigami.2"

inherit rpm
