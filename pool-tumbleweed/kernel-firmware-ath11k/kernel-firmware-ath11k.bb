SUMMARY = "Kernel firmware files for Atheros Qualcomm WiFi drivers"
DESCRIPTION = "This package contains kernel firmware files for Atheros Qualcomm WiFi drivers."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware"

PV = "20260610"

RPM_NAME = "kernel-firmware-ath11k-20260610-1.2.noarch.rpm"
RPM_HASH = "4ce1413eeb3b77678b9b6ac0b2ff57ed1af4a21469f28a1c8782ee34da02c1c11a8e21e6aa44009240970084cbcc539bdf3a6d48bc40a39d25ac1961b2d19a7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-ath11k/IPQ5018/hw1.0/board-2.bin \
firmware-ath11k/IPQ5018/hw1.0/m3-fw.b00 \
firmware-ath11k/IPQ5018/hw1.0/m3-fw.b01 \
firmware-ath11k/IPQ5018/hw1.0/m3-fw.b02 \
firmware-ath11k/IPQ5018/hw1.0/m3-fw.flist \
firmware-ath11k/IPQ5018/hw1.0/m3-fw.mdt \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b00 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b01 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b02 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b03 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b04 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b05 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b07 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b08 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b09 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b10 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b11 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b13 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b14 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.flist \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.mdt \
firmware-ath11k/IPQ6018/hw1.0/board-2.bin \
firmware-ath11k/IPQ6018/hw1.0/m3-fw.b00 \
firmware-ath11k/IPQ6018/hw1.0/m3-fw.b01 \
firmware-ath11k/IPQ6018/hw1.0/m3-fw.b02 \
firmware-ath11k/IPQ6018/hw1.0/m3-fw.flist \
firmware-ath11k/IPQ6018/hw1.0/m3-fw.mdt \
firmware-ath11k/IPQ6018/hw1.0/q6-fw.b00 \
firmware-ath11k/IPQ6018/hw1.0/q6-fw.b01 \
firmware-ath11k/IPQ6018/hw1.0/q6-fw.b02 \
firmware-ath11k/IPQ6018/hw1.0/q6-fw.b03 \
firmware-ath11k/IPQ6018/hw1.0/q6-fw.b04 \
firmware-ath11k/IPQ6018/hw1.0/q6-fw.b05 \
firmware-ath11k/IPQ6018/hw1.0/q6-fw.b07 \
firmware-ath11k/IPQ6018/hw1.0/q6-fw.b08 \
firmware-ath11k/IPQ6018/hw1.0/q6-fw.flist \
firmware-ath11k/IPQ6018/hw1.0/q6-fw.mdt \
firmware-ath11k/IPQ8074/hw2.0/board-2.bin \
firmware-ath11k/IPQ8074/hw2.0/m3-fw.b00 \
firmware-ath11k/IPQ8074/hw2.0/m3-fw.b01 \
firmware-ath11k/IPQ8074/hw2.0/m3-fw.b02 \
firmware-ath11k/IPQ8074/hw2.0/m3-fw.flist \
firmware-ath11k/IPQ8074/hw2.0/m3-fw.mdt \
firmware-ath11k/IPQ8074/hw2.0/q6-fw.b00 \
firmware-ath11k/IPQ8074/hw2.0/q6-fw.b01 \
firmware-ath11k/IPQ8074/hw2.0/q6-fw.b02 \
firmware-ath11k/IPQ8074/hw2.0/q6-fw.b03 \
firmware-ath11k/IPQ8074/hw2.0/q6-fw.b04 \
firmware-ath11k/IPQ8074/hw2.0/q6-fw.b05 \
firmware-ath11k/IPQ8074/hw2.0/q6-fw.b07 \
firmware-ath11k/IPQ8074/hw2.0/q6-fw.b08 \
firmware-ath11k/IPQ8074/hw2.0/q6-fw.flist \
firmware-ath11k/IPQ8074/hw2.0/q6-fw.mdt \
firmware-ath11k/QCA2066/hw2.1/amss.bin \
firmware-ath11k/QCA2066/hw2.1/board-2.bin \
firmware-ath11k/QCA2066/hw2.1/m3.bin \
firmware-ath11k/QCA6390/hw2.0/amss.bin \
firmware-ath11k/QCA6390/hw2.0/board-2.bin \
firmware-ath11k/QCA6390/hw2.0/m3.bin \
firmware-ath11k/QCA6698AQ/hw2.1/amss.bin \
firmware-ath11k/QCA6698AQ/hw2.1/board-2.bin \
firmware-ath11k/QCA6698AQ/hw2.1/m3.bin \
firmware-ath11k/QCN9074/hw1.0/amss.bin \
firmware-ath11k/QCN9074/hw1.0/board-2.bin \
firmware-ath11k/QCN9074/hw1.0/m3.bin \
firmware-ath11k/WCN6750/hw1.0/board-2.bin \
firmware-ath11k/WCN6750/hw1.0/qcm6490/wpss.mbn \
firmware-ath11k/WCN6750/hw1.0/sc7280/wpss.mbn \
firmware-ath11k/WCN6750/hw1.0/wpss.mdt \
firmware-ath11k/WCN6855/hw2.0/amss.bin \
firmware-ath11k/WCN6855/hw2.0/board-2.bin \
firmware-ath11k/WCN6855/hw2.0/m3.bin \
firmware-ath11k/WCN6855/hw2.0/nfa765/amss.bin \
firmware-ath11k/WCN6855/hw2.0/nfa765/m3.bin \
firmware-ath11k/WCN6855/hw2.0/regdb.bin \
firmware-ath11k/WCN6855/hw2.1/amss.bin \
firmware-ath11k/WCN6855/hw2.1/board-2.bin \
firmware-ath11k/WCN6855/hw2.1/m3.bin \
firmware-ath11k/WCN6855/hw2.1/nfa765/amss.bin \
firmware-ath11k/WCN6855/hw2.1/nfa765/m3.bin \
firmware-ath11k/WCN6855/hw2.1/regdb.bin \
firmware-qcom/qcm6490/wpss.mbn \
firmware-qcom/qcs6490/wpss.mbn \
kernel-firmware-ath11k"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
