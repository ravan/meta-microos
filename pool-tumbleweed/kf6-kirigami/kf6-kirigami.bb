SUMMARY = "Set of QtQuick components"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kirigami-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "252acb41f1e9d0ec19f9792dfaa32c4323a81fa42447daff53835f59db70f28abc890db9970a2512dcc0c78df07c82c4c0397a8904926e41a432c1754fb526a1"

RPROVIDES:${PN} += "kf6-kirigami"

RDEPENDS:${PN} += "qt6-declarative-imports \
qt6-qt5compat-imports"

inherit rpm
