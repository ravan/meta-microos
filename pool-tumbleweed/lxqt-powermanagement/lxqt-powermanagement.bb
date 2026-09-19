SUMMARY = "Power Management and Auto-suspend"
DESCRIPTION = "LXQt daemon for power management and auto-suspend"
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-powermanagement-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "078056110e0beb2eac38903340cfa4bb308f90243647a4029471b2c1d67210cfc806646fb4dd05bcf5a6a5d5ab6e3cb5744e91180cf525660c6721d881a15638"

RPROVIDES:${PN} += "config-lxqt-powermanagement \
lxqt-powermanagement"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6IdleTime.so.6 \
libKF6Solid.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
liblxqt-globalkeys.so.2 \
liblxqt.so.2 \
libm.so.6 \
libstdc++.so.6 \
libxcb-dpms.so.0 \
libxcb-screensaver.so.0 \
upower"

inherit rpm
