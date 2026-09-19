SUMMARY = "Displays the brightness of a display"
DESCRIPTION = "Displays the brightness of a display."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-brightness-2.1.5-4.7.noarch.rpm"
RPM_HASH = "a247161fb7aee8666d2db2c5bc3fd85a427ac4d978c5ba416394f2615949e6a07dbfaae02afd5f5bfe1184194845d69338f0980afd81d710677b4c7723c649ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-brightness"

RDEPENDS:${PN} += "bumblebee-status"

inherit rpm
