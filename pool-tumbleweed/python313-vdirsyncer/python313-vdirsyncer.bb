SUMMARY = "CalDAV and CardDAV synchronization module"
DESCRIPTION = "Vdirsyncer synchronizes calendars and addressbooks between two \
storages. The supported storages are CalDAV, CardDAV, arbitrary HTTP \
resources, vdir and some more. It aims to be for CalDAV and CardDAV \
what OfflineIMAP is for IMAP."
LICENSE = "BSD-3-Clause"

PV = "0.20.0"

RPM_NAME = "python313-vdirsyncer-0.20.0-1.5.noarch.rpm"
RPM_HASH = "62e7c364da35edf35e51cb0c43d25c7923860e100cdf7f166bff7e627fd1c2abc0c7ca73ce1b71321b5f8ea9018dbd2263926f2923d78e977077fc82aee51e28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vdirsyncer \
python3.13dist-vdirsyncer \
python313-vdirsyncer \
python3dist-vdirsyncer \
vdirsyncer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-aiohttp \
python313-aiostream \
python313-click \
python313-click-log \
python313-requests \
update-alternatives"

inherit rpm
