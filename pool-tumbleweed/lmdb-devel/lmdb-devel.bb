SUMMARY = "Development package for lmdb"
DESCRIPTION = "LMDB is a Btree-based database management library with an API similar \
to BerkeleyDB. The library is thread-aware and supports concurrent \
read/write access from multiple processes and threads. The DB \
structure is multi-versioned, and data pages use a copy-on-write \
strategy, which also provides resistance to corruption and eliminates \
the need for any recovery procedures. The database is exposed in a \
memory map, requiring no page cache layer of its own. \
 \
This package contains the files needed to compile programs that use \
the liblmdb library."
LICENSE = "OLDAP-2.8"

PV = "0.9.35"

RPM_NAME = "lmdb-devel-0.9.35-1.3.aarch64.rpm"
RPM_HASH = "2e55c1384d9f7cb2b4746dbb9faad01d3ee52b2ab4750b01c34bf3be36cf234e4d5fa669fed8864ebcbcc6bb0b4e2e0a5503e22b363fc4053dc97962ef0091bc"

RPROVIDES:${PN} += "lmdb-devel \
pkgconfig-lmdb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblmdb-0-9-35"

inherit rpm
