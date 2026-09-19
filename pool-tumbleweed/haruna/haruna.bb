SUMMARY = "Video player built with Qt/QML on top of libmpv"
DESCRIPTION = "Haruna is a video player built with Qt/QML on top of libmpv."
LICENSE = "CC-BY-4.0 & GPL-3.0-or-later & WTFPL"

PV = "1.8.1"

RPM_NAME = "haruna-1.8.1-1.6.aarch64.rpm"
RPM_HASH = "39562e40350b81e48e5866051c3fd6d0e5beb87ff5931a1a6bd3182c794e875bf832c865e84064dfba9edc9e016fa94d9caa71ad4ca63f2adf93e9cc7f5c3557"

RPROVIDES:${PN} += "haruna"

RDEPENDS:${PN} += "kf6-breeze-icons \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6FileMetaData.so.3 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Service.so.6 \
libKF6WindowSystem.so.6 \
libMpvQt.so.3 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libavcodec.so.61 \
libavfilter.so.10 \
libavformat.so.61 \
libavutil.so.59 \
libc.so.6 \
libkdsingleapplication-qt6.so.1.2 \
libstdc++.so.6 \
libswscale.so.8 \
yt-dlp"

inherit rpm
