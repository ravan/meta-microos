SUMMARY = "Qt interface for the VLC media player"
DESCRIPTION = "This subpackage provides a Qt interface for VLC and selects it by \
default when `vlc` is invoked from an X session."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.23"

RPM_NAME = "vlc-qt-3.0.23-7.12.aarch64.rpm"
RPM_HASH = "482e1f4d2a752f60abfaedf061edc9c189bb07d2250cdc5c370825d6b60d43bd395bb456cee6c4f5783d560eed31784381b19771fe7e25f6bfcd741a59adac16"

RPROVIDES:${PN} += "libqt-plugin.so \
vlc-qt"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvlccore.so.9 \
libwayland-client.so.0 \
vlc-noX"

inherit rpm
