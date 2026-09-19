SUMMARY = "Remaining Software"
DESCRIPTION = "Packages that are on CD but not in other patterns."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-media-rest_cd_core-20170319-62.1.aarch64.rpm"
RPM_HASH = "b7e9320dcb890c891764e88ff77f7467cab79d0154313fac9b64cd96de7e4e6539f01c9f89dfac51f7dc02c4ed528604b4e6e381a2b4b408483c6e2295fb7046"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-media-rest-cd-core"

RDEPENDS:${PN} += "kernel-default \
kernel-firmware-amdgpu \
kernel-firmware-ath10k \
kernel-firmware-ath11k \
kernel-firmware-ath12k \
kernel-firmware-atheros \
kernel-firmware-bluetooth \
kernel-firmware-bnx2 \
kernel-firmware-brcm \
kernel-firmware-chelsio \
kernel-firmware-dpaa2 \
kernel-firmware-i915 \
kernel-firmware-intel \
kernel-firmware-iwlwifi \
kernel-firmware-liquidio \
kernel-firmware-marvell \
kernel-firmware-media \
kernel-firmware-mediatek \
kernel-firmware-mwifiex \
kernel-firmware-network \
kernel-firmware-nfp \
kernel-firmware-nvidia \
kernel-firmware-platform \
kernel-firmware-qcom \
kernel-firmware-qlogic \
kernel-firmware-radeon \
kernel-firmware-realtek \
kernel-firmware-serial \
kernel-firmware-sound \
kernel-firmware-ti \
kernel-firmware-ueagle \
kernel-firmware-usb-network \
pattern- \
yast2-bootloader \
yast2-country \
yast2-hardware-detection \
yast2-network \
yast2-proxy \
yast2-qt-branding-openSUSE \
yast2-storage-ng \
yast2-trans-stats \
yast2-x11"

inherit rpm
