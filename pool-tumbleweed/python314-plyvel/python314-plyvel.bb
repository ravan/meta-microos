SUMMARY = "Python interface to LevelDB"
DESCRIPTION = "Plyvel is a Python interface to LevelDB. \
 \
In addition to basic features like getting, putting and deleting \
data, Plyvel allows you to use write batches, database snapshots, \
very flexible iterators, prefixed databases, bloom filters, custom \
cache sizes, custom comparators."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "python314-plyvel-1.5.1-2.7.aarch64.rpm"
RPM_HASH = "7c5f7e529ddedc8b06bbd07ba16112df47f2909762dde5ca3a24b5982207c215b303a506d79d78fb091a713616abe2504bfe22b34be1ad8c2a97772656fc4353"

RPROVIDES:${PN} += "python3.14dist-plyvel \
python314-plyvel \
python3dist-plyvel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libleveldb.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
