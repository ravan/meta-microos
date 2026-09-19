SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6GAPIPeople6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "87e3dd211a522e592d250f035a09d49facbd748bc6672dd3b677a396c324b538448d87fdc970d4eb69188a00b3977cfecb60052e3a0d0aa6dea57538d4d7f1ea"

RPROVIDES:${PN} += "libKPim6GAPIPeople.so.6 \
libKPim6GAPIPeople6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Contacts.so.6 \
libKPim6GAPICore.so.6 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
