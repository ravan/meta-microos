SUMMARY = "Development Files for the plasma5support framework"
DESCRIPTION = "Development Files for the plasma5support framework."
LICENSE = "LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma5support6-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "797fcdd563bd61ad23e1e70a819a79b8af8e0c17f52f5d9666512403fbc9f3f337926214071c883c571424cfcaf463ad496733bb854e8e8e644c74108bde6ca1"

RPROVIDES:${PN} += "cmake-Plasma5Support \
plasma5support6-devel"

RDEPENDS:${PN} += "cmake-KF6CoreAddons \
cmake-KF6Service \
cmake-Qt6Gui \
libPlasma5Support6"

inherit rpm
