SUMMARY = "Non-ABI stable API for the Qt 6 3DCore library"
DESCRIPTION = "This package provides private headers of libQt63DCore that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dcore-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e0502ce8fea6c2899007752484fe30abff6c9cddff1ece52630cd9a47d908d17fcd87bab792b99aeb60c7fbc3fefc205c2764a583c45eb955de0b1ded8f65d23"

RPROVIDES:${PN} += "cmake-Qt63DCorePrivate \
qt6-3dcore-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DCore \
cmake-Qt6Concurrent \
cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate"

inherit rpm
