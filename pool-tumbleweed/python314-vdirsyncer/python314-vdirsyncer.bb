SUMMARY = "CalDAV and CardDAV synchronization module"
DESCRIPTION = "Vdirsyncer synchronizes calendars and addressbooks between two \
storages. The supported storages are CalDAV, CardDAV, arbitrary HTTP \
resources, vdir and some more. It aims to be for CalDAV and CardDAV \
what OfflineIMAP is for IMAP."
LICENSE = "BSD-3-Clause"

PV = "0.20.0"

RPM_NAME = "python314-vdirsyncer-0.20.0-1.5.noarch.rpm"
RPM_HASH = "28ed0530fcc57b9bab5e4f99e27bc4038d8ec9d5eb0c45b89a7be8b9f859f5d0c2bb19d71fb598375f1d21e13d1c92d9cbd69859ccef7ffc48838100dde45e94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-vdirsyncer \
python314-vdirsyncer \
python3dist-vdirsyncer \
vdirsyncer"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-aiohttp \
python314-aiostream \
python314-click \
python314-click-log \
python314-requests \
update-alternatives"

inherit rpm
