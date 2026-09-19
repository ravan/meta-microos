SUMMARY = "OpenCloud client integration for caja file manager"
DESCRIPTION = "This package provides a plugin to integrate opencloud client into the caja \
file manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "caja-extension-opencloud-1.0.0-1.4.noarch.rpm"
RPM_HASH = "fd7defb4eed130317e4ec04ced0ae1f530be3b132c2b3f79b153287f7920498c712276282c4697b2e17711377a38f8269b22daaf9cc1b703465a70faef958404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-extension-opencloud"

RDEPENDS:${PN} += "caja \
opencloud-extensions-resources \
python-caja \
python3-gobject"

inherit rpm
