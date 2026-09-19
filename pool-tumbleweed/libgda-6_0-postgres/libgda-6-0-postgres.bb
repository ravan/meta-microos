SUMMARY = "PostgreSQL Provider for GNU Data Access (GDA)"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-postgres-6.0.0-11.5.aarch64.rpm"
RPM_HASH = "c421d223a9e9e117dda57ea515eb207bf96b44e625761d87b2e5f1ad5ceb7c87b70d648a46f14e3607408b8ae2b9cef45cafeeba6df199597fb73553a1d8e86b"

RPROVIDES:${PN} += "libgda-6-0-postgres \
libgda-postgres \
libgda-postgres-6.0.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgda-6-0-6-0-0 \
libgda-6.0.so.6.0.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpq.so.5"

inherit rpm
