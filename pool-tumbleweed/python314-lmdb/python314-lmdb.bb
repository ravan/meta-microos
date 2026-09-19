SUMMARY = "Universal Python binding for the LMDB 'Lightning' Database"
DESCRIPTION = "This is a universal Python binding for the LMDB 'Lightning' Database. \
 \
LMDB is a tiny database with the following properties: \
  * Ordered map interface (keys are always lexicographically sorted). \
  * Reader/writer transactions: readers don’t block writers, \
    writers don’t block readers. \
    Each environment supports one concurrent write transaction. \
  * Cheap read transactions. \
  * Environments may be opened by multiple processes on the same host. \
  * Multiple named databases may be created with transactions covering \
    all named databases. \
  * Memory mapped, allowing for zero copy lookup and iteration. \
    This is optionally exposed to Python using the buffer() interface. \
  * Maintenance requires no external process or background threads. \
  * No application-level caching is required: \
    LMDB uses the operating system’s buffer cache."
LICENSE = "OLDAP-2.8"

PV = "2.2.1"

RPM_NAME = "python314-lmdb-2.2.1-1.3.aarch64.rpm"
RPM_HASH = "1a97bedaf0bdc1a8f1cad579a616a01c8fc3adc9f77ffba60aeb1f6ab5d7d93d8fc46fba5bd21f13625252cdf50b2cf5678aa2d5dcb27284578523d2d60fa255"

RPROVIDES:${PN} += "python3.14dist-lmdb \
python314-lmdb \
python3dist-lmdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblmdb-0.9.35.so \
python-abi"

inherit rpm
