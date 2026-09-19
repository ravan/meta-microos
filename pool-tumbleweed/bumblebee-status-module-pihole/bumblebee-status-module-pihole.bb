SUMMARY = "Displays the pi-hole status"
DESCRIPTION = "Displays the pi-hole status (up/down) \
together with the number of ads that were blocked today."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-pihole-2.1.5-4.7.noarch.rpm"
RPM_HASH = "d4d33f94954a1439159b7bf10495694b87e7405df5b04f0b6a0480b9d0967d099b68c613643ed78c2ee7045135fc7023188e6b7ad2c1dec97b8eb30cc4dea721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-pihole"

RDEPENDS:${PN} += "bumblebee-status"

inherit rpm
