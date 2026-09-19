SUMMARY = "Global keyboard shortcuts registration"
DESCRIPTION = "Daemon and library for global keyboard shortcuts registration"
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-globalkeys-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "e4b1a2ba471064dcd2f429179855da5c1bd6db29faedaec049e194af896b7cc3508720f7f77f50f8ebcb70fa0450ac1d05ffe8bb2afff09fe7d39a40ad999f35"

RPROVIDES:${PN} += "config-lxqt-globalkeys \
lxqt-globalkeys"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
liblxqt.so.2 \
libstdc++.so.6 \
lxqt-globalkeys-branding"

inherit rpm
