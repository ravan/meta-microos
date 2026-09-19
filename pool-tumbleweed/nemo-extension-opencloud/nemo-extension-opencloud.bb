SUMMARY = "OpenCloud client integration for nemo file manager"
DESCRIPTION = "This package provides a plugin to integrate opencloud client into the nemo \
file manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "nemo-extension-opencloud-1.0.0-1.4.noarch.rpm"
RPM_HASH = "cd75a46713bf2833cc49c12d2c6dfd6b4d8619250143261178f298d42ae550cee51c59fc3e6a628231ab93a309dd0d999fac0964b1f23276970c3322e471c0a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-opencloud"

RDEPENDS:${PN} += "nemo \
opencloud-extensions-resources \
python3-gobject \
python3-nemo"

inherit rpm
