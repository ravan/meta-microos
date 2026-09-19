SUMMARY = "A library for dealing with ITSS/CHM files"
DESCRIPTION = "CHMLIB is a library for dealing with Microsoft ITSS/CHM format files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.40"

RPM_NAME = "libchm0-0.40-26.5.aarch64.rpm"
RPM_HASH = "580b4b7965146feefae3586be9ccc3b86176ac121daf52de581d5a45f723542ce85dcb2e98cde5e8424306634e19a105a083c819c77ca6057de2eb064b996ade"

RPROVIDES:${PN} += "chmlib \
libchm.so.0 \
libchm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
