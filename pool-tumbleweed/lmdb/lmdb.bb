SUMMARY = "Lightning Memory-Mapped Database Manager"
DESCRIPTION = "LMDB is a Btree-based database management library with an API similar \
to BerkeleyDB. The library is thread-aware and supports concurrent \
read/write access from multiple processes and threads. The DB \
structure is multi-versioned, and data pages use a copy-on-write \
strategy, which also provides resistance to corruption and eliminates \
the need for any recovery procedures. The database is exposed in a \
memory map, requiring no page cache layer of its own."
LICENSE = "OLDAP-2.8"

PV = "0.9.35"

RPM_NAME = "lmdb-0.9.35-1.3.aarch64.rpm"
RPM_HASH = "9e855902657bc6440ea4bed26cb7007373bdba9115800198fa3c2b58a749d5d08d176adec84b7031424e447c749faac5571898b35a848cd84d78afd10c472e1f"

RPROVIDES:${PN} += "lmdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblmdb-0.9.35.so"

inherit rpm
