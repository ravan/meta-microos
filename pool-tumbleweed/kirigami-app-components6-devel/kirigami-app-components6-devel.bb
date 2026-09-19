SUMMARY = "Kirigami addons and modules"
DESCRIPTION = "Kirigami addons and modules necessary to do a full featured KDE application, \
such as integration with configurable keyboard shortcuts and standard actions."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "kirigami-app-components6-devel-1.0.1-1.2.aarch64.rpm"
RPM_HASH = "899d8fbdb2d0236fbb4fdfbbf9f6bfa453d3f3bdcf40d4c87673e3336066bc5467b58f204a8621744abf7bb4e3e9d3566df767885ef903f34b92a73fd69cf958"

RPROVIDES:${PN} += "cmake-KF6KirigamiAppComponents \
kirigami-app-components6-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
kf6-extra-cmake-modules \
libKirigamiActionCollection6"

inherit rpm
