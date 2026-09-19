SUMMARY = "Standard library modules"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic, designed \
for applying a flexible scripting-based approach to enterprise interface \
development but is also useful as a general purpose language. \
 \
This package provides the Qore language standard library user and binary \
modules."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "2.2.1"

RPM_NAME = "qore-stdlib-2.2.1-1.1.aarch64.rpm"
RPM_HASH = "de2665a70da947c8fec77ab713b7669e0cade4490914d3dc4231e8266f3a0bbcabdfad3472c968d86dc56296d3572331b7e87019d87a3e81732aff3ce8a6d171"

RPROVIDES:${PN} += "qore-stdlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqore12 \
libstdc++.so.6"

inherit rpm
