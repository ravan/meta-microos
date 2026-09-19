SUMMARY = "Database Management Tool for PostgreSQL"
DESCRIPTION = "PgAccess is a graphical interface and application building environment \
for PostgreSQL."
LICENSE = "PostgreSQL"

PV = "0.99.0.20040219"

RPM_NAME = "pgaccess-0.99.0.20040219-20.7.noarch.rpm"
RPM_HASH = "fac6a3d5a1deab236db0ada924dfe0cc4dc9fd245194e67d111dcf69d13f479493348d88f3511de22a628921750a030cea35256a6e3fb5c08abcbc6804d56cac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pgaccess"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/tclsh \
PgTcl \
tcllib \
tk"

inherit rpm
