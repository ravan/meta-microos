SUMMARY = "LXQt Session Manager"
DESCRIPTION = "lxqt-session is the standard session manager used by LXQt. The lxqt-session manager \
is used to automatically start a set of applications and set up a working desktop \
environment. Moreover, the session manager is able to remember the applications in \
use when a user logs out and to restart them the next time the user logs in."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-session-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "93194dfa8ed97476f4bb66bca580ad62a3142c4302817f30472cd9cd7ace1815425af40d46a189870b94c0182c9f4a8728c38c9b8418b6d5091b8be2495c8fe7"

RPROVIDES:${PN} += "config-lxqt-session \
lxqt-session"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF6WindowSystem.so.6 \
libLayerShellQtInterface.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xdg.so.4 \
libX11.so.6 \
libc.so.6 \
liblxqt.so.2 \
libproc2.so.1 \
libstdc++.so.6 \
libudev.so.1 \
lxqt-session-branding \
qtxdg-tools \
update-alternatives"

inherit rpm
