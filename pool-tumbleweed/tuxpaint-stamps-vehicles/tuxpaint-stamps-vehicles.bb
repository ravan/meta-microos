SUMMARY = "Vehicle stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-vehicles package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2023.07.20"

RPM_NAME = "tuxpaint-stamps-vehicles-2023.07.20-1.9.noarch.rpm"
RPM_HASH = "be29efe43ee9fa089e71a8d9c62cd82abbf7c300f644ca6f77d28a53d6aac923bea2631d71aa5cb818b3d5998f2f10cc682b0cc1e74517449a55fc62a5e9de28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-vehicles"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
