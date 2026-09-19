SUMMARY = "MySQL back-end for the Wt::Dbo ORM library"
DESCRIPTION = "This package contains the MySQL back-end for the Wt::Dbo ORM library."
LICENSE = "GPL-2.0-only"

PV = "4.12.6"

RPM_NAME = "libwtdbomysql4_12_6-4.12.6-1.4.aarch64.rpm"
RPM_HASH = "55e849f418a437e010829e088dfd8ee82b53c9e1f7ea99dc4954e915f48e21d3b7f6c3a9f83c7096a5b67ee266544770168c251fb5ed3daf6c1e05e22a8939d9"

RPROVIDES:${PN} += "libwtdbomysql.so.4.12.6 \
libwtdbomysql4-12-6 \
wt-dbo-mysql"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmariadb.so.3 \
libstdc++.so.6 \
libwtdbo.so.4.12.6"

inherit rpm
