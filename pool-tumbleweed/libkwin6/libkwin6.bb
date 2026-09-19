SUMMARY = "KWin library"
DESCRIPTION = "KWin is Plasma window manager. \
This package provides the kwin library."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "libkwin6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "3beb719c540a73f6e25eb01127ba4715c732a07478dd766c571cd14aeaca473dd137b389916bd88c9b646457c139fce60ca07131e33ac70279926d2792cca190"

RPROVIDES:${PN} += "libkwin.so.6 \
libkwin6"

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
libKWaylandClient.so.6 \
libPlasmaActivities.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libdisplay-info.so.3 \
libdrm.so.2 \
libepoxy.so.0 \
libgbm.so.1 \
libgcc-s.so.1 \
libinput.so.10 \
libkdecorations3.so.6 \
libkdecorations3private.so.2 \
liblcms2.so.2 \
libm.so.6 \
libstdc++.so.6 \
libudev.so.1 \
libvulkan.so.1 \
libwayland-client.so.0 \
libwayland-server.so.0 \
libxcb-composite.so.0 \
libxcb-dri3.so.0 \
libxcb-icccm.so.4 \
libxcb-keysyms.so.1 \
libxcb-present.so.0 \
libxcb-randr.so.0 \
libxcb-render.so.0 \
libxcb-res.so.0 \
libxcb-shape.so.0 \
libxcb-shm.so.0 \
libxcb-sync.so.1 \
libxcb-xfixes.so.0 \
libxcb-xinput.so.0 \
libxcb.so.1 \
libxcvt.so.0 \
libxkbcommon.so.0"

inherit rpm
