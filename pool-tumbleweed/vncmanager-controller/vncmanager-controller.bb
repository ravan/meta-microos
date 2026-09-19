SUMMARY = "Configuration application for VNC session"
DESCRIPTION = "This is configuration application to configure sharing and security from inside VNC session."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "vncmanager-controller-1.0.2-4.5.aarch64.rpm"
RPM_HASH = "95b04440f2898258043b5fe884e31d2200701e625a4664a60f622c07942190d83ee5abd57f4ae6b1068e25a64a90dc787ad6a70e68c4223d59e347e1106b0912"

RPROVIDES:${PN} += "vncmanager-controller"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libXvnc.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
vncmanager"

inherit rpm
