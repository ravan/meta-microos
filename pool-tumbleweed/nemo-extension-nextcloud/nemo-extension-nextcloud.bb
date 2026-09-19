SUMMARY = "Nemo overlay icons"
DESCRIPTION = "This package provides overlay icons to visualise the \
synchronisation state in the Nemo file manager."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "34.0.3"

RPM_NAME = "nemo-extension-nextcloud-34.0.3-1.1.noarch.rpm"
RPM_HASH = "f66faa55b9ef146070d1138ea4489d7c175e9e226ea3ec6e7feaba4554b585ab3792678a26134f168f62f2d760f4b7f0a2f1a6b53ef30e59743f4ca0e5f5f798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-nextcloud"

RDEPENDS:${PN} += "nemo \
nextcloud-desktop \
python-nemo \
typelib-GObject \
typelib-Nemo"

inherit rpm
