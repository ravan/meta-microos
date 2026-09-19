SUMMARY = "download broadcom firmware files"
DESCRIPTION = "automatically download broadcom firmware files needed for bcm43xx WLAN chips"
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "pullin-bcm43xx-firmware-1.0-4.17.noarch.rpm"
RPM_HASH = "ea447f21a04e787e0a87abb03534ebb02616b4f36fd49629a003c903a4dd3bf9ceca70d908a4819522221bad10366098dda2dea3a93060d0355e97ba31ed672d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pullin-bcm43xx-firmware"

RDEPENDS:${PN} += "/usr/bin/sh \
b43-fwcutter \
pciutils"

inherit rpm
