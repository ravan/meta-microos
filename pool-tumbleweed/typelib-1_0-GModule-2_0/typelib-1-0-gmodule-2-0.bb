SUMMARY = "Object-Oriented Framework for C"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The GObject library provides an object-oriented framework for C."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.3"

RPM_NAME = "typelib-1_0-GModule-2_0-2.88.3-1.1.aarch64.rpm"
RPM_HASH = "5439bbaebab1d0ad65a5675ed54a856fbf58d9d805947937271c82512a67ffa625dda18e6b9533852945a021fb0e143d6c32e083adcffd33e973982de1fc1106"

RPROVIDES:${PN} += "typelib-1-0-GModule-2-0 \
typelib-GModule"

RDEPENDS:${PN} += "libgmodule-2.0.so.0 \
typelib-GLib"

inherit rpm
