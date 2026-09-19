SUMMARY = "An LDAP-like embedded database"
DESCRIPTION = "LDB is an LDAP-like embedded database."
LICENSE = "LGPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "libldb2-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "826d25dddd7e096ccc9732751308da861e98e2675dd30d3a20cd4c4cf17bf6abe304d656aea2ec07bfd385fd0bfd779bd7a6faaba4e06662374468910fba26cb"

RPROVIDES:${PN} += "libldb-key-value-private-samba.so \
libldb-mdb-int-private-samba.so \
libldb-tdb-err-map-private-samba.so \
libldb-tdb-int-private-samba.so \
libldb.so.2 \
libldb2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblmdb-0.9.35.so \
libtalloc.so.2 \
libtdb.so.1 \
libtevent.so.0"

inherit rpm
