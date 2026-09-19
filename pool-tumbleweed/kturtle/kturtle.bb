SUMMARY = "Logo Programming Environment"
DESCRIPTION = "KTurtle is an educational Logo programming environment."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kturtle-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "27854ec9f45ed62a3179ea91108a6d42aa685aabf3456c11f9db61cbc6041cd221ebca65b3248140d76924d6d120f88a1cbf4dde6394a95094cc428493e31bad"

RPROVIDES:${PN} += "kturtle \
kturtle5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
