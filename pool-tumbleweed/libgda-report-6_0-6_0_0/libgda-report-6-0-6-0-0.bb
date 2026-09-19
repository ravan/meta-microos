SUMMARY = "GNU Data Access (GDA) Library"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-report-6_0-6_0_0-6.0.0-11.5.aarch64.rpm"
RPM_HASH = "c9ce5d947688ffdd53ee9606af18ada5da145cb9daae221f109f2c20efdca2fc62748787cdddc1c3143285a45dd2a9254aef66bb59e2577e0d5b49b18ec09ac1"

RPROVIDES:${PN} += "libgda-report-6-0-6-0-0 \
libgda-report-6.0.so.6.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgda-6.0.so.6.0.0 \
libgda-report \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxml2.so.16"

inherit rpm
