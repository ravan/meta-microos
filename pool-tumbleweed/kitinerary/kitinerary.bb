SUMMARY = "Data model and extraction system for travel reservations"
DESCRIPTION = "Kitinerary is a library which provides a data model and a system to extract \
information from travel reservations. The model can then be reused in other \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kitinerary-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "8ca361546ac9d92ac71231f1cc312ac1cd0c30c794757887d727ff29a350dc10edd1743c3b21adbb1af7d58e9157156299b0fd19d97425834789642775bd8ad1"

RPROVIDES:${PN} += "kitinerary"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKPim6Itinerary.so.6 \
libKPim6Itinerary6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
