SUMMARY = "General-Purpose Utility Library -- Library for Modules"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The libgmodule library provides a portable way to dynamically load \
object files (commonly known as 'plug-ins')."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.3"

RPM_NAME = "libgmodule-2_0-0-2.88.3-1.1.aarch64.rpm"
RPM_HASH = "faadf3ff4a17e81f978af2a5ea1b80567adf67896fad67c7682811df3710de8a31f74f22d88b6b296020476b21ff15094d324668e07507becd11c508a2838340"

RPROVIDES:${PN} += "libgmodule-2-0-0 \
libgmodule-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
