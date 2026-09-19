SUMMARY = "OpenCloud client integration for nautilus, the GNOME file manager"
DESCRIPTION = "This package provides a plugin to integrate opencloud client into the nautilus \
file manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "nautilus-extension-opencloud-1.0.0-1.4.noarch.rpm"
RPM_HASH = "9bc96466e8b477caefc734f40ccd94eb3326fbebda6126df7cfd78def0110c7dbf143a465ea23d73b407bbf46acc9034457cd3d78926844fb293e637f1496038"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nautilus-extension-opencloud"

RDEPENDS:${PN} += "nautilus \
opencloud-extensions-resources \
python3-gobject \
python3-nautilus"

inherit rpm
