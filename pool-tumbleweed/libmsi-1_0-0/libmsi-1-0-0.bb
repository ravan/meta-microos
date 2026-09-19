SUMMARY = "Library to inspect and build Windows Installer (.MSI) files"
DESCRIPTION = "libmsi is a port of (and a subset of) Wine's implementation of the Windows \
Installer."
LICENSE = "LGPL-2.1-or-later"

PV = "0.106"

RPM_NAME = "libmsi-1_0-0-0.106-1.7.aarch64.rpm"
RPM_HASH = "b8c3e7362173f2c8a456ae32a1e5ef198e82e034c89e0b87a9500aa00a9af82b81b13f9bd2eecb12fd3ac6b2c00e17a2a6498713f64f090f884a1b5e9e03f96c"

RPROVIDES:${PN} += "libmsi-1-0-0 \
libmsi-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114"

inherit rpm
