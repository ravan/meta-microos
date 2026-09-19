SUMMARY = "CLI calendar with CalDAV support"
DESCRIPTION = "Khal is a CLI (console), CalDAV based calendar program, allowing syncing of \
calendars with a variety of other programs on a host of different platforms."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python313-khal-0.14.1-1.1.noarch.rpm"
RPM_HASH = "e0c4d3a1e58173a851e38380e58ca8069eb8a8cc002b5f55341c0a541aa6bde5334a68b6f0af0f1f4ba02e859781523706287679b86678dd52f21c354a7430b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-khal \
python3.13dist-khal \
python313-khal \
python3dist-khal"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-click \
python313-click-log \
python313-configobj \
python313-icalendar \
python313-python-dateutil \
python313-pytz \
python313-pyxdg \
python313-tzlocal \
python313-urwid \
update-alternatives"

inherit rpm
