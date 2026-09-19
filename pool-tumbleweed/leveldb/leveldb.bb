SUMMARY = "A key/value-store"
DESCRIPTION = "leveldb implements a system for maintaining a persistent key/value store."
LICENSE = "BSD-3-Clause"

PV = "1.23"

RPM_NAME = "leveldb-1.23-6.7.aarch64.rpm"
RPM_HASH = "ae26a494c467e36514c8657993068b8620d0c05ca423e5218ac7ff7427c2b48975926ffdcc4948c1b27ff3e7c880f27260fa84568c2de6946fa43a49efdb06e4"

RPROVIDES:${PN} += "leveldb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsnappy.so.1 \
libstdc++.so.6"

inherit rpm
