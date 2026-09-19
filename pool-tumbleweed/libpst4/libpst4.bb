SUMMARY = "A library for reading Personal Storage Table files"
DESCRIPTION = "libpst is a library that can decode the email messages stored in a \
.pst (Personal Storage Table) file as created by Outlook."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.76"

RPM_NAME = "libpst4-0.6.76-3.6.aarch64.rpm"
RPM_HASH = "82838e988080529f6c884ddea928a7648a149a6fc541747ab06b4df25d39d47b17d5bdfb4e8d9a2e97b7d5ce85b3b85547c10e4f9904583f3caaac535f5faac0"

RPROVIDES:${PN} += "libpst.so.4 \
libpst4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
