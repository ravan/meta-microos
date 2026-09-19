SUMMARY = "A client for the music player daemon (MPD)"
DESCRIPTION = "QUIMUP is a client for the music player daemon (MPD) written in C++ and QT3. \
 \
The program can be used with most Linux desktops (KDE, GNOME, XFCE). \
The interface offers controlling MPD's many features. \
The focus is on mouse handling: playlist management is done entirely by drag-&-drop; \
playback functions are directly accessible from the system tray."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.2"

RPM_NAME = "quimup-2.1.2-1.3.aarch64.rpm"
RPM_HASH = "f3538e12fa1965fc04e73ac8511ae74b8030ba1ecc2db431f081f6d1f4d426e2f9c5367d089126f168b94ba9c0e7c8eed48af3d5a9b0e1280637dfb50d39ccd3"

RPROVIDES:${PN} += "quimup"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libmpdclient.so.2 \
libstdc++.so.6 \
mpd"

inherit rpm
