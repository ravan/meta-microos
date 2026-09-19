SUMMARY = "Desktop Planetarium"
DESCRIPTION = "KStars is astronomy software. It provides an accurate graphical \
simulation of the night sky, for any time and location on Earth."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "3.8.4.1"

RPM_NAME = "kstars-3.8.4.1-1.1.aarch64.rpm"
RPM_HASH = "a4b64adc70458d1bab6e9584b44b92fd991e630654860c8f22bfe503c3c35e8af504ddd84f714ff760f49b13ab2dcf0211cc246a120d6c65c25020769f237cbf"

RPROVIDES:${PN} += "kstars"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NewStuffCore.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6NotifyConfig.so.6 \
libKF6Plotting.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6DataVisualization.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Sql.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6WebSockets.so.6 \
libQt6Widgets.so.6 \
libXISF.so.0 \
libc.so.6 \
libcfitsio.so.10 \
libgcc-s.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
libindiclient.so.2 \
libm.so.6 \
libnova-0.15.so.0 \
libopencv-calib3d.so.413 \
libopencv-core.so.413 \
libopencv-imgproc.so.413 \
libqt6keychain.so.1 \
libraw.so.25 \
libstdc++.so.6 \
libstellarsolver6.so.2 \
libwcs.so.8 \
libz.so.1 \
qt6-declarative-imports \
qt6-positioning-imports \
qt6-sql-sqlite"

inherit rpm
