SUMMARY = "zstd and zlib based gzip drop-in"
DESCRIPTION = "Zstd, short for Zstandard, is a lossless compression algorithm, \
targeting faster compression than zlib at comparable ratios. \
 \
This subpackage provides a compatible alternative to gzip(1) using \
an optimized deflate/zlib handling."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.5.7"

RPM_NAME = "zstd-gzip-1.5.7-6.1.aarch64.rpm"
RPM_HASH = "e447483b294d255a2541c87ff671c6cbc2859061cc7bfe4b5f2e990106e5f8544146559132e9507bc959f556a4fa620bc63f2b469cca73ee517cae30036491d9"

RPROVIDES:${PN} += "alternative-gzip \
gzip \
zstd-gzip"

RDEPENDS:${PN} += "zstd"

inherit rpm
