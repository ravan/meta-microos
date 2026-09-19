SUMMARY = "Shared library from rocksdb"
DESCRIPTION = "RocksDB is a high performance embedded database for key-value data. \
It is a fork of LevelDB which was then optimized to exploit many \
central processing unit (CPU) cores, and make efficient use of fast \
storage, such as solid-state drives (SSD), for input/output (I/O) \
bound workloads. It is based on a log-structured merge-tree (LSM tree) \
data structure. \
 \
This package holds the shared library of rocksdb."
LICENSE = "(Apache-2.0 | GPL-2.0-only) & BSD-2-Clause"

PV = "11.8.1"

RPM_NAME = "librocksdb11-11.8.1-1.1.aarch64.rpm"
RPM_HASH = "566e198bf3b000dcb53695fe07f42f52979de4dea85b868885830c6fbbb0e78b065989da5339ce08a6aa273d2d172b20a8035179b11af29c8963321c33b8c63a"

RPROVIDES:${PN} += "librocksdb.so.11 \
librocksdb11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgflags.so.2.2 \
liblz4.so.1 \
libm.so.6 \
libsnappy.so.1 \
libstdc++.so.6 \
liburing.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
