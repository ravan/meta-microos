SUMMARY = "Utility for parsing Excel (XLS) files"
DESCRIPTION = "This package contains libxls2csv, a tool which converts an XLS file to \
CSV format, more suitable for parsing."
LICENSE = "BSD-2-Clause"

PV = "1.6.3"

RPM_NAME = "libxls-tools-1.6.3-1.7.aarch64.rpm"
RPM_HASH = "cff17d3008f21b8994eb2cdec5bd554a1234b27b566e14e484db6e14790c1b663471401e1489ebbe342a6a8537c245ed30fe132c051574b548e56365d4123715"

RPROVIDES:${PN} += "libxls-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxlsreader.so.8"

inherit rpm
