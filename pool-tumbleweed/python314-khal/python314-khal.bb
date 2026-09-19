SUMMARY = "CLI calendar with CalDAV support"
DESCRIPTION = "Khal is a CLI (console), CalDAV based calendar program, allowing syncing of \
calendars with a variety of other programs on a host of different platforms."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python314-khal-0.14.1-1.1.noarch.rpm"
RPM_HASH = "ffb450168bb22275c0fdb8d780cf94b3436042e79f258aa1bb1edd508c4b3adeca68be5ec20e1052e32102abe0333746f4d3aa70b2738f7a68551b39b1178134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-khal \
python314-khal \
python3dist-khal"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-click \
python314-click-log \
python314-configobj \
python314-icalendar \
python314-python-dateutil \
python314-pytz \
python314-pyxdg \
python314-tzlocal \
python314-urwid \
update-alternatives"

inherit rpm
