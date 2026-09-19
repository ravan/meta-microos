SUMMARY = "GNU Data Access (GDA) Library -- Developer Documentation"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-doc-6.0.0-11.5.aarch64.rpm"
RPM_HASH = "cd28599aabe61452e3846f9939238269d491005d6d0b2687ed67819896233a5ab7a202757644cfb088d762d4e98de3346f05f3322206703d9002fffcdfcff2cf"

RPROVIDES:${PN} += "libgda-6-0-doc \
libgda-doc"

RDEPENDS:${PN} += ""

inherit rpm
