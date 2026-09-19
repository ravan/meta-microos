SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6GAPICalendar6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "53b59c0a1b93394cd4d05f35d6d8dbe849417ebfcccf86b41f9ef33028ac1e1e86e014201c1bc9208c21f10fba155ac0c7a49fa379614a12cdce70f23ed3010a"

RPROVIDES:${PN} += "libKPim6GAPICalendar.so.6 \
libKPim6GAPICalendar6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKPim6GAPICore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
