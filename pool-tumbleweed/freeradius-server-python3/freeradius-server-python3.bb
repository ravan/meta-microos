SUMMARY = "Python3 support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing Python3 support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.8"

RPM_NAME = "freeradius-server-python3-3.2.8-1.8.aarch64.rpm"
RPM_HASH = "13f1c080b4ad1503d798fee7c6bc79bac380674fc09af17937353c0eb13c36853af3468f266af6cd0fbe39bc58cdfa63e1257b2ee6824a65bb459313b01a09d6"

RPROVIDES:${PN} += "freeradius-server-python3"

RDEPENDS:${PN} += "/usr/bin/python3 \
freeradius-server \
group-radiusd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.13.so.1.0"

inherit rpm
