SUMMARY = "Extensive Archive Format Library"
DESCRIPTION = "The XAR project aims to provide an easily extensible archive format. Important \
design decisions include an easily extensible XML table of contents for random \
access to archived files, storing the toc at the beginning of the archive to \
allow for efficient handling of streamed archives, the ability to handle files \
of arbitrarily large sizes, the ability to choose independent encodings for \
individual files in the archive, the ability to store checksums for individual \
files in both compressed and uncompressed form, and the ability to query the \
table of content's rich meta-data."
LICENSE = "BSD-3-Clause"

PV = "1.8.0.0.503"

RPM_NAME = "libxar1-1.8.0.0.503-1.3.aarch64.rpm"
RPM_HASH = "3ab2e5c01d26014357968ab7d674be99bb53d8c24d353e190fa35259e755f3cc47aeae0e06e21a01a2f4966fcdba542dd4ee7b8e8cea61d1ca68e517f8fba56f"

RPROVIDES:${PN} += "libxar.so.1 \
libxar1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libxml2.so.16 \
libz.so.1"

inherit rpm
