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

RPM_NAME = "python313-lmdb-2.2.1-1.3.aarch64.rpm"
RPM_HASH = "69a9e76420ea6b02c652c7fc9c92841ccff978716b4187113ac4453c3ba17fbd6f98d89c0865db5159c60cac98e424be86b2ee95300084a418efd51298e218ef"

RPROVIDES:${PN} += "python3-lmdb \
python3.13dist-lmdb \
python313-lmdb \
python3dist-lmdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblmdb-0.9.35.so \
python-abi"

inherit rpm
