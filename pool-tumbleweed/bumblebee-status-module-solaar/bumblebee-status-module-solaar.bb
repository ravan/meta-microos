SUMMARY = "Displays of Logitech's unifying device"
DESCRIPTION = "Displays status and load percentage of Logitech's unifying device."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-solaar-2.1.5-4.7.noarch.rpm"
RPM_HASH = "40a45dab8be2417bfba05d863e6724c61bd9c2114d156d237545d705bdcb36cc3d1d1ecc9ce05160c0c072968d7a48ae3f363705a6f7e3a5c1a66c9ce31f2671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-solaar"

RDEPENDS:${PN} += "bumblebee-status \
solaar"

inherit rpm
