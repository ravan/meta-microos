SUMMARY = "Shared library for FreeXL"
DESCRIPTION = "FreeXL is an open source library to extract valid data from within an Excel \
(.xls) spreadsheet."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "2.0.0"

RPM_NAME = "libfreexl1-2.0.0-1.11.aarch64.rpm"
RPM_HASH = "debfeb5d391e39f96a5c8b195f1850cf3bb5f5f934c5ebe522492195e9a7b7199f7ba12a106d783c218b1c4e95716b4b1518c3cdfee1f8a386f8398f6b87ebf6"

RPROVIDES:${PN} += "libfreexl.so.1 \
libfreexl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libm.so.6 \
libminizip.so.1"

inherit rpm
