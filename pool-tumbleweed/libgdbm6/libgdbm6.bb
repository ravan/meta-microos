SUMMARY = "GNU dbm key/data database"
DESCRIPTION = "GNU dbm is a library of database functions that use extensible \
hashing and work similar to the standard UNIX dbm. These routines are \
provided to a programmer needing to create and manipulate a hashed \
database. \
 \
The basic use of GDBM is to store key/data pairs in a data file. Each \
key must be unique and each key is paired with only one data item. \
 \
The library provides primitives for storing key/data pairs, searching \
and retrieving the data by its key and deleting a key along with its \
data. It also supports sequential iteration over all key/data pairs in \
a database."
LICENSE = "GPL-3.0-or-later"

PV = "1.26"

RPM_NAME = "libgdbm6-1.26-1.6.aarch64.rpm"
RPM_HASH = "45c6305c6fbf0b93ad275bff1ae9133402ad27541f710498ca0a0d38fc3ac7dd5a96686292cbe8ad06b45a410cdebdeb865c85b05e7f47920c4cebe043f29d4f"

RPROVIDES:${PN} += "gdbm \
libgdbm.so.6 \
libgdbm6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
