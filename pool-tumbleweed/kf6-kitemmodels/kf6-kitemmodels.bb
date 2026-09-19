SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kitemmodels-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "37022670538e3e5065a334c05a3981a9f38eea358833f886b1339ffa385aab23a945556b291d8219ebf5ec336d384ef689cff9ec8db066b352d1489f69741c81"

RPROVIDES:${PN} += "kf6-kitemmodels"

RDEPENDS:${PN} += ""

inherit rpm
