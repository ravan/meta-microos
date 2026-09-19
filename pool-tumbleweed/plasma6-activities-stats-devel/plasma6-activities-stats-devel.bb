SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager. \
Development files."
LICENSE = "LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-activities-stats-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "36f915ed56aa331c418a635f435be12d6f0ba66fb6b3df5b9c7639b81b07b7b898c1fe27e1781205927f5dae562fd85e75091e52f5e1c749d759a5e8b6c05a77"

RPROVIDES:${PN} += "cmake-PlasmaActivitiesStats \
pkgconfig-PlasmaActivitiesStats \
plasma6-activities-stats-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libPlasmaActivitiesStats1 \
pkgconfig-Qt6Core"

inherit rpm
