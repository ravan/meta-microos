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

RPM_NAME = "readrec0-1.9-3.4.aarch64.rpm"
RPM_HASH = "2f2b27db09590d6d3858940b485e8654f4b73a57e98588789cc675f6dea20b61e3e696746bb9412973f81e3927dc309cdd5bada5a98144618bf0d92869058d0f"

RPROVIDES:${PN} += "readrec0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
librec.so.1"

inherit rpm
