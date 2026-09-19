SUMMARY = "Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager. \
Development files."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-activities-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "c6c0f662f9df8125792c625df54c596b475bab6c1d0e5d8224ee14d5705168d647101d22ac5d682fc514924964c4c8c39a818217cf224ce8a2d85ebce2ed4561"

RPROVIDES:${PN} += "cmake-PlasmaActivities \
pkgconfig-PlasmaActivities \
plasma6-activities-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libPlasmaActivities7 \
pkgconfig-Qt6Core"

inherit rpm
