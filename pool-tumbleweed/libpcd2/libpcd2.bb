SUMMARY = "Library For Reading PhotoCD Images"
DESCRIPTION = "Libraries for reading PhotoCD images."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "libpcd2-1.0.1-10.7.aarch64.rpm"
RPM_HASH = "6dca375cfcd8f98cd04329c7efd585e7d7e1c0350c2e12d8a7f663184fc71f4de36b577a3f4c4f31ac18048a53dcffcdaa03282fa4307f47c58ad06adabe3a8e"

RPROVIDES:${PN} += "libpcd.so.2 \
libpcd2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
