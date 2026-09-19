SUMMARY = "Cockpit user interface for packages"
DESCRIPTION = "The Cockpit components for installing OS updates and Cockpit add-ons, \
via PackageKit."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-or-later & MIT & CC-BY-SA-3.0 & BSD-3-Clause"

PV = "365"

RPM_NAME = "cockpit-packagekit-365-2.1.noarch.rpm"
RPM_HASH = "8c54760f9228c14bd6214ff46fb088401a16668524780706bada9853ccaf83ef4524538a30fe2ee5cccb8a81c03676be8871de50f7aa1074f423b333b722885d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-packagekit"

RDEPENDS:${PN} += "PackageKit \
cockpit-bridge \
libzypp-plugin-appdata \
polkit"

inherit rpm
