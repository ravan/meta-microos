SUMMARY = "FDO Icon theme to go with openSUSE Enlightenment Theme"
DESCRIPTION = "An FDO Icon theme that matches the one used by the openSUSE Enlightenment \
theme"
LICENSE = "GPL-3.0-only"

PV = "20220430.1.26"

RPM_NAME = "openSUSE-e-X-Icons-20220430.1.26-3.2.noarch.rpm"
RPM_HASH = "ea430e89fe030e8e44cf47cd9df16bef7e81509664cc3bac173eafd7fa6b25d15f5435d75b9f564cd5f9e5be23e2131b253352abecca3bfb4f094362b6e91834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openSUSE-e-X-Icons"

RDEPENDS:${PN} += ""

inherit rpm
