SUMMARY = "Dx-cluster client for amateur radio"
DESCRIPTION = "Xdx is a dedicated network client for amateur radio operators who want \
to exchange DX (long distance) radio information. After connection \
to a DX-cluster, xdx will show DX-spots in a list and other messages \
('To all' and WWV/WCY messages) in a text widget."
LICENSE = "GPL-2.0-or-later"

PV = "2.91"

RPM_NAME = "xdx-2.91-1.7.aarch64.rpm"
RPM_HASH = "713b7166f662d6131953086c7b18228bb127cea10c5c5a602731c04b9931690b944e87e90ab581a43da2c39d1401acf8641130dfb759205491a6866eeea1ff15"

RPROVIDES:${PN} += "xdx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
