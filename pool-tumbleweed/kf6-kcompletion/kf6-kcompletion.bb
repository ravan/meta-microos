SUMMARY = "Widgets with advanced completion support"
DESCRIPTION = "KCompletion provides widgets with advanced completion support as well as a \
lower-level completion class which can be used with your own widgets."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kcompletion-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "877f2f517fca28926185d5249595c0a23759af16a08f5965d29774d2f2ed61808a4bcb52ec10888cf0a726800fae8db9e0b87669eae5796d8fe4c859e5abf40f"

RPROVIDES:${PN} += "kf6-kcompletion"

RDEPENDS:${PN} += ""

inherit rpm
