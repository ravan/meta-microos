SUMMARY = "Postgresql support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing PostgreSQL support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.8"

RPM_NAME = "freeradius-server-postgresql-3.2.8-1.8.aarch64.rpm"
RPM_HASH = "a8777449b7727decd9c18eec9f5dfac1b69e484fb24d9d5b716df20e3d2a51a94b0b9abd8122fe590beb2d728a125573a887fff784e3d5b51208663b56ba2f28"

RPROVIDES:${PN} += "config-freeradius-server-postgresql \
freeradius-server-postgresql"

RDEPENDS:${PN} += "freeradius-server \
group-radiusd \
libc.so.6 \
libpq.so.5"

inherit rpm
