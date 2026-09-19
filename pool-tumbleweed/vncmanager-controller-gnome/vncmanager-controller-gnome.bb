SUMMARY = "Configuration application for VNC session"
DESCRIPTION = "This is configuration application to configure sharing and security from inside VNC session."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "vncmanager-controller-gnome-1.0.2-4.5.noarch.rpm"
RPM_HASH = "51019fe9356490f313e266fa7e27a2db19a3a113debb404ed9213f97e1a2ffe2c96e4795cd8817d6a4319593df31c24cded92f3a7271e5e701085bc824351dbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vncmanager-controller-gnome"

RDEPENDS:${PN} += "gnome-shell \
vncmanager-controller"

inherit rpm
