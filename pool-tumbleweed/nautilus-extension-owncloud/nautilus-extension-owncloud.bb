SUMMARY = "Owncloud client integration for nautilus, the GNOME file manager"
DESCRIPTION = "This package provides a plugin to integrate owncloud client into the nautilus \
file manager."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.0"

RPM_NAME = "nautilus-extension-owncloud-6.1.0-1.2.noarch.rpm"
RPM_HASH = "5f0ec6fdbcb1cf0ea52253cd7d47a53e2ab399f9635886bdf0315ecc8f9f0b67fd270639c5466780f2c2958f6f942d14faec4536f8dba67cdac265eb4aabfa9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nautilus-extension-owncloud"

RDEPENDS:${PN} += "nautilus \
owncloud-client \
python3-gobject \
python3-nautilus"

inherit rpm
