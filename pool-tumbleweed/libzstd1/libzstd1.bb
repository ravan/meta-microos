SUMMARY = "Zstd compression library"
DESCRIPTION = "Zstd, short for Zstandard, is a lossless compression algorithm, \
targeting faster compression than zlib at comparable ratios. \
 \
This subpackage contains the implementation as a shared library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.5.7"

RPM_NAME = "libzstd1-1.5.7-6.1.aarch64.rpm"
RPM_HASH = "60c18cc6a3fa7b7a5bfbbc58b82c0725159f0baf5e73a2eee9c31d02f591be9ca873ffbb3a95e4074fe225a9f83bebce224913ce50412d2f2bce028dc28048ca"

RPROVIDES:${PN} += "libzstd.so.1 \
libzstd1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
