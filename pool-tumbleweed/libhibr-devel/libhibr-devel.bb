SUMMARY = "Development files for libhibr"
DESCRIPTION = "libhibr is a library to access the Windows Hibernation File \
(hiberfil.sys) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libhibr."
LICENSE = "LGPL-3.0-or-later"

PV = "20210421"

RPM_NAME = "libhibr-devel-20210421-3.35.aarch64.rpm"
RPM_HASH = "f947835affd63ddba069d431bd067c90a3c053a8b90033fa9eac4401c244a974146de08c59415b58d95d9c34d8a6f18fea2e9965e44c96555aedfd43c3f7165c"

RPROVIDES:${PN} += "libhibr-devel \
pkgconfig-libhibr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libhibr1"

inherit rpm
