SUMMARY = "Development files for qhexedit2"
DESCRIPTION = "The qhexedit2-devel package contains libraries and header files for \
developing applications that use qhexedit2."
LICENSE = "LGPL-2.0-only"

PV = "0.9.0"

RPM_NAME = "qhexedit2-devel-0.9.0-1.6.aarch64.rpm"
RPM_HASH = "850c7324f0a3c07190d64a9d653e06aa02a033fad7609545e22dcebae31c41e5eac88cbc62c6ada1e342ddf5bbba1e71e1d1ba64854bfff3b792108092ac6563"

RPROVIDES:${PN} += "pkgconfig-qhexedit2 \
qhexedit2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqhexedit0"

inherit rpm
