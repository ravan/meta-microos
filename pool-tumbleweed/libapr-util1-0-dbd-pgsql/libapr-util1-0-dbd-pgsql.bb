SUMMARY = "DBD driver for PostgreSQL"
DESCRIPTION = "DBD driver for PostgreSQL database."
LICENSE = "Apache-2.0"

PV = "1.6.5"

RPM_NAME = "libapr-util1-0-dbd-pgsql-1.6.5-1.1.aarch64.rpm"
RPM_HASH = "ae2d4a49e1406dd16cab27e350d4b5456b47f1de50c5e8ff96cf992bda5e330143270d69eb808f926cc2f54aea85c19d2821ebd616b3d634de255e8bb748aa01"

RPROVIDES:${PN} += "libapr-util1-0-dbd-pgsql"

RDEPENDS:${PN} += "libapr-util1-0 \
libc.so.6 \
libpq.so.5"

inherit rpm
