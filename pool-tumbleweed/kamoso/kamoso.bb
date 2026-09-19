SUMMARY = "Application to take pictures and videos using a webcam"
DESCRIPTION = "Kamoso is an application to take pictures and videos using a webcam. \
The media can be pushed to some web services such as Facebook and \
YouTube."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kamoso-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "07380988465cc83b2cfbe78f60d4fb07a0ecd9482eb1f26c9fba3256357dd50a2a95cc082cec37b34a24f1c0f449358616ce7148847b4eea816ecfbd5979de78"

RPROVIDES:${PN} += "kamoso"

RDEPENDS:${PN} += "gstreamer-plugins-bad \
gstreamer-plugins-base \
gstreamer-plugins-good \
gstreamer-plugins-good-qtqml6 \
kf6-kirigami-imports \
kf6-purpose \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6ItemViews.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Notifications.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
