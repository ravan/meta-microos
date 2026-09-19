SUMMARY = "Library for accessing Windows thumbnail cache databases"
DESCRIPTION = "libwtcdb is a library to access the Windows (Vista/7) Explorer \
thumbnail cache database (WTCDB) format (thumbcache.db). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20260527"

RPM_NAME = "libwtcdb1-20260527-1.10.aarch64.rpm"
RPM_HASH = "a32d03ef8fc7f9118fff6b355b6f7b635463974022864947f63d7b0976012eafff8617536cd3bc508347cfe39578e8c52bf18c9f5e5bd35d473df1b3a77c148a"

RPROVIDES:${PN} += "libwtcdb.so.1 \
libwtcdb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1"

inherit rpm
