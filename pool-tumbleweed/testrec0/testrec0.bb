SUMMARY = "Text-based databases called recfiles"
DESCRIPTION = "A set of tools and libraries to access human-editable, text-based \
databases. \
 \
The data is stored as a sequence of records, each record containing \
an arbitrary number of named fields. \
 \
Despite its simplicity, recfiles can be used to store medium-sized \
databases."
LICENSE = "GPL-3.0-or-later"

PV = "1.9"

RPM_NAME = "testrec0-1.9-3.4.aarch64.rpm"
RPM_HASH = "9b3549cec5b999440948102b2268c71d2bfd9dd1fdcdab74c577b9202f2387f609ffb5ff36302cf267914702e86e0de299469d1fc09988ff5069c41edcba6c05"

RPROVIDES:${PN} += "testrec0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
librec.so.1"

inherit rpm
