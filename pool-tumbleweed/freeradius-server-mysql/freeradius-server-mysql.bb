SUMMARY = "MySQL support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing MySQL support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.8"

RPM_NAME = "freeradius-server-mysql-3.2.8-1.8.aarch64.rpm"
RPM_HASH = "d90a4cce5bd32f96d7d2b542b6bf435110520f826bfae3fb95ede39f7f02be710ecdb777f6210365aed9da85e7f4c880c409ede3b267c8a767db674a4ee3b877"

RPROVIDES:${PN} += "config-freeradius-server-mysql \
freeradius-server-mysql"

RDEPENDS:${PN} += "freeradius-server \
group-radiusd \
libc.so.6 \
libmariadb.so.3"

inherit rpm
