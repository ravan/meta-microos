SUMMARY = "Development files for snappy"
DESCRIPTION = "Snappy is a compression/decompression library. It does not aim for maximum \
compression, or compatibility with any other compression library; instead, it \
aims for high speeds and reasonable compression. \
 \
This package holds the development files for snappy."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "snappy-devel-1.2.2-1.5.aarch64.rpm"
RPM_HASH = "127b423b9185f28c486021aed891d509f9a32b8974cba8a2292cdc7730e03827c4c32dd5e3a79a35550fdaaab19c7356b19d15122ebff80728ee40e3ac53f89b"

RPROVIDES:${PN} += "cmake-Snappy \
pkgconfig-snappy \
snappy-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsnappy1"

inherit rpm
