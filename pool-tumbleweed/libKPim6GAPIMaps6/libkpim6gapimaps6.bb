SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6GAPIMaps6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "b29c33291b110d878958af72fa02ae33ae883262b8db59ea20760dd46c0ff50b52b8390877c8d29ced7e5fc8e65a229c439317e917d0ea615592951ebb8248a7"

RPROVIDES:${PN} += "libKPim6GAPIMaps.so.6 \
libKPim6GAPIMaps6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Contacts.so.6 \
libKPim6GAPICore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
