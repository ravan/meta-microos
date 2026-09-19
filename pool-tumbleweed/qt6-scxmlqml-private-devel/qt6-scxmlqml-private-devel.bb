SUMMARY = "Non-ABI stable API for the Qt 6 ScxmlQml library"
DESCRIPTION = "This package provides private headers of libQt6ScxmlQml that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-scxmlqml-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "4ed6b42dc8ce32b54a174216b7b1537934306310fba7b2bbcfa2fe6298c9a468e6b8d53de200c4d8c50025026d7f93b87b170a0a424ddf18d9489d89d229d8bd"

RPROVIDES:${PN} += "cmake-Qt6ScxmlQmlPrivate \
qt6-scxmlqml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6ScxmlQml"

inherit rpm
