SUMMARY = "Large set of desktop widgets"
DESCRIPTION = "This repository contains add-on widgets and classes for applications \
that use the Qt Widgets module."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kwidgetsaddons-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "1e5cd9bf68841f6d1f425a90b62ba095498f02135ca8f84a8cbabe58de5ff50fc89eb0a8aabc54ee9b5d8e0622cd06c22c42985785e897a2e0db8b866537ea3d"

RPROVIDES:${PN} += "kf6-kwidgetsaddons"

RDEPENDS:${PN} += ""

inherit rpm
