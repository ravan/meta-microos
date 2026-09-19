SUMMARY = "JBIG2 decoder development files"
DESCRIPTION = "This package contains development files needed for developing applications \
based on libjbig2dec."
LICENSE = "AGPL-3.0-or-later"

PV = "0.20"

RPM_NAME = "jbig2dec-devel-0.20-2.13.aarch64.rpm"
RPM_HASH = "e8713fde8ceeaf516a8ff218036fb4eb7368130598a45915e5270299d0b233472861ba53f165772934ca9c7bfdc643b7be22bf7577dca438c6f641f54fd7b0db"

RPROVIDES:${PN} += "jbig2dec-devel \
pkgconfig-jbig2dec"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjbig2dec0"

inherit rpm
