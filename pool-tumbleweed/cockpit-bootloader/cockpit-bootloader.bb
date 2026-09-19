SUMMARY = "Cockpit module for editing bootloader settings"
DESCRIPTION = "Cockpit module for editing bootloader settings"
LICENSE = "LGPL-2.1-or-later"

PV = "1"

RPM_NAME = "cockpit-bootloader-1-1.2.noarch.rpm"
RPM_HASH = "e18fe0db6f42d58b8a2b03ae2e001704436a835d042d4d2847e4da239b57bf9022d6ab267f48e8cf9048046894fa58f74881247505aabc046ea993325d1183a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-bootloader"

RDEPENDS:${PN} += "bootkitd \
cockpit-bridge"

inherit rpm
