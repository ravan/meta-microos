SUMMARY = "LXQt desktop panel"
DESCRIPTION = "lxqt-panel represents the taskbar of LXQt."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.1"

RPM_NAME = "lxqt-panel-2.4.1-1.4.aarch64.rpm"
RPM_HASH = "38cb6bc9522270549c9e12e402136a83647a032d9a3898f01251c296dcdd141462f31ce7dc92ad2b1800fc3860c66a39147dcc858daf1b48fe23641ed93de6a1"

RPROVIDES:${PN} += "config-lxqt-panel \
libbacklight.so \
libcolorpicker.so \
libcpuload.so \
libcustomcommand.so \
libdirectorymenu.so \
libdom.so \
libkbindicator.so \
libmount.so \
libnetworkmonitor.so \
libqeyes.so \
libsensors.so \
libsysstat.so \
libvolume.so \
libwmbackend-kwin-wayland.so \
libwmbackend-wayfire.so \
libwmbackend-wlroots.so \
libwmbackend-xcb.so \
lxqt-panel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Solid.so.6 \
libKF6WindowSystem.so.6 \
libLayerShellQtInterface.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6WaylandClient.so.6 \
libQt6Widgets.so.6 \
libQt6Xdg.so.4 \
libQt6Xml.so.6 \
libX11.so.6 \
libXtst.so.6 \
libasound.so.2 \
libc.so.6 \
libdbusmenu-lxqt.so.0 \
liblxqt-globalkeys-ui.so.2 \
liblxqt-globalkeys.so.2 \
liblxqt.so.2 \
libm.so.6 \
libpulse.so.0 \
libsensors.so.4 \
libstatgrab.so.10 \
libstdc++.so.6 \
libsysstat-qt6.so.1 \
libwayland-client.so.0 \
libxcb-composite.so.0 \
libxcb-damage.so.0 \
libxcb-image.so.0 \
libxcb-shape.so.0 \
libxcb-util.so.1 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
lxqt-menu-data \
lxqt-panel-branding \
menu-cache"

inherit rpm
