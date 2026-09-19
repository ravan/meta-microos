SUMMARY = "DLZ modules which store zone data in a MySQL database"
DESCRIPTION = "This package includes dynamically loadable zone (DLZ) plugins \
which store zone data in a MySQL database \
The dlz_mysql_dynamic.so plugin does not support dynamic updates \
the dlz_mysqldyn_mod.so plugin is a dynamically loadable zone (DLZ) \
plugin that uses a fixed-schema MySQL database for back-end storage. \
It allows zone data to be updated via dynamic DNS updates, and \
sends DNS NOTIFY packets to other name servers when appropriate."
LICENSE = "MPL-2.0"

PV = "9.20.26"

RPM_NAME = "bind-modules-mysql-9.20.26-1.2.aarch64.rpm"
RPM_HASH = "b013e9cb5a157c7f31795aec398944f4b59b44f20f328c8060491cfc6c15f6872edfbdce13fa41ca2d173a65ac5975ea7ce4595302e8dec305d0162555df77c7"

RPROVIDES:${PN} += "bind-modules-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3"

inherit rpm
