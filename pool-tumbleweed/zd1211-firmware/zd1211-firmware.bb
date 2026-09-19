SUMMARY = "Firmware for ZD1211 USB WLAN sticks"
DESCRIPTION = "Firmware for USB WLAN sticks based on the ZyDAS ZD1211 chip"
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "zd1211-firmware-1.5-2.15.noarch.rpm"
RPM_HASH = "ca84e065e47a937d244bcaf24ef4b204eccec9a212b6f6cf486538172167f1e9017b879c5a28bff5b39353211d0a5a96488665c590937c42c364c23f48d84aa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-zd1211/zd1211-ub \
firmware-zd1211/zd1211-uph \
firmware-zd1211/zd1211-uphm \
firmware-zd1211/zd1211-uphr \
firmware-zd1211/zd1211-ur \
firmware-zd1211/zd1211b-ub \
firmware-zd1211/zd1211b-uph \
firmware-zd1211/zd1211b-uphm \
firmware-zd1211/zd1211b-uphr \
firmware-zd1211/zd1211b-ur \
zd1211-firmware"

RDEPENDS:${PN} += ""

inherit rpm
