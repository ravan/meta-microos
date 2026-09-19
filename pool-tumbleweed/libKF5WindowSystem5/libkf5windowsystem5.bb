SUMMARY = "KDE Access to window manager"
DESCRIPTION = "Convenience access to certain properties and features of the window manager. \
 \
KWindowSystem provides information about the state of the window manager and \
allows asking the window manager to change the using a more high-level \
interface than the NETWinInfo/NETRootInfo low-level classes."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5WindowSystem5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "2c9e21254c95c6a287c9944af1fed7882c76766d3a7763bb2a4c007e1bfadf08fc74bae13efa68c8ee58d0991692ea44fada0c16b4ffee47fab15f5676f40a4c"

RPROVIDES:${PN} += "libKF5WindowSystem.so.5 \
libKF5WindowSystem5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libQt5X11Extras.so.5 \
libQt5X11Extras5 \
libX11.so.6 \
libXfixes.so.3 \
libc.so.6 \
libstdc++.so.6 \
libxcb-keysyms.so.1 \
libxcb-res.so.0 \
libxcb.so.1"

inherit rpm
