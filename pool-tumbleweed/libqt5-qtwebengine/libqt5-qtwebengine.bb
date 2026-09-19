SUMMARY = "Qt 5 WebEngine Library"
DESCRIPTION = "Qt WebEngine provides functionality for rendering regions of dynamic \
web content. \
 \
The functionality in Qt WebEngine is divided into the following \
modules: \
 \
* QtWebEngineCore: Provides public API shared by both QtWebEngine and \
  QtWebEngineWidgets \
* QtWebEngine: Provides QML types for rendering web content within a \
  QML application \
* QtWebEngineWidgets: Provides a web browser engine as well as C++ \
  classes to render and interact with web content"
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.19"

RPM_NAME = "libqt5-qtwebengine-5.15.19-3.3.aarch64.rpm"
RPM_HASH = "014f50b047d1df47d44a87ef5c772806bb59c5b52c9764ed5d5c97e3c935b56852a210850af9f95497b447a52592da3f13df80489d7b5719446d292077f3004d"

RPROVIDES:${PN} += "bundled-libsrtp2 \
libQt5WebEngine.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libqt5-qtwebengine \
libqtwebengineplugin.so \
qt5qmlimport-QtWebEngine.1 \
qt5qmlimport-QtWebEngine.Controls1Delegates.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Network5 \
libQt5Positioning.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5WebChannel.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libQtQuick5 \
libX11-xcb.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libXtst.so.6 \
libasound.so.2 \
libavcodec.so.61 \
libavformat.so.61 \
libavutil.so.59 \
libc.so.6 \
libdbus-1.so.3 \
libevent-2.1.so.7 \
libexpat.so.1 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libharfbuzz-subset.so.0 \
libharfbuzz.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libminizip.so.1 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libopus.so.0 \
libpng16.so.16 \
libpulse.so.0 \
libsnappy.so.1 \
libstdc++.so.6 \
libvpx.so.12 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libxcb.so.1 \
libxml2.so.16 \
libxslt.so.1 \
libz.so.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
