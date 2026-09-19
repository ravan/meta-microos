SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kontactinterface-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "2cd9611c9f51dd3b123b69eeb4ad2a31c8907354f7d7abfb7fc9e9f19546ef63657e153a5756ef65492a43cf165dff644c386794ca4d32870dba4e2fbf45b9bc"

RPROVIDES:${PN} += "cmake-KPim6KontactInterface \
kontactinterface-devel"

RDEPENDS:${PN} += "cmake-KF6Parts \
libKPim6KontactInterface6"

inherit rpm
