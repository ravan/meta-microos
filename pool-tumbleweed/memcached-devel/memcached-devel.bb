SUMMARY = "Files needed for development using memcached protocol"
DESCRIPTION = "Memcached is a high-performance, distributed memory object caching \
system, generic in nature, but intended for use in speeding up dynamic \
web applications by alleviating database load. \
 \
This package contains development files"
LICENSE = "BSD-3-Clause"

PV = "1.6.45"

RPM_NAME = "memcached-devel-1.6.45-1.1.aarch64.rpm"
RPM_HASH = "c4d29c626a75ebf6658d9674a52789ca49fff55c37713ba5670e6f13effe6c829f38aed965237616f7477da9b4ad77a5bf74196de0523bcf09828c8a8cb99cb9"

RPROVIDES:${PN} += "memcached-devel"

RDEPENDS:${PN} += "memcached"

inherit rpm
