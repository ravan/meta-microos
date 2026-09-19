SUMMARY = "Owncloud client integration for caja file manager"
DESCRIPTION = "This package provides a plugin to integrate owncloud client into the caja \
file manager."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.0"

RPM_NAME = "caja-extension-owncloud-6.1.0-1.2.noarch.rpm"
RPM_HASH = "46f6f422f826254234cdd467017d89cbb6086d8528fd01530b2971b4e841b2723f4c4ccc802b25127acc18128a6ba1927a9dbea04f3093d474740ebfcb03b530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-extension-owncloud"

RDEPENDS:${PN} += "caja \
owncloud-client \
python-caja \
python3-gobject"

inherit rpm
