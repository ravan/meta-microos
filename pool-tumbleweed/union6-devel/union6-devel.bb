SUMMARY = "Qt style supporting both QtQuick and QtWidgets"
DESCRIPTION = "A Qt style supporting both QtQuick and QtWidgets."
LICENSE = "LGPL-2.1-or-later"

PV = "6.7.5"

RPM_NAME = "union6-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "d8ec12074063137d130f3a29bdc6aced880e48694eb7b70b872c8b7389b77b661216c45dcfb44cbf7f005a6b42680e599c89783729db4e694daa0c1ad30a91d0"

RPROVIDES:${PN} += "cmake-Union \
union6-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libUnion.so.6 \
libc.so.6 \
libstdc++.so.6 \
union6"

inherit rpm
