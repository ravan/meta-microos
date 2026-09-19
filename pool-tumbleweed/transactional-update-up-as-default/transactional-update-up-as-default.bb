SUMMARY = "Sets 'up' as default update mechanism for transactional-update"
DESCRIPTION = "In some cases, especially for the update timer, transactional-update has to \
know which update method to use. If the installed system is not using 'dup' \
as the default, then this package should be installed."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.1.3"

RPM_NAME = "transactional-update-up-as-default-6.1.3-1.2.noarch.rpm"
RPM_HASH = "e5cfe7c68f262d93bc32c7f0670fd4a6b4bb6cffd31c6ac1dfe94a0b018d4476ba337e3e54fcd5c12a2ea6c04e3707159fbb6a2741ac4144984747c8cd3fbd9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "transactional-update-up-as-default"

RDEPENDS:${PN} += "transactional-update"

inherit rpm
