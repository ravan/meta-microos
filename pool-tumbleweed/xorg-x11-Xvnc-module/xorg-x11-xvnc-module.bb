SUMMARY = "VNC module for X server"
DESCRIPTION = "This module allows to share content of X server's screen over VNC. \
It is loaded into X server as a module if enable in X server's \
configuration."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.16.1"

RPM_NAME = "xorg-x11-Xvnc-module-1.16.1-3.1.aarch64.rpm"
RPM_HASH = "b34e292a58d2b3993a387367a1304021331a8d46d71eb3dc6c75be2c243b3e15958395692a2149a200c777444a852e0d3018e32914bd104b755facb921ac6242"

RPROVIDES:${PN} += "libvnc.so \
xorg-x11-Xvnc-module"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
xorg-x11-Xvnc"

inherit rpm
