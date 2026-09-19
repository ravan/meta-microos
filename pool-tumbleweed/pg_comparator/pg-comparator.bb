SUMMARY = "A tool to compare and sync tables in different locations"
DESCRIPTION = "PgComparator is a tool to compare possibly very big tables in different locations and report differences, with a network and time-efficient approach."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "pg_comparator-2.2.5-5.28.aarch64.rpm"
RPM_HASH = "18f0bd21c337f7428a81ebde7219840457453cb8348d74f0e3917da9d40db6cde96f4025997a90886946734d2f62a9dbcb9b6cae5e5dfb6c2a7a34c6d6c50663"

RPROVIDES:${PN} += "pg-comparator"

RDEPENDS:${PN} += "/usr/bin/perl \
libc.so.6 \
perl \
perl-DBD-Pg \
perl-DBD-mysql \
postgresql"

inherit rpm
