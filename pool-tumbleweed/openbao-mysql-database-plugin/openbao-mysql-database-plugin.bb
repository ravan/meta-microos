SUMMARY = "OpenBao database plugin for MySQL"
DESCRIPTION = "OpenBao database plugin for MySQL"
LICENSE = "MPL-2.0"

PV = "2.6.2"

RPM_NAME = "openbao-mysql-database-plugin-2.6.2-1.1.aarch64.rpm"
RPM_HASH = "2c7659cd684c5b744405ca7b0ba3e76ab2aae20bd3cc79a9a3cbfe1b24973f3f9a6dc38805c23b6747034246e8180535e36717382e0ab9b223522c56c9525702"

RPROVIDES:${PN} += "openbao-mysql-database-plugin"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
