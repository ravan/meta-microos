SUMMARY = "Library to Read and Write CSV Data"
DESCRIPTION = "libcsv is a CSV library written in ANSI C89 that can read and write \
CSV data. It provides an interface using callback functions to handle \
parsed fields and rows and can parse improperly formatted CSV files."
LICENSE = "LGPL-2.1+"

PV = "3.0.3"

RPM_NAME = "libcsv3-3.0.3-2.35.aarch64.rpm"
RPM_HASH = "08201656ad977d135a52c61f8f347496a13575d719f3a8f7c2019c6df66febee7d89e8de598897f673f1ca9c47b11e75898ab62b35f76e80f4141ca66024bdc5"

RPROVIDES:${PN} += "libcsv.so.3 \
libcsv3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
