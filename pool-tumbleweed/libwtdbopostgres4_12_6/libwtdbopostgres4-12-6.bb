SUMMARY = "PostgreSQL back-end for the Wt::Dbo ORM library"
DESCRIPTION = "This package contains the PostgresSQL back-end for the Wt::Dbo ORM library."
LICENSE = "GPL-2.0-only"

PV = "4.12.6"

RPM_NAME = "libwtdbopostgres4_12_6-4.12.6-1.4.aarch64.rpm"
RPM_HASH = "5fbf1bdb671498aa51c0ab6b194605e1c2c70405887a4b1852fb21e3a46696f93e8f208ef11b0ff22e193286f16ea972b5a584f8810bc6fc9df78c02015371fc"

RPROVIDES:${PN} += "libwtdbopostgres.so.4.12.6 \
libwtdbopostgres4-12-6 \
wt-dbo-postgres"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpq.so.5 \
libstdc++.so.6 \
libwtdbo.so.4.12.6"

inherit rpm
