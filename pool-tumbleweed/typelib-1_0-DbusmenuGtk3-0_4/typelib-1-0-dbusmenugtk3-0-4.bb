SUMMARY = "Introspection bindings for libdbusmenu-gtk3-4"
DESCRIPTION = "This package contains the GObject Introspection bindings for the GTK+ 3 version \
of the dbusmenu-gtk library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "typelib-1_0-DbusmenuGtk3-0_4-16.04.0-13.4.aarch64.rpm"
RPM_HASH = "51d84057a86a2b1ada64ec2576a703fedc677d348fe2049ed32b1cb99f3952ab921fb6c93f7a423b7b45a48fce645358c9e8507de7feb5ad7ec8155b5a05e5bd"

RPROVIDES:${PN} += "typelib-1-0-DbusmenuGtk3-0-4 \
typelib-DbusmenuGtk3"

RDEPENDS:${PN} += ""

inherit rpm
