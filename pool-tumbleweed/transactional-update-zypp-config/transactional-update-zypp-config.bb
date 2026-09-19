SUMMARY = "Zypper rule to prevent uninstallation of transactional-update"
DESCRIPTION = "Adds a zypper rule to prevent accidental uninstallation of \
transactional-update."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.1.3"

RPM_NAME = "transactional-update-zypp-config-6.1.3-1.2.noarch.rpm"
RPM_HASH = "03390156dd192046a02bd9f8dfb4dc7c59385a2ddc358bb8c08f1fc123be0666f1a64edf5845671127ef9b186d46cb4d718a4f91fa00567e7f654d630c6db2c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-transactional-update-zypp-config \
transactional-update-zypp-config"

RDEPENDS:${PN} += "transactional-update"

inherit rpm
