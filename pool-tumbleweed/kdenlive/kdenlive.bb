SUMMARY = "Non-linear video editor"
DESCRIPTION = "Kdenlive is a non-linear video editor for GNU/Linux and FreeBSD, which supports \
DV, AVCHD (experimental support) and HDV editing. Kdenlive relies on several \
other open source projects, such as FFmpeg and the MLT video framework. It was \
designed to answer all needs, from basic video editing to semi-professional \
work."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdenlive-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "cc976ce96cab430a9e38c1778816b68ae92f082eec3d9d5b423d19710d5926da5cfdebab1a17cd9467b67e757f6511786ff230a11996e42b1f03e82efa56d856"

RPROVIDES:${PN} += "kdenlive \
kdenlive5 \
qt6qmlimport-org.kde.kdenlive \
qt6qmlimport-org.kde.kdenlive.254"

RDEPENDS:${PN} += "kf6-knewstuff-imports \
kf6-qqc2-desktop-style \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Bookmarks.so.6 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6FileMetaData.so.3 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6IconThemes.so.6 \
libKF6ItemViews.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NewStuffCore.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6NotifyConfig.so.6 \
libKF6Purpose.so.6 \
libKF6PurposeWidgets.so.6 \
libKF6Solid.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6MultimediaWidgets.so.6 \
libQt6Network.so.6 \
libQt6NetworkAuth.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libkddockwidgets-qt6.so.3 \
libm.so.6 \
libmlt++-7.so.7 \
libmlt-7.so.7 \
libmlt7-module-qt6 \
libopentime.so.18 \
libopentimelineio.so.18 \
libstdc++.so.6 \
libswresample.so.6 \
melt \
qt6-declarative-imports \
qt6qmlimport-QtMultimedia \
qt6qmlimport-QtQml.2 \
qt6qmlimport-QtQml.Models.2 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Controls.2 \
qt6qmlimport-QtQuick.Effects \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Layouts.1 \
qt6qmlimport-QtQuick.Shapes \
qt6qmlimport-QtQuick.Shapes.1 \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-QtQuick.Window.2 \
qt6qmlimport-org.kde.ki18n"

inherit rpm
