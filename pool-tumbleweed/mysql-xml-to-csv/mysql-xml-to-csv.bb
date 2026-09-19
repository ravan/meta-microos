SUMMARY = "Convert MySQL XML output to CSV"
DESCRIPTION = "mysql-xml-to-csv converts MySQL XML query results (i.e., produced using \
the mysql(1) command when given the --xml flag) into a CSV file."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "mysql-xml-to-csv-1.0.3-1.4.aarch64.rpm"
RPM_HASH = "705f0f4513a11814ddd27b34c5c94ceb0f1ceaab9cec6a37834f63a60272201f320e27de29e7ac1ad1ef965fe6d892e81b53786b607de119bdf07ed05a210929"

RPROVIDES:${PN} += "mysql-xml-to-csv"

RDEPENDS:${PN} += "libc.so.6 \
libexpat.so.1"

inherit rpm
