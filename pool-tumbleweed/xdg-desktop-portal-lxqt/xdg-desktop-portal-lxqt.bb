SUMMARY = "A backend implementation for xdg-desktop-portal"
DESCRIPTION = "A backend implementation for xdg-desktop-portal that is using Qt/KF5/libfm-qt. \
functionality needed by nearly all of its components."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "xdg-desktop-portal-lxqt-1.4.0-1.5.aarch64.rpm"
RPM_HASH = "1a233b8d77cd806d86bb5c02727d78207eea957203b5149eb9ea6631e7f71490c0fb4d945d84fa53234b38ff5f09926f97d9e0374878111c3e6733666dad18bc"

RPROVIDES:${PN} += "xdg-desktop-portal-lxqt"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libfm-qt6.so.17 \
libgcc-s.so.1 \
libstdc++.so.6 \
xdg-desktop-portal"

inherit rpm
