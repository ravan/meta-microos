SUMMARY = "Introspection bindings for libpeas, a GObject-based plugin engine"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility. \
 \
This package provides the GObject Introspection bindings for the libpeas \
library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.38.1"

RPM_NAME = "typelib-1_0-Peas-1_0-1.38.1-1.3.aarch64.rpm"
RPM_HASH = "440ae8efe66fc04b14eb0606a322b785d6ef038d33d48e78f8e43c7e6a4f0cd08f0d3250c1f0438a7b544246c6543e88532a5b2550ca1d15d7b2c55a96048639"

RPROVIDES:${PN} += "typelib-1-0-Peas-1-0 \
typelib-Peas"

RDEPENDS:${PN} += ""

inherit rpm
