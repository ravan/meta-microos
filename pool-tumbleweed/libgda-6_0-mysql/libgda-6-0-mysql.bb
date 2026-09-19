SUMMARY = "MySQL Provider for GNU Data Access (GDA)"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-mysql-6.0.0-11.5.aarch64.rpm"
RPM_HASH = "4fc3cb31ea75e931aafbcae7b2e6f50c58cd641fc7372d78f3dfc4919bd56c035aa71a876dcb3beaae2392fb452166a0cea7ccf612c7362f45f46ffeb949e861"

RPROVIDES:${PN} += "libgda-6-0-mysql \
libgda-mysql \
libgda-mysql-6.0.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgda-6-0-6-0-0 \
libgda-6.0.so.6.0.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmariadb.so.3"

inherit rpm
