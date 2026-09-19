SUMMARY = "Development files for signond-libs"
DESCRIPTION = "This package contains the development files for signond-libs."
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "signond-libs-devel-8.61-2.10.aarch64.rpm"
RPM_HASH = "d8f0bb078abd88423f737f22cb9a5274030c09dcde44f31d4201bb22bf52638072904f02300b9180e7def58fc0772ef54e066747ae838f2ff14ef01469058368"

RPROVIDES:${PN} += "pkgconfig-SignOnExtension \
pkgconfig-signond \
signond-libs-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-Qt6Core \
signond \
signond-libs"

inherit rpm
