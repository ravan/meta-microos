SUMMARY = "Firmware for the Broadcom/Cypress BCM43xx chipset family"
DESCRIPTION = "This package provides the firmware files needed for the \
Broadcom (now Cypress) BCM43430 Wifi+Bluetooth chipset \
as well as NVRAM config files for BCM43362, BCM43430 and \
further related chipsets."
LICENSE = "SUSE-Firmware"

PV = "20180314"

RPM_NAME = "bcm43xx-firmware-20180314-16.8.noarch.rpm"
RPM_HASH = "ac09b258a2343593285be344aa7c772a0a2e1be0676c9f5f4f9e9a2d1e207aa0339db967f1fbb16c14fbcfd6cff515381cd54425d8f970d9e9a22fc969880736"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "4-compute-module.txt) \
400.txt) \
bcm43xx-firmware \
bpi-m2.txt) \
cubox-i-dl.txt) \
cubox-i-q.txt) \
firmware(brcm/brcmfmac4329-sdio.solidrun \
firmware(brcm/brcmfmac4330-sdio.solidrun \
firmware(brcm/brcmfmac43362-sdio.sinovoip \
firmware(brcm/brcmfmac4339-sdio.tronsmart \
firmware(brcm/brcmfmac43430b0-sdio.raspberrypi \
firmware(brcm/brcmfmac43456-sdio.raspberrypi \
firmware-BCM43430A1.hcd \
firmware-BCM43430B0.hcd \
firmware-BCM4345C0.hcd \
firmware-BCM4345C5.hcd \
firmware-brcm/BCM43430A1.hcd \
firmware-brcm/BCM43430B0.hcd \
firmware-brcm/BCM4345C0.hcd \
firmware-brcm/BCM4345C5.hcd \
firmware-brcm/brcmfmac43430b0-sdio.clm-blob \
firmware-brcm/brcmfmac43436-sdio.bin \
firmware-brcm/brcmfmac43436-sdio.clm-blob \
firmware-brcm/brcmfmac43436-sdio.txt \
firmware-brcm/brcmfmac43456-sdio.bin \
firmware-brcm/brcmfmac43456-sdio.clm-blob \
firmware-brcm/brcmfmac43456-sdio.txt \
firmware-brcm/brcmfmac4356-pcie.txt \
model-zero-2-w.bin) \
model-zero-2-w.txt) \
vega-s95-telos.txt)"

RDEPENDS:${PN} += "kernel-firmware-brcm"

inherit rpm
