SUMMARY = "Libcloudproviders integration for nextcloud-desktop"
DESCRIPTION = "This package provides libcloudproviders integration for the \
nextcloud desktop client."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "34.0.3"

RPM_NAME = "cloudproviders-extension-nextcloud-34.0.3-1.1.noarch.rpm"
RPM_HASH = "374245ff65aa2c5a8661128e1021e6414e658f2df57f694eaf4b6ec313a28a7950a47aac0feda742ec65b507fcab4f6ca199630b7e43400e1134515629bfc9d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cloudproviders-extension-nextcloud"

RDEPENDS:${PN} += "nextcloud-desktop"

inherit rpm
