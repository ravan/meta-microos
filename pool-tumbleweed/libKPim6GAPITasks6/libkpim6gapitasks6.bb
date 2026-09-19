SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6GAPITasks6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "6831fe9e57f6cc2b0bb3246b2bda179f035a2c719d669b1248f1ba620f00c237055bc044f959d595b7c2e6aaf6e7edea012591c5d1f0642ac30fdab181f52394"

RPROVIDES:${PN} += "libKPim6GAPITasks.so.6 \
libKPim6GAPITasks6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKPim6GAPICore.so.6 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
