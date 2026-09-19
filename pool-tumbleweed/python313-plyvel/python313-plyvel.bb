SUMMARY = "Python interface to LevelDB"
DESCRIPTION = "Plyvel is a Python interface to LevelDB. \
 \
In addition to basic features like getting, putting and deleting \
data, Plyvel allows you to use write batches, database snapshots, \
very flexible iterators, prefixed databases, bloom filters, custom \
cache sizes, custom comparators."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "python313-plyvel-1.5.1-2.7.aarch64.rpm"
RPM_HASH = "d4c2dac1961fc266f6b4e6af21b92064f955a7bac584763ed5e637d762f57882375600d92fe0f60c9ec251e2aa06cc89cc1a090aa9ffc65c460d3c801f041b9a"

RPROVIDES:${PN} += "python3-plyvel \
python3.13dist-plyvel \
python313-plyvel \
python3dist-plyvel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libleveldb.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
