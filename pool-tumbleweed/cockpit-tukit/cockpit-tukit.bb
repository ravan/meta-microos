SUMMARY = "Cockpit module for Transactional Update"
DESCRIPTION = "Cockpit module for Transactional Update"
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.8~git0.0c769f8"

RPM_NAME = "cockpit-tukit-0.1.8~git0.0c769f8-1.1.noarch.rpm"
RPM_HASH = "ff8da77d1e78d6348f3e1bc98bb32069b5c4ad11f8c1c96757a392e3d542892532d6e1e9930370f2a797ec6392ffb69a0315e9a5f44520c7bd9dedaa0d0e369e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-tukit"

RDEPENDS:${PN} += "cockpit-system \
tukitd"

inherit rpm
