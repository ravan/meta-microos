SUMMARY = "QTermWidget data package"
DESCRIPTION = "Data files for qtermwidget library."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "2.4.0"

RPM_NAME = "qtermwidget-data-2.4.0-1.2.noarch.rpm"
RPM_HASH = "d3d7fba17c43d82cf33336aa68d9237a95c7e47fff27ba3a4def99f1d5dd50efeb915e6847c02c4a1421b1709a70f6055e0f4021f23c799321ed3a001d6d16f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qtermwidget-data"

RDEPENDS:${PN} += "libqtermwidget6-2"

inherit rpm
