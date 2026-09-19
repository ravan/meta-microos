SUMMARY = "Vni table for ibus-table"
DESCRIPTION = "ibus-table-mongol-bichig provides the Vietnamese Vni table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.21"

RPM_NAME = "ibus-table-vni-1.3.21-1.5.noarch.rpm"
RPM_HASH = "8a217e0d316e311951730e4aaa00e9087de5220a36628eeffc6c6bdfc312d0ade3d91b13eb9890e005277484326904aeb18f67b59588d36e0df81a33ce19634d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-vni"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
