SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.16.2+git0.6a3cfa5"

RPM_NAME = "postgresql18-orafce-4.16.2+git0.6a3cfa5-2.5.aarch64.rpm"
RPM_HASH = "c0c3a254b7522756705c04b7c35037411c7c402e1412ee5296e39ea7ba42de6d6041bfca4aa1a743abbbf5af41fc159b120c974148820d02ed0126a4b52c5d7d"

RPROVIDES:${PN} += "orafce \
postgresql18-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql18-server"

inherit rpm
