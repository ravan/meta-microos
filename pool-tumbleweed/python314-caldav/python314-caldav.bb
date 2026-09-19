SUMMARY = "CalDAV (RFC4791) client library for Python"
DESCRIPTION = "This project is a CalDAV (RFC4791) client library for Python. \
 \
It can read all the tags, but only write a few things (create calendars, \
events, modify events and properties)."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "python314-caldav-1.4.0-1.8.noarch.rpm"
RPM_HASH = "300311104b7ecea185403ac3134d1ecfbdd1b32665a63c9866507c8e2478d8bfd51515352b0e8a96324ada977706a0a200b7f52d026e3a624096a199d56febbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-caldav \
python314-caldav \
python3dist-caldav"

RDEPENDS:${PN} += "python-abi \
python314-icalendar \
python314-lxml \
python314-requests \
python314-vobject"

inherit rpm
