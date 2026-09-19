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

RPM_NAME = "gnu-recutils-1.9-3.4.aarch64.rpm"
RPM_HASH = "d45d31e6f9fbc4aa26ce1087f6c528f21691f24240415c23a04647c8ee4a5195e80196f93678950686afbf330c33d2c1bacf235eebaf626abff0f6322fc7f753"

RPROVIDES:${PN} += "gnu-recutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libgcrypt.so.20 \
librec.so.1"

inherit rpm
