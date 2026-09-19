SUMMARY = "Kernel firmware files for Atheros QCA988x WiFi drivers"
DESCRIPTION = "This package contains kernel firmware files for Atheros QCA988x WiFi drivers."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware"

PV = "20260809"

RPM_NAME = "kernel-firmware-ath10k-20260809-1.1.noarch.rpm"
RPM_HASH = "5e7060bcd0ede2b5d61cf45e06e4928186bbf0224eae137c32b2729c7e7062b8efb0adc4d41e1d3acaf3ad469d1e68c683b9239e5efc1ae37f94afa18a4f7ef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-ath10k/QCA4019/hw1.0/board-2.bin \
firmware-ath10k/QCA4019/hw1.0/firmware-5.bin \
firmware-ath10k/QCA6174/hw2.1/board-2.bin \
firmware-ath10k/QCA6174/hw2.1/board.bin \
firmware-ath10k/QCA6174/hw2.1/firmware-5.bin \
firmware-ath10k/QCA6174/hw3.0/board-2.bin \
firmware-ath10k/QCA6174/hw3.0/board.bin \
firmware-ath10k/QCA6174/hw3.0/firmware-4.bin \
firmware-ath10k/QCA6174/hw3.0/firmware-6.bin \
firmware-ath10k/QCA6174/hw3.0/firmware-sdio-6.bin \
firmware-ath10k/QCA9377/hw1.0/board-2.bin \
firmware-ath10k/QCA9377/hw1.0/board.bin \
firmware-ath10k/QCA9377/hw1.0/firmware-5.bin \
firmware-ath10k/QCA9377/hw1.0/firmware-6.bin \
firmware-ath10k/QCA9377/hw1.0/firmware-sdio-5.bin \
firmware-ath10k/QCA9887/hw1.0/board.bin \
firmware-ath10k/QCA9887/hw1.0/firmware-5.bin \
firmware-ath10k/QCA9888/hw2.0/board-2.bin \
firmware-ath10k/QCA9888/hw2.0/firmware-5.bin \
firmware-ath10k/QCA988X/hw2.0/board.bin \
firmware-ath10k/QCA988X/hw2.0/firmware-4.bin \
firmware-ath10k/QCA988X/hw2.0/firmware-5.bin \
firmware-ath10k/QCA9984/hw1.0/board-2.bin \
firmware-ath10k/QCA9984/hw1.0/firmware-5.bin \
firmware-ath10k/QCA99X0/hw2.0/board-2.bin \
firmware-ath10k/QCA99X0/hw2.0/firmware-5.bin \
firmware-ath10k/WCN3990/hw1.0/board-2.bin \
firmware-ath10k/WCN3990/hw1.0/firmware-5.bin \
firmware-ath10k/WCN3990/hw1.0/qcm2290/firmware-5.bin \
firmware-ath10k/WCN3990/hw1.0/qcm2290/wlanmdsp.mbn \
firmware-ath10k/WCN3990/hw1.0/qrb4210/firmware-5.bin \
firmware-ath10k/WCN3990/hw1.0/qrb4210/wlanmdsp.mbn \
firmware-ath10k/WCN3990/hw1.0/wlanmdsp.mbn \
firmware-qcom/qcm2290/wlanmdsp.mbn \
firmware-qcom/qrb4210/wlanmdsp.mbn \
firmware-qcom/sdm845/wlanmdsp.mbn \
kernel-firmware-ath10k"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
