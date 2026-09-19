SUMMARY = "GNU Data Access (GDA) Library"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-xslt-6_0-6_0_0-6.0.0-11.5.aarch64.rpm"
RPM_HASH = "9c628c00ad175f5ae118cb58e2e434a213519901afc5b72e151267abc7d87b5d5b0e91fd2669ee76e6f796eecbc80d26708fb6236b9cb9e83cca124d7f1c469c"

RPROVIDES:${PN} += "libgda-xslt-6-0-6-0-0 \
libgda-xslt-6.0.so.6.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgda-6.0.so.6.0.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxml2.so.16 \
libxslt.so.1"

inherit rpm
