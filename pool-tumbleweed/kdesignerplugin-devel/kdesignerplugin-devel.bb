SUMMARY = "Build environment for kdesignerplugin, a framework for integration of KDE frameworks widgets"
DESCRIPTION = "This framework provides plugins for Qt Designer that allow it to display \
the widgets provided by various KDE frameworks, as well as a utility \
(kgendesignerplugin) that can be used to generate other such plugins \
from ini-style description files. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kdesignerplugin-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "bb8587dd2fe3ec5c8aff11b6d6faf7775fc12df433169f9706042d5ddd1b26572f0751bc3251523a717dad0f8b7eda55b43d1990a31e8e35071fc34a7e66f851"

RPROVIDES:${PN} += "cmake-KF5DesignerPlugin \
kdesignerplugin-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
kdesignerplugin"

inherit rpm
