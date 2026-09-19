SUMMARY = "Development files for the Zstd compression library"
DESCRIPTION = "Zstd, short for Zstandard, is a lossless compression algorithm, \
targeting faster compression than zlib at comparable ratios. \
 \
Needed for compiling programs that link with the library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.5.7"

RPM_NAME = "libzstd-devel-1.5.7-6.1.aarch64.rpm"
RPM_HASH = "d33cefa58f7b7315c9a75b0c772f48f2aa3b82c9a86342ef3550277b824abf691f11b156692ac34d55af0c653863209be7d27075bbcfc16ebb03811f82dc346f"

RPROVIDES:${PN} += "cmake-zstd \
libzstd-devel \
pkgconfig-libzstd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libzstd1"

inherit rpm
