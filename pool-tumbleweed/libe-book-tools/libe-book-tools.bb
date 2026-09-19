SUMMARY = "Tools to transform e-books into other formats"
DESCRIPTION = "Tools to transform e-books into other formats. \
Currently supported: XHTML, raw, text."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libe-book-tools-0.1.3-4.14.aarch64.rpm"
RPM_HASH = "097b1802816170bd97a411cf13fd60dd2441a8f70352d0c8140255780d2faead3a83a902e48b248afb9aed922c5192bbc12a77b3dd484b9203212b1ecd89b258"

RPROVIDES:${PN} += "libe-book-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libe-book-0.1.so.1 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6"

inherit rpm
