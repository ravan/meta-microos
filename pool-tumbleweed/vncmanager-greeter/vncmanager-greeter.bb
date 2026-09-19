SUMMARY = "Greeter for VNC session manager"
DESCRIPTION = "This is graphical greeter that appears when VNC client connects to VNC manager."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "vncmanager-greeter-1.0.0-1.42.aarch64.rpm"
RPM_HASH = "e4fe4f0d8f37df4c7bd90b5a4e01b116d74a01bef90c7197034e12ed6c07db0397cbce3038e5c883169070f03c06fb808e48a2983a7db41b96de109a2a6f66fe"

RPROVIDES:${PN} += "vncmanager-greeter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
