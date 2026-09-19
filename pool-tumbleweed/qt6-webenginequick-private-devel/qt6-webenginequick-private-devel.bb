SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineQuick library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webenginequick-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e98152e026364a03591642d72daa6c616a1b222aaa8e155013fd9ae9ed6d2260cb0bca83365073d5a2ee7d232b05dd0f02116e143d28dfcb33a14ff34f9b0588"

RPROVIDES:${PN} += "cmake-Qt6WebEngineQuickPrivate \
qt6-webenginequick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebEngineQuick"

inherit rpm
