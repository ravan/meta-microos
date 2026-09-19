SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6GAPIBlogger6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "1d86a25e0d1103774b5dc9e71c7e74a4f8d7ceef4e58d5c941b2fd565f11c08b59d60e12640d88402ac6a2252e02f35ea19199e3647b5cfb3dddde28f6db8cec"

RPROVIDES:${PN} += "libKPim6GAPIBlogger.so.6 \
libKPim6GAPIBlogger6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKPim6GAPICore.so.6 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
