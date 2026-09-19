SUMMARY = "Header files for kquickcharts, a set of charts for QtQuick applications"
DESCRIPTION = "Development files for KQuickCharts, a set of charts that can be used from QtQuick \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kquickcharts-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "71f4f8130b242e57e7103d63c234b5ffa24cca0d45650937e478a1210049669d5c23193cca27ca1ef2428d9371cf76fc59ac75ebc9f7163e7a5d80e5ab32431b"

RPROVIDES:${PN} += "cmake-KF6QuickCharts \
kf6-kquickcharts-devel"

RDEPENDS:${PN} += "kf6-kquickcharts"

inherit rpm
