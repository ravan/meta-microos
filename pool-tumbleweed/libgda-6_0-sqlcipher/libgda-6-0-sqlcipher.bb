SUMMARY = "SQLCipher Provider for GNU Data Access (GDA)"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-sqlcipher-6.0.0-11.5.aarch64.rpm"
RPM_HASH = "545e745f202c59cc3d9d97ddb2710b49e58d42cd04df2bed1eb3cb544fbe03a1bc56fba28da000f2344494ee2347bd448df3deb8695f74a5d6f36e3d54582ef8"

RPROVIDES:${PN} += "libgda-6-0-sqlcipher \
libgda-sqlcipher \
libgda-sqlcipher-6.0.so"

RDEPENDS:${PN} += "libgda-6-0-6-0-0 \
libgda-6-0-sqlite \
libgda-6.0.so.6.0.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsqlcipher.so.0"

inherit rpm
