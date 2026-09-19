SUMMARY = "Compatibility metapackage for kernel firmware files"
DESCRIPTION = "This package is a catch-all compatibility metapackage for providing \
all files that have been provided by kernel-firmware package."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20250206"

RPM_NAME = "kernel-firmware-all-20250206-1.5.noarch.rpm"
RPM_HASH = "77cf46524918e31b4216dbf3c2a21e7ba7e1f4039bfe178b23c40a78da9abb7ded1a0b092c35a876ab2a74a21165f925f2d776542fd38fba33ee3c07aa6c893e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compat-wireless-firmware \
kernel-firmware \
kernel-firmware-all"

RDEPENDS:${PN} += "kernel-firmware-amdgpu \
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
kernel-firmware-mellanox \
kernel-firmware-mwifiex \
kernel-firmware-network \
kernel-firmware-nfp \
kernel-firmware-nvidia \
kernel-firmware-platform \
kernel-firmware-prestera \
kernel-firmware-qcom \
kernel-firmware-qlogic \
kernel-firmware-radeon \
kernel-firmware-realtek \
kernel-firmware-serial \
kernel-firmware-sound \
kernel-firmware-ti \
kernel-firmware-ueagle \
kernel-firmware-usb-network"

inherit rpm
