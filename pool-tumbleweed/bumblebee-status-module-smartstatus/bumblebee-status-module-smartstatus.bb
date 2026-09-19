SUMMARY = "Displays HDD smart status"
DESCRIPTION = "Displays HDD smart status of different drives or all drives."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-smartstatus-2.1.5-4.7.noarch.rpm"
RPM_HASH = "55958a1413f96b245518bfe16057ad69c37a2efc8bfa35cc96045e407914b8aaf2d5e6b912384e6203cfcca9f9dc7aa25cf7fe15255f6a5bc5243e393ad71ef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-smartstatus"

RDEPENDS:${PN} += "bumblebee-status \
smartmontools"

inherit rpm
