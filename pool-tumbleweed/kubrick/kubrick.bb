SUMMARY = "Game based on Rubik's Cube"
DESCRIPTION = "This package contains the KDE game Kubrick which is based on Rubik's \
Cube."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kubrick-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "176b3742361a8129502f62f9f30cc8130c1eb55801dc442c9e4e5bca0e9adba35ec4ec1a3bdd60cd9955f5e93086828c80687c82fb116b772cffec10f272d736"

RPROVIDES:${PN} += "kubrick \
kubrick5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libGLU.so.1 \
libKDEGames6.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libOpenGL.so.0 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
