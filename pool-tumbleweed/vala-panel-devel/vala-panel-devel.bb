SUMMARY = "Development files for vala-panel"
DESCRIPTION = "Vala Panel is a desktop panel written in Vala and Gtk3. \
 \
This is a development package for vala-panel."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "vala-panel-devel-0.5.0-1.18.aarch64.rpm"
RPM_HASH = "88a96cf0942c140697266c0a3b1f5411e25d5c13337f36ebba34f1bfde6038dd892b7625f414cf820a5ce0a4c22446a9fe3e1675e4f9e26f33be508eb1e3e2fd"

RPROVIDES:${PN} += "pkgconfig-vala-panel \
vala-panel-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libpeas-1.0 \
pkgconfig-libwnck-3.0 \
vala-panel"

inherit rpm
