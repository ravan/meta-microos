SUMMARY = "Tcl Client Library for PostgreSQL"
DESCRIPTION = "This package contains the libpgtcl client library as a loadable Tcl \
package. It is needed to access PostgreSQL databases from Tcl scripts."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "PgTcl-1.7-13.8.aarch64.rpm"
RPM_HASH = "b3960b1c8016c920371a261feb282783e7422d0882908839c8b883b85c93f996a093d50d44c201f40564e75f64e7c33df550fb68c697fe0089c2486561ee0adc"

RPROVIDES:${PN} += "PgTcl \
libpgtcl1.7.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5"

inherit rpm
