SUMMARY = "Owncloud client integration for nemo file manager"
DESCRIPTION = "This package provides a plugin to integrate owncloud client into the nemo \
file manager."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.0"

RPM_NAME = "nemo-extension-owncloud-6.1.0-1.2.noarch.rpm"
RPM_HASH = "71ecd64fdca03f2e0e96fe158a09295dfb6de1a4a7b53271b32317243824865210888e683f64318ef00b650492740c09d9d96d9a2c74b832815a0b737cb3a82e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-owncloud"

RDEPENDS:${PN} += "nemo \
owncloud-client \
python3-gobject \
python3-nemo"

inherit rpm
