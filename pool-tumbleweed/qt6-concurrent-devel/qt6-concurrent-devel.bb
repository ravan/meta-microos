SUMMARY = "Development files for the Qt 6 Concurrent library"
DESCRIPTION = "Development files for the Qt 6 Concurrent library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-concurrent-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "be44523214d4bc35e45f546ae1c3108827ba73d27bde676d4b66733d50cc6fb4faf85b4939070532ff817595f3fa53ab99fda54034ee9765bb2bdf08363315fd"

RPROVIDES:${PN} += "cmake-Qt6Concurrent \
pkgconfig-Qt6Concurrent \
qt6-concurrent-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Concurrent6 \
pkgconfig-Qt6Core"

inherit rpm
