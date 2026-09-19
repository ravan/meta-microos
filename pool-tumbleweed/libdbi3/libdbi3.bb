SUMMARY = "Database Independent Abstraction Layer for C"
DESCRIPTION = "libdbi implements a database-independent abstraction layer in C, \
similar to the DBI/DBD layer in Perl. Writing one generic set of \
code, programmers can leverage the power of multiple databases and \
multiple simultaneous database connections by using this framework."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.0.g33"

RPM_NAME = "libdbi3-0.9.0.g33-4.20.aarch64.rpm"
RPM_HASH = "9e2e38188e98f87034cd67196583ddfce42392063020c7b8c3c8b4f3cacf1141a2e5a197dfa8f6d57efb876fcb1536b9cce876b0ee060ce9f6aa453ebc4a4154"

RPROVIDES:${PN} += "libdbi.so.3 \
libdbi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
