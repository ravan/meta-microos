SUMMARY = "Library to download and display gravatars"
DESCRIPTION = "This package contains the debug categories for the libgravatar library."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libgravatar-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "d5e0296851eaba25030769dcb1ca92b281e66a7508371fffe74de141b831884623a4a0324fc197223dfc9cf4db3beedd292b0ea16e0f36140b1ffc8058eb3b56"

RPROVIDES:${PN} += "libgravatar"

RDEPENDS:${PN} += ""

inherit rpm
