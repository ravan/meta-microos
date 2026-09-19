SUMMARY = "Sqlite Provider for GNU Data Access (GDA)"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-sqlite-6.0.0-11.5.aarch64.rpm"
RPM_HASH = "7e9bc145610803ebec181d71f5e5948848f5edfe2778857463eabce3ad8b873d4d56cd926a63f4e27a6dc45fff95e122a1b664726e11fd249506eb18a805a41e"

RPROVIDES:${PN} += "libgda-6-0-sqlite \
libgda-sqlite \
libgda-sqlite-6.0.so"

RDEPENDS:${PN} += "libgda-6-0-6-0-0 \
libgda-6.0.so.6.0.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
