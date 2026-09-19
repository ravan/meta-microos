SUMMARY = "OpenBao database plugin for PostgreSQL"
DESCRIPTION = "OpenBao database plugin for PostgreSQL"
LICENSE = "MPL-2.0"

PV = "2.6.2"

RPM_NAME = "openbao-postgresql-database-plugin-2.6.2-1.1.aarch64.rpm"
RPM_HASH = "1a1c2187476aff151d5afec06560b954740d2896835c286227e03ad14e084f85f61ddeaec997d474714455ea4c2296607fbd6b9441552f2110f02ea05f3b1055"

RPROVIDES:${PN} += "openbao-postgresql-database-plugin"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
