SUMMARY = "Files for developing with xbsql"
DESCRIPTION = "XBase DBMS is a C++ library that supports access to XBase type data \
files and indexes (.dbf and related files, for example). It provides \
record level access to these files. \
 \
This package contains development files"
LICENSE = "LGPL-2.1-or-later"

PV = "0.11"

RPM_NAME = "xbsql-devel-0.11-261.9.aarch64.rpm"
RPM_HASH = "454bdd1d2e330822c3c9ca33f9adcb1259e3e662164ff1a8cd1df7811ca40d141ab2aa54a62bf66e38f23e7060dc90f6cae95b2a4008f7bceceb826d94392513"

RPROVIDES:${PN} += "xbsql-devel"

RDEPENDS:${PN} += "libxbsql0"

inherit rpm
