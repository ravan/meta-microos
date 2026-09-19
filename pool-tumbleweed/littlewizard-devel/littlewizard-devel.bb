SUMMARY = "Development headers and files for littlewizard"
DESCRIPTION = "The littlewizard-devel package contains libraries and header files for \
littlewizard developing."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.2"

RPM_NAME = "littlewizard-devel-1.2.2-18.13.aarch64.rpm"
RPM_HASH = "defe833f03cdbf6992a33dc39eba147a2e5bc0d4b00d9a124cb8ac70c3d863967d2020d55856003b41925122c2c808e0da2c6a83b00293dbd0989451cd520b7c"

RPROVIDES:${PN} += "littlewizard-devel"

RDEPENDS:${PN} += "littlewizard"

inherit rpm
