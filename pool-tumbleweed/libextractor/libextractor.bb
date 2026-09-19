SUMMARY = "Library to Extract Metadata from Files"
DESCRIPTION = "GNU Libextractor is a library for extracting meta data from various files types. \
 \
The 'libextractor' package contains the 'extract' command. Install 'libextractor-plugins' \
to install all available file format plugins, or select individual packages \
from 'libextractor-plugins*' as needed."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-1.14-1.2.aarch64.rpm"
RPM_HASH = "8c1744b31a6683a6aae7e6a24b0f1840df68876e3fc14d19470572aec6c7a0a333a1198b96eec5a7f2f71ccbfed8fd3f3fd5edebf3eb2e26ef429c47d35e519a"

RPROVIDES:${PN} += "libextractor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libextractor.so.3"

inherit rpm
