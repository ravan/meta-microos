SUMMARY = "Library to store login and logout of users (wtmpdb)"
DESCRIPTION = "The libwtmpdb provides various interfaces to read, write or modify \
the wtmpdb database."
LICENSE = "BSD-2-Clause"

PV = "0.76.0+git20260730.89c0861"

RPM_NAME = "libwtmpdb0-0.76.0+git20260730.89c0861-1.1.aarch64.rpm"
RPM_HASH = "5aa3ee593f70e245ebe746967a82ca29d8b5a27607902272712b80fd2cb80d3fa36603b809e6c91c703def1a5655cd3defd54d5356426383b6023e955c31eebd"

RPROVIDES:${PN} += "libwtmpdb.so.0 \
libwtmpdb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
libsystemd.so.0"

inherit rpm
