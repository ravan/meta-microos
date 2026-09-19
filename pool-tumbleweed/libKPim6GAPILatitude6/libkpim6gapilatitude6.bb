SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6GAPILatitude6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "5969faf0e9b58be205087484a1d97a9921c4e8d8208c4ae3da3d78e39bd45db11096906620182f23d1d693d6cca930bb087a38075d95d539386b713904cf7eb2"

RPROVIDES:${PN} += "libKPim6GAPILatitude.so.6 \
libKPim6GAPILatitude6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Contacts.so.6 \
libKPim6GAPICore.so.6 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
