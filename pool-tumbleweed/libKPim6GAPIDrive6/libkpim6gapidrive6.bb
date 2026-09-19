SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6GAPIDrive6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "54c9d59c9db4ee454f636c8f9e2435e13336a57d430e09016ba8288847e4b8ee5c1781e8c385de9778a6f7a6ac7de7b863d7810b4315a57f9d6a11da291c72d8"

RPROVIDES:${PN} += "libKPim6GAPIDrive.so.6 \
libKPim6GAPIDrive6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKPim6GAPICore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
