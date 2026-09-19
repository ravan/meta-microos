SUMMARY = "Pager for PostgreSQL, MariaDB, Percona, and MySQL"
DESCRIPTION = "Advanced pager for PostgreSQL and MySQL databases. \
Everybody who uses psql uses less pager. It is working well, but there is \
not any special support for tabular data. Tabular data related features \
are core functionality of this pager."
LICENSE = "BSD-2-Clause"

PV = "5.8.16"

RPM_NAME = "pspg-5.8.16-1.3.aarch64.rpm"
RPM_HASH = "b2c46b138a4593b6f8faf412da200c8990e19ce7979b6941338d1700d13ec2831de3bfbb790882547f39bcb4b516f72fde3798d1eb6c4f2146c701ea57065d5f"

RPROVIDES:${PN} += "pspg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
