SUMMARY = "Shared library for Lightning Memory-Mapped Database (LMDB)"
DESCRIPTION = "LMDB is a Btree-based database management library with an API similar \
to BerkeleyDB. The library is thread-aware and supports concurrent \
read/write access from multiple processes and threads. The DB \
structure is multi-versioned, and data pages use a copy-on-write \
strategy, which also provides resistance to corruption and eliminates \
the need for any recovery procedures. The database is exposed in a \
memory map, requiring no page cache layer of its own. \
 \
This package contains the shared library."
LICENSE = "OLDAP-2.8"

PV = "0.9.35"

RPM_NAME = "liblmdb-0_9_35-0.9.35-1.3.aarch64.rpm"
RPM_HASH = "99033f6f54286f152b34f943bbbc3da6620f3371faf664a80fae737cd969c2a819895980420a1411a7551cd06eb15335cbf61bf01b02abd7998ca9457a34ba1f"

RPROVIDES:${PN} += "liblmdb-0-9-35 \
liblmdb-0.9.35.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
