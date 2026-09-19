SUMMARY = "Development files for the KDE CD drive library"
DESCRIPTION = "This package contains the development headers for libkcompactdisc."
LICENSE = "GPL-2.0-or-later"

PV = "25.12.3"

RPM_NAME = "libkcompactdisc-qt6-devel-25.12.3-1.3.aarch64.rpm"
RPM_HASH = "45e42ff20964f584ff2c6355ee19bc2329f581500c8e67d3f2eaf9473183b741a1976151c3606133771e12bdb20782bbdc66553e683f69e0b60ea14e287f7c17"

RPROVIDES:${PN} += "cmake-KCompactDisc6 \
libkcompactdisc-qt6-devel"

RDEPENDS:${PN} += "libKCompactDisc6-5"

inherit rpm
