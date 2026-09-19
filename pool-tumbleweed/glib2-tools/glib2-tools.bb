SUMMARY = "Tools from glib2, a general-purpose utility library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.3"

RPM_NAME = "glib2-tools-2.88.3-1.1.aarch64.rpm"
RPM_HASH = "d53eff620443d7831be7e3d95ff581a7d201781af36fc49c0d8005eae2c2dd07d4e31efcb82401053d6482cc4cf30598a448dc0e156390eafef8d29315de13af"

RPROVIDES:${PN} += "glib2-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1 \
libgio-2-0-0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
