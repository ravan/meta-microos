SUMMARY = "Utility tools for RocksDB"
DESCRIPTION = "RocksDB is a high performance embedded database for key-value data. \
This package contains utility tools for RocksDB."
LICENSE = "(Apache-2.0 | GPL-2.0-only) & BSD-2-Clause"

PV = "11.8.1"

RPM_NAME = "rocksdb-tools-11.8.1-1.1.aarch64.rpm"
RPM_HASH = "874661bf7070cca61d87b064c8294c382cbbfbc075c6f483037e5d2e9b8ba7172a6b30efa1fc0a8a130d5c7a771459b989f76a21adf4c8645fc902a5c1569a85"

RPROVIDES:${PN} += "rocksdb-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librocksdb.so.11 \
libstdc++.so.6"

inherit rpm
