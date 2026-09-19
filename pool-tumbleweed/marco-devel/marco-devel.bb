SUMMARY = "MATE window manager development files"
DESCRIPTION = "Marco is a small window manager, using GTK+ to do everything. It is \
developed mainly for the MATE Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "marco-devel-1.28.1-2.5.aarch64.rpm"
RPM_HASH = "1b84dcad1c61807a341a8f10c47e2c4994f5ac8142cc0f02565a71f466816470d32e6d7cb5a4fd67b3a132efb4dde06e6a11b0c6e8716257501e4c7e31fb5ac9"

RPROVIDES:${PN} += "marco-devel \
mate-window-manager-devel \
pkgconfig-libmarco-private"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmarco-private2 \
pkgconfig-gtk+-3.0"

inherit rpm
