SUMMARY = "Kea I/O utility function library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-util-io12-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "15443007218e0e6559ba000691088a591c87ea9b81bcc2cfaa37e8484bcc961e7fb66d6daf990315c982a636e116bb3996640cf2f3e6b190515ea04e616299bf"

RPROVIDES:${PN} += "libkea-util-io.so.12 \
libkea-util-io12"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
