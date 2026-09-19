SUMMARY = "Introspection bindings for the libpeas-gtk library"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility. \
 \
This package provides the GObject Introspection bindings for the \
libpeas-gtk library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.38.1"

RPM_NAME = "typelib-1_0-PeasGtk-1_0-1.38.1-1.3.aarch64.rpm"
RPM_HASH = "fbb3dfc4d436c7f30867369889723d8a224ec75931f0a1f0dec5acfb9805585f40c6833bae84e158b013dec1d443d3b9d6a4b4dcd21e050106e3a88a2c86a3e0"

RPROVIDES:${PN} += "typelib-1-0-PeasGtk-1-0 \
typelib-PeasGtk"

RDEPENDS:${PN} += ""

inherit rpm
