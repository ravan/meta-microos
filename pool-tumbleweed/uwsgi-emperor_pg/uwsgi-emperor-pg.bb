SUMMARY = "PostgreSQL Emperor Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains an emperor plugin allowing for configuration of \
applications (vassals) in a PostgreSQL database."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.31"

RPM_NAME = "uwsgi-emperor_pg-2.0.31-4.4.aarch64.rpm"
RPM_HASH = "5bb96fa6b12446c30ea7e39bf1d68446fdeaae0b4236b4d3f2a6eb3a64e548d5ea3a9222aec4980b32d4de5857961f147286755db79e91c4227736a00bda833e"

RPROVIDES:${PN} += "uwsgi-emperor-pg"

RDEPENDS:${PN} += "libc.so.6 \
libpq.so.5 \
uwsgi"

inherit rpm
