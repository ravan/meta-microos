SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kmbox-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "177e97f91418981d4d15645d5f12b7fb0aef8242195a9091579273fba7aaa081693cbc2b71bef6ddf8716a89599c8e9532be91c93cfa53f76067a9486f565aea"

RPROVIDES:${PN} += "cmake-KPim6Mbox \
kmbox-devel"

RDEPENDS:${PN} += "cmake-KF6Mime \
libKPim6Mbox6"

inherit rpm
