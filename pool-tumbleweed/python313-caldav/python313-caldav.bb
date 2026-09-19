SUMMARY = "CalDAV (RFC4791) client library for Python"
DESCRIPTION = "This project is a CalDAV (RFC4791) client library for Python. \
 \
It can read all the tags, but only write a few things (create calendars, \
events, modify events and properties)."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "python313-caldav-1.4.0-1.8.noarch.rpm"
RPM_HASH = "c0bade684c0229e30cb11c84399c2a7f4046cff5efddb486945274ca52bf5aa05e12736806d52c2c3648bedd36ffdcfdd1c633993cac839ab84597c2218601f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-caldav \
python3.13dist-caldav \
python313-caldav \
python3dist-caldav"

RDEPENDS:${PN} += "python-abi \
python313-icalendar \
python313-lxml \
python313-requests \
python313-vobject"

inherit rpm
