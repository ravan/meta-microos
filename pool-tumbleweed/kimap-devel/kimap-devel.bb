SUMMARY = "Development files for kimap"
DESCRIPTION = "This package contains development headers to add IMAP support to PIM \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kimap-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "6536ffba5c4a1159a0644df965f4bc16c02acd37aa54801b3df7f203ba27ee3e972bd05ca65b889936780b1542b4c82bbb819f3b6422b3154a668208da8d9a54"

RPROVIDES:${PN} += "cmake-KPim6IMAP \
kimap-devel"

RDEPENDS:${PN} += "cmake-KF6CoreAddons \
cmake-KF6Mime \
cyrus-sasl-devel \
libKPim6IMAP6"

inherit rpm
