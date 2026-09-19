SUMMARY = "Kernel firmware files for Atheros Qualcomm WiFi 7 chipset drivers"
DESCRIPTION = "This package contains kernel firmware files for Atheros Qualcomm WiFi 7 chipset drivers."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware"

PV = "20260813"

RPM_NAME = "kernel-firmware-ath12k-20260813-1.1.noarch.rpm"
RPM_HASH = "4b56fc7da437caa5a1e00d5f467c89bea6a173a8309682b4762ca0cb7ca0f75b5fe928fd4f503f791e180fae55d660f5d7590b7ffc177d4bd9a4a52d0d12514e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-ath12k/IPQ5424/hw1.0/board-2.bin \
firmware-ath12k/IPQ5424/hw1.0/iu-fw.mbn \
firmware-ath12k/IPQ5424/hw1.0/q6-fw0.mbn \
firmware-ath12k/IPQ5424/hw1.0/q6-fw1.mbn \
firmware-ath12k/IPQ5424/hw1.0/qdsp6sw-dtb.mbn \
firmware-ath12k/QCC2072/hw1.0/board-2.bin \
firmware-ath12k/QCC2072/hw1.0/firmware-2.bin \
firmware-ath12k/QCN9274/hw2.0/board-2.bin \
firmware-ath12k/QCN9274/hw2.0/firmware-2.bin \
firmware-ath12k/WCN7850/hw2.0/amss.bin \
firmware-ath12k/WCN7850/hw2.0/board-2.bin \
firmware-ath12k/WCN7850/hw2.0/m3.bin \
firmware-ath12k/WCN7850/hw2.0/ncm865/amss.bin \
firmware-ath12k/WCN7850/hw2.0/ncm865/m3.bin \
kernel-firmware-ath12k"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
