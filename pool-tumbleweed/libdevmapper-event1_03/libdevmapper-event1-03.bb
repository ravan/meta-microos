SUMMARY = "Event library for device-mapper"
DESCRIPTION = "Device mapper event daemon shared library"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.38_1.02.212"

RPM_NAME = "libdevmapper-event1_03-2.03.38_1.02.212-2.5.aarch64.rpm"
RPM_HASH = "08698e9da04f5d3b60fdf9d50d28963bd87a1faa1ac8988aadc381e7a0fa31ba061051605c71f688168dcc5d67fbe4e492a5e50374e4865fdf23aaaf0e482773"

RPROVIDES:${PN} += "libdevmapper-event.so.1.03 \
libdevmapper-event1-03"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper.so.1.03"

inherit rpm
