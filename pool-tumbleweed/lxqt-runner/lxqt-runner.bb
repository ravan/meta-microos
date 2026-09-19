SUMMARY = "LXQt application launcher"
DESCRIPTION = "lxqt-runner provides a GUI that comes up on the desktop and allows for \
launching applications or shutting down the system. A calculator function \
is implemented too."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-runner-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "ac94e7d8096d73528cc0917c7e4c2ffeacd485e48757bb12a11bff37ab10661bb47e3a4c9ec544a551ba343ba10a7a250bf1ac20f3ab4327f54ef219fe146895"

RPROVIDES:${PN} += "config-lxqt-runner \
lxqt-runner"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6WindowSystem.so.6 \
libLayerShellQtInterface.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xdg.so.4 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
liblxqt-globalkeys-ui.so.2 \
liblxqt-globalkeys.so.2 \
liblxqt.so.2 \
libmuparser.so.2.3.5 \
libstdc++.so.6"

inherit rpm
