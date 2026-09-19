SUMMARY = "Development files for gtk-layer-shell"
DESCRIPTION = "Development files and headers for gtk-layer-shell"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "0.10.1"

RPM_NAME = "gtk-layer-shell-devel-0.10.1-1.4.aarch64.rpm"
RPM_HASH = "9d7f88db660431e283da88d527970803358d2ff9bb6309761ce3c19289e448c92bafc5ed84e9e68f36908d3dacfc0b41e8f30b94994e75215f4b858466e6ade4"

RPROVIDES:${PN} += "gtk-layer-shell-devel \
pkgconfig-gtk-layer-shell-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtk-layer-shell0 \
pkgconfig-gtk+-3.0 \
pkgconfig-wayland-client \
typelib-1-0-GtkLayerShell-0-1"

inherit rpm
