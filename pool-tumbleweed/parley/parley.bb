SUMMARY = "Vocabulary Trainer"
DESCRIPTION = "Parley is a vocabulary trainer by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "parley-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "e65536a8066c1f026e4a9d920e2958f43672232426b835f7c6999440138c1aaa5caea03b02321b0601037153ad9035f1ac06262ea14202ce3fc1a643fad57801"

RPROVIDES:${PN} += "parley \
parley5"

RDEPENDS:${PN} += "kdeedu-data \
ld-linux-aarch64.so.1 \
libKEduVocDocument.so.5 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NewStuffCore.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6SonnetCore.so.6 \
libKF6SonnetUi.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Svg.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
