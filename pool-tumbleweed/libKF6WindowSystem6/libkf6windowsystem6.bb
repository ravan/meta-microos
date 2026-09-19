SUMMARY = "KDE Access to window manager"
DESCRIPTION = "Convenience access to certain properties and features of the window manager. \
 \
KWindowSystem provides information about the state of the window manager and \
allows asking the window manager to change the using a more high-level \
interface than the NETWinInfo/NETRootInfo low-level classes."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6WindowSystem6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "a5ae8d24020952c979193e793b15deeefa4bba552983c4893fd7507a26c96e4f7eeb1403383249097a8281c77aff58b0b39fae32ce26a3601613b4f7585251d4"

RPROVIDES:${PN} += "libKF6WindowSystem.so.6 \
libKF6WindowSystem6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kwindowsystem \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libX11.so.6 \
libXfixes.so.3 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libxcb-keysyms.so.1 \
libxcb-res.so.0 \
libxcb.so.1"

inherit rpm
