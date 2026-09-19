SUMMARY = "Kernel firmware files for various network drivers"
DESCRIPTION = "This package contains kernel firmware files for various network drivers."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware & GPL-2.0-only"

PV = "20260813"

RPM_NAME = "kernel-firmware-network-20260813-1.1.noarch.rpm"
RPM_HASH = "e87026c61edd65ccb85a0c1c07d4b2c3a993105cef7bec4f8d98ddd325eaffd551595ddb09d71fe71116968096ddfa94d9a791d1618b862875339d10d9aa84c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-3com/typhoon.bin \
firmware-adaptec/starfire-rx.bin \
firmware-adaptec/starfire-tx.bin \
firmware-aeonsemi/as21x1x-fw.bin \
firmware-agere-ap-fw.bin \
firmware-agere-sta-fw.bin \
firmware-airoha/EthMD32.DSP.bin \
firmware-airoha/EthMD32.dm.bin \
firmware-airoha/an7583-npu-data.bin \
firmware-airoha/an7583-npu-rv32.bin \
firmware-airoha/an8811hb/EthMD32-CRC.DM.bin \
firmware-airoha/an8811hb/EthMD32-CRC.DSP.bin \
firmware-airoha/en7581-MT7996-npu-data.bin \
firmware-airoha/en7581-MT7996-npu-rv32.bin \
firmware-airoha/en7581-npu-data.bin \
firmware-airoha/en7581-npu-rv32.bin \
firmware-atmel/wilc1000-ap-fw.bin \
firmware-atmel/wilc1000-fw.bin \
firmware-atmel/wilc1000-p2p-fw.bin \
firmware-atmel/wilc1000-wifi-firmware-1.bin \
firmware-atmel/wilc1000-wifi-firmware.bin \
firmware-atmel/wilc3000-wifi-firmware-1.bin \
firmware-e100/d101m-ucode.bin \
firmware-e100/d101s-ucode.bin \
firmware-e100/d102e-ucode.bin \
firmware-intel/ice/ddp-comms/ice-comms-1.3.55.0.pkg \
firmware-intel/ice/ddp-lag/ice-lag-1.3.2.0.pkg \
firmware-intel/ice/ddp-wireless-edge/ice-wireless-edge-1.3.23.0.pkg \
firmware-intel/ice/ddp/ice-1.3.43.0.pkg \
firmware-intel/ice/ddp/ice.pkg \
firmware-morsemicro/mm81x/v56/bcf-aw-hm677.bin \
firmware-morsemicro/mm81x/v56/bcf-boardtype-0804.bin \
firmware-morsemicro/mm81x/v56/bcf-boardtype-0807.bin \
firmware-morsemicro/mm81x/v56/bcf-boardtype-0a02.bin \
firmware-morsemicro/mm81x/v56/bcf-mm8108-mf15457.bin \
firmware-morsemicro/mm81x/v56/mm8108.bin \
firmware-myri10ge-eth-big-z8e.dat \
firmware-myri10ge-eth-z8e.dat \
firmware-myri10ge-ethp-big-z8e.dat \
firmware-myri10ge-ethp-z8e.dat \
firmware-myri10ge-rss-eth-big-z8e.dat \
firmware-myri10ge-rss-eth-z8e.dat \
firmware-myri10ge-rss-ethp-big-z8e.dat \
firmware-myri10ge-rss-ethp-z8e.dat \
firmware-phanfw.bin \
firmware-rt2561.bin \
firmware-rt2561s.bin \
firmware-rt2661.bin \
firmware-sdd-sagrad-1091-1098.bin \
firmware-slicoss/gbdownload.sys \
firmware-slicoss/gbrcvucode.sys \
firmware-slicoss/oasisdbgdownload.sys \
firmware-slicoss/oasisdownload.sys \
firmware-slicoss/oasisrcvucode.sys \
firmware-sxg/saharadbgdownloadB.sys \
firmware-sxg/saharadownloadB.sys \
firmware-tehuti/bdx.bin \
firmware-tigon/tg3-tso.bin \
firmware-tigon/tg3-tso5.bin \
firmware-tigon/tg3.bin \
firmware-tigon/tg357766.bin \
firmware-vxge/X3fw-pxe.ncf \
firmware-vxge/X3fw.ncf \
firmware-wsm-22.bin \
kernel-firmware-network"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
