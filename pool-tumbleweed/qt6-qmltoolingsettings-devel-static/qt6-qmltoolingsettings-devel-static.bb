SUMMARY = "Qt6 QmlToolingSettings static library"
DESCRIPTION = "The Qt6 QmlToolingSettings static library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-qmltoolingsettings-devel-static-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "4784692e39a977371d7c7a4c471f89b8c790a4369cae823692743ace0e68ba3081c7a2aa80ace7e9ba62bc9d31d3b5e5979bda96b1038f1cd75b174678ad30c0"

RPROVIDES:${PN} += "cmake-Qt6QmlToolingSettingsPrivate \
qt6-qmltoolingsettings-devel-static"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate"

inherit rpm
