SUMMARY = "Benchmarks for MariaDB"
DESCRIPTION = "This package contains benchmark scripts and data for MariaDB. \
 \
To run these database benchmarks, start the script 'run-all-tests' in \
the directory /usr/share/sql-bench after starting MariaDB."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "12.3.2"

RPM_NAME = "mariadb-bench-12.3.2-1.3.aarch64.rpm"
RPM_HASH = "59e3386e8e20de4263b038931bea3c4c9988ce4eca4d914d4f1abcff7aa68fd9e10ce4d48cc9cf8eaa14fff75014049d1086dbe0b1946b2b7a4e718d4d2e1b2b"

RPROVIDES:${PN} += "mariadb-bench \
mysql-bench"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libz.so.1 \
mariadb-client \
perl-DBD-mysql"

inherit rpm
