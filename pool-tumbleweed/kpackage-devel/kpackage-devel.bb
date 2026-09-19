SUMMARY = "Non-binary asset user-installable package managing framework"
DESCRIPTION = "This framework lets applications to manage user installable packages of non-binary assets. \
Development files."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.116.0"

RPM_NAME = "kpackage-devel-5.116.0-1.9.aarch64.rpm"
RPM_HASH = "816031f7d4481efcd2958c2771a2d78c44d9b657dfbbb943a38bf806819d55f80aef62fdc318b1d43af37392404bb7eb6aaecf1bdeb9301a1bb148606c866af9"

RPROVIDES:${PN} += "cmake-KF5Package \
kpackage-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
kpackage"

inherit rpm
