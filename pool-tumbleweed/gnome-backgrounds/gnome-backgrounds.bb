SUMMARY = "GNOME Backgrounds"
DESCRIPTION = "Background images from the GNOME project."
LICENSE = "CC-BY-SA-3.0"

PV = "50.0"

RPM_NAME = "gnome-backgrounds-50.0-1.2.noarch.rpm"
RPM_HASH = "93f537fac0bb0f9be3255c851765e9561a16c75e70deb53cb72b7447757aa25b506530ccfb952715221e4f533f52ef1e52a3e55c621dbc41a62a7ab3dfc44c05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-backgrounds"

RDEPENDS:${PN} += "glycin-loaders"

inherit rpm
