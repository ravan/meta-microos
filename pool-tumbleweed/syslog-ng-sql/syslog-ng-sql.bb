SUMMARY = "SQL support using DBI for syslog-ng"
DESCRIPTION = "This package provides the libafsql module providing support for \
logging into a SQL database using DBI."
LICENSE = "GPL-2.0-only"

PV = "4.12.0"

RPM_NAME = "syslog-ng-sql-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "3db0d1c1c9365350a5522c5f230bec44df41bbad461ae30b0859e631803422435beea5dc4860b39bb4d5b7a9e2fdf21e945cc99640d53f22c00b000a52dd07eb"

RPROVIDES:${PN} += "syslog-ng-sql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdbi.so.3 \
libsyslog-ng-4.12.so.0 \
syslog-ng"

inherit rpm
