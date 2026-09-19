SUMMARY = "GtkD peasd library"
DESCRIPTION = "This package contains the GtkD peasd library."
LICENSE = "LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "libpeasd-3-0-3.9.0-3.10.aarch64.rpm"
RPM_HASH = "e061740bb4d71d311625d03be4bd2be2a4651836a2591698f37dc8d34608e12582ca980337885da3accfa87ff2b2b29268fcf62c15d5f3132c03594d55838c55"

RPROVIDES:${PN} += "libpeasd-3-0 \
libpeasd-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libdruntime-ldc-shared.so.112 \
libgcc-s.so.1"

inherit rpm
