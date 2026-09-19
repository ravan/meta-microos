SUMMARY = "Development files for the Zstd compression library"
DESCRIPTION = "Zstd, short for Zstandard, is a lossless compression algorithm, \
targeting faster compression than zlib at comparable ratios. \
 \
Needed for compiling programs that link with the library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.5.7"

RPM_NAME = "libzstd-devel-static-1.5.7-6.1.aarch64.rpm"
RPM_HASH = "2344c7139c8450068f800437f3bc258b74687a873ea76f7087179365bd2920595402104fb5ca4ebe7d32781093292a1de782db2e1158b609707f3c158d9a638c"

RPROVIDES:${PN} += "libzstd-devel-static"

RDEPENDS:${PN} += "glibc-devel-static \
libzstd-devel"

inherit rpm
