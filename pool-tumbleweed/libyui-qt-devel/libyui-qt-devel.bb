SUMMARY = "Libyui - Header files for the Qt (graphical) user interface"
DESCRIPTION = "This package contains the header files for the Qt based \
user interface component for libyui. \
 \
This package is not needed to develop libyui-based applications, \
only to develop extensions for libyui-qt."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.7.7"

RPM_NAME = "libyui-qt-devel-4.7.7-1.2.aarch64.rpm"
RPM_HASH = "87063528fc93f44e5a07b4ad52dc45cf5f2d8151fe2195620b0f93934e35f4a5827dcc686b341a621399a68a67eeeef993564dc3615891c398fe0ae75933dc33"

RPROVIDES:${PN} += "libyui-qt-devel \
pkgconfig-libyui-qt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fontconfig-devel \
libyui-devel \
libyui-qt16"

inherit rpm
