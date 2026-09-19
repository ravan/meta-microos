SUMMARY = "Development package for libkomparediff2"
DESCRIPTION = "Development package for libkomparediff2."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libkomparediff2-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "faf3fb4c788c8d236abcc1cd40127940140582ed44dd6ab35ebefadf022b851f67826380553b401dd3b90626f10c6debceb5d9c6f210a89cb4651b0aa639bebf"

RPROVIDES:${PN} += "cmake-KompareDiff2 \
libkomparediff2-devel"

RDEPENDS:${PN} += "cmake-KF6Config \
cmake-KF6XmlGui \
cmake-Qt6Core \
cmake-Qt6Widgets \
libkomparediff2-6"

inherit rpm
