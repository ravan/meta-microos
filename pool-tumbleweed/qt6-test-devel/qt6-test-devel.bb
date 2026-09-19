SUMMARY = "Development files for the Qt 6 Test library"
DESCRIPTION = "Development files for the Qt 6 Test library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-test-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "f6959c66a381ae3eeaa775ff88070dd3a3a57f46c587063d0cedfd430df3028debe1154bd1c0a1335d54295c35173b228e4c3abdf048594abd40212f46f83f3c"

RPROVIDES:${PN} += "cmake-Qt6Test \
pkgconfig-Qt6Test \
qt6-test-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Test6 \
pkgconfig-Qt6Core"

inherit rpm
