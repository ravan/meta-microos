SUMMARY = "Document Viewer"
DESCRIPTION = "Document viewing program; supports document in PDF, PS and \
many other formats."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "okular-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "9a0308879a1330bb2a00dc5d4dbec0d8a998d5725e35b8bef0245b40cd82f0ed0d77424b823fadeade81fd6f5c60d133a173eea224e279bbe9a8c58a4216d6f0"

RPROVIDES:${PN} += "libOkular6Core.so.4 \
okular \
okular5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKExiv2Qt6.so.0 \
libKF6Archive.so.6 \
libKF6Bookmarks.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Parts.so.6 \
libKF6Purpose.so.6 \
libKF6PurposeWidgets.so.6 \
libKF6TextWidgets.so.6 \
libKF6ThreadWeaver.so.6 \
libKF6Wallet.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQMobipocket6.so.3 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Svg.so.6 \
libQt6TextToSpeech.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libdjvulibre.so.21 \
libepub.so.0 \
libfreetype.so.6 \
libm.so.6 \
libmarkdown.so.3 \
libphonon4qt6.so.4 \
libpoppler-qt6.so.3 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm
