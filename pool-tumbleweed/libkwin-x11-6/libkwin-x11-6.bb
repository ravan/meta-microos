SUMMARY = "KWin library"
DESCRIPTION = "KWin is Plasma window manager. \
This package provides the kwin library."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "libkwin-x11-6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "69932e41e57c173c8fd161e75f1baae456eb196e91630ada1311538bb8bc393ac82c91b115315c0775ebe3a12caddfe55cca498c400fba688b5996e22959880f"

RPROVIDES:${PN} += "libkwin-x11-6 \
libkwin-x11.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigQml.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6GlobalAccel.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6Notifications.so.6 \
libKF6Package.so.6 \
libKF6Service.so.6 \
libKF6WindowSystem.so.6 \
libKGlobalAccelD.so.0 \
libKScreenLocker.so.6 \
libPlasmaActivities.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Sensors.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libdisplay-info.so.3 \
libdrm.so.2 \
libepoxy.so.0 \
libgbm.so.1 \
libkdecorations3.so.6 \
libkdecorations3private.so.2 \
liblcms2.so.2 \
libm.so.6 \
libstdc++.so.6 \
libudev.so.1 \
libwayland-server.so.0 \
libxcb-composite.so.0 \
libxcb-cursor.so.0 \
libxcb-damage.so.0 \
libxcb-glx.so.0 \
libxcb-icccm.so.4 \
libxcb-keysyms.so.1 \
libxcb-randr.so.0 \
libxcb-render.so.0 \
libxcb-shape.so.0 \
libxcb-shm.so.0 \
libxcb-sync.so.1 \
libxcb-xfixes.so.0 \
libxcb-xinerama.so.0 \
libxcb.so.1 \
libxkbcommon.so.0"

inherit rpm
