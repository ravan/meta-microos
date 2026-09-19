SUMMARY = "FreeRADIUS Development Files"
DESCRIPTION = "FreeRADIUS header files for development."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.8"

RPM_NAME = "freeradius-server-devel-3.2.8-1.8.aarch64.rpm"
RPM_HASH = "b644cdf78c1529419b10042eda12beac8a9a7ba48a97f84942d943df01f59fc887f065ffb91d56c1019e37fbcd5154db60cae57cefbc7b122390067154005bb1"

RPROVIDES:${PN} += "freeradius-server-devel"

RDEPENDS:${PN} += "freeradius-server-libs"

inherit rpm
