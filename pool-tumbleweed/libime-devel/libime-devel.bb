SUMMARY = "Development files for libime"
DESCRIPTION = "This package provides development files for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.13"

RPM_NAME = "libime-devel-1.1.13-1.5.aarch64.rpm"
RPM_HASH = "24b6a75702fb48cf692eaee14abb947974dd41dcf5628342f2d8bf77eb3976d9abbfec0a3cdf2d7f7710c9c7ab6d4906487ab3d5bb394f4f817c5248905e384e"

RPROVIDES:${PN} += "cmake-LibIMECore \
cmake-LibIMEPinyin \
cmake-LibIMETable \
libime-devel"

RDEPENDS:${PN} += "libIMECore0 \
libIMEPinyin0 \
libIMETable0"

inherit rpm
