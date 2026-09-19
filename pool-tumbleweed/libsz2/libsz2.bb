SUMMARY = "Lossless compression library for scientific data"
DESCRIPTION = "Lossless compression library for scientific data. Libsz2 is a drop-in \
replacement for the SZIP library (http://www.hdfgroup.org/doc_resource/SZIP)."
LICENSE = "BSD-2-Clause"

PV = "1.1.7"

RPM_NAME = "libsz2-1.1.7-1.3.aarch64.rpm"
RPM_HASH = "5671bc245184d1638825699c641730cf13918b6d88d41ecf13615b1695281b1d45304c099e04e996f51b8a9024a5366d06744474378dbe83ffe2483e3d338fe6"

RPROVIDES:${PN} += "libsz.so.2 \
libsz2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
