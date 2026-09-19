SUMMARY = "Development package for RocksDB"
DESCRIPTION = "RocksDB is a high performance embedded database for key-value data. \
It is a fork of LevelDB which was then optimized to exploit many \
central processing unit (CPU) cores, and make efficient use of fast \
storage, such as solid-state drives (SSD), for input/output (I/O) \
bound workloads. It is based on a log-structured merge-tree (LSM tree) \
data structure. \
 \
This package contains the files needed to compile programs that use \
the RocksDB library."
LICENSE = "(Apache-2.0 | GPL-2.0-only) & BSD-2-Clause"

PV = "11.8.1"

RPM_NAME = "rocksdb-devel-11.8.1-1.1.aarch64.rpm"
RPM_HASH = "2671096a28458c706d11f266b3d52fa70f935ac5298024cc95df4156fa1d927ada71b5d2cb4e139e20ddcfc78aac46b85faf6e26482a34ad72a568bfc723d587"

RPROVIDES:${PN} += "cmake-RocksDB \
pkgconfig-rocksdb \
rocksdb-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librocksdb11"

inherit rpm
