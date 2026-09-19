SUMMARY = "MySQL driver for libdbi"
DESCRIPTION = "This driver provides connectivity to MySQL database servers through \
the libdbi database independent abstraction layer. Switching a \
program's driver does not require recompilation or rewriting source \
code."
LICENSE = "LGPL-2.1+"

PV = "0.9.0.g53"

RPM_NAME = "libdbi-drivers-dbd-mysql-0.9.0.g53-4.8.aarch64.rpm"
RPM_HASH = "bdfa575b34f96058c3974fa521509c40ee93570839368c4cfa9b2c45154036aa11cdf549ddf24a97ebe772790f75644acaae419aa150779b768eecc74396594d"

RPROVIDES:${PN} += "libdbdmysql.so \
libdbi-drivers-dbd-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbi.so.3 \
libmariadb.so.3"

inherit rpm
