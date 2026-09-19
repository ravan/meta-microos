SUMMARY = "Automatic SQL injection and database takeover tool"
DESCRIPTION = " \
sqlmap is an open source penetration testing tool that automates the process of \
detecting and exploiting SQL injection flaws and taking over of database \
servers. It comes with a powerful detection engine, many niche features for the \
ultimate penetration tester, and a broad range of switches including database \
fingerprinting, over data fetching from the database, accessing the underlying \
file system, and executing commands on the operating system via out-of-band \
connections."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.9"

RPM_NAME = "sqlmap-1.10.9-1.1.noarch.rpm"
RPM_HASH = "e3ba37a3a9316977c73d259f958b8a46e1ac7ee536a75d7a18c07b3f9e1c0d4b8e43dc7914cca42afac990c247c60e749f3409cc9550e5d2dfdd62b0eb2ca3fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sqlmap"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3"

inherit rpm
