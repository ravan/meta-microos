SUMMARY = "PipeWire integration for KDE Plasma - DMA-BUF support"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package provides a helper for downloading DMA-BUF textures for CPU processing."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "libKPipeWireDmaBuf6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "c912a83793d1c826bb1baaccbbf318e60834e9dfe4f1d04a5ece222c69a080bc5e7591c64a50aa224dc44ecf0226dc212d1032cc2bc93a6e698062a60d298403"

RPROVIDES:${PN} += "libKPipeWireDmaBuf.so.6 \
libKPipeWireDmaBuf6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKPipeWire.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libdrm.so.2 \
libepoxy.so.0 \
libgbm.so.1 \
libstdc++.so.6"

inherit rpm
