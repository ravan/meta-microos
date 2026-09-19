SUMMARY = "Kernel firmware files for Mediatek network drivers"
DESCRIPTION = "This package contains kernel firmware files for Mediatek network drivers."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware"

PV = "20260825"

RPM_NAME = "kernel-firmware-mediatek-20260825-1.1.noarch.rpm"
RPM_HASH = "44555226c6deb8ec6ad991392d652af01c2846e3abc827a151902dd6174b4a212c1ccf7862b9f870ccbc5d2b12fcd530b783376d8ed2bcf10666683dcd2a34b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-mediatek/BT-RAM-CODE-MT7902-1-1-hdr.bin \
firmware-mediatek/BT-RAM-CODE-MT7922-1-1-hdr.bin \
firmware-mediatek/BT-RAM-CODE-MT7961-1-2-hdr.bin \
firmware-mediatek/BT-RAM-CODE-MT7961-1a-2-hdr.bin \
firmware-mediatek/WIFI-MT7902-patch-mcu-1-1-hdr.bin \
firmware-mediatek/WIFI-MT7922-patch-mcu-1-1-hdr.bin \
firmware-mediatek/WIFI-MT7961-patch-mcu-1-2-hdr.bin \
firmware-mediatek/WIFI-MT7961-patch-mcu-1a-2-hdr.bin \
firmware-mediatek/WIFI-RAM-CODE-MT7902-1.bin \
firmware-mediatek/WIFI-RAM-CODE-MT7922-1.bin \
firmware-mediatek/WIFI-RAM-CODE-MT7961-1.bin \
firmware-mediatek/WIFI-RAM-CODE-MT7961-1a.bin \
firmware-mediatek/mt7601u.bin \
firmware-mediatek/mt7610e.bin \
firmware-mediatek/mt7610u.bin \
firmware-mediatek/mt7615-cr4.bin \
firmware-mediatek/mt7615-n9.bin \
firmware-mediatek/mt7615-rom-patch.bin \
firmware-mediatek/mt7622-n9.bin \
firmware-mediatek/mt7622-rom-patch.bin \
firmware-mediatek/mt7622pr2h.bin \
firmware-mediatek/mt7650.bin \
firmware-mediatek/mt7650e.bin \
firmware-mediatek/mt7662-rom-patch.bin \
firmware-mediatek/mt7662.bin \
firmware-mediatek/mt7662u-rom-patch.bin \
firmware-mediatek/mt7662u.bin \
firmware-mediatek/mt7663-n9-rebb.bin \
firmware-mediatek/mt7663-n9-v3.bin \
firmware-mediatek/mt7663pr2h-rebb.bin \
firmware-mediatek/mt7663pr2h.bin \
firmware-mediatek/mt7668pr2h.bin \
firmware-mediatek/mt7915-eeprom-dbdc.bin \
firmware-mediatek/mt7915-eeprom.bin \
firmware-mediatek/mt7915-rom-patch.bin \
firmware-mediatek/mt7915-wa.bin \
firmware-mediatek/mt7915-wm.bin \
firmware-mediatek/mt7916-eeprom.bin \
firmware-mediatek/mt7916-rom-patch.bin \
firmware-mediatek/mt7916-wa.bin \
firmware-mediatek/mt7916-wm.bin \
firmware-mediatek/mt7925/BT-RAM-CODE-MT7925-1-1-hdr.bin \
firmware-mediatek/mt7925/WIFI-MT7925-PATCH-MCU-1-1-hdr.bin \
firmware-mediatek/mt7925/WIFI-RAM-CODE-MT7925-1-1.bin \
firmware-mediatek/mt7927/WIFI-MT6639-PATCH-MCU-2-1-hdr.bin \
firmware-mediatek/mt7927/WIFI-RAM-CODE-MT6639-2-1.bin \
firmware-mediatek/mt7981-eeprom-mt7976-dbdc.bin \
firmware-mediatek/mt7981-rom-patch.bin \
firmware-mediatek/mt7981-wa.bin \
firmware-mediatek/mt7981-wm.bin \
firmware-mediatek/mt7981-wo.bin \
firmware-mediatek/mt7986-eeprom-mt7975-dual.bin \
firmware-mediatek/mt7986-eeprom-mt7976-dbdc.bin \
firmware-mediatek/mt7986-eeprom-mt7976-dual.bin \
firmware-mediatek/mt7986-eeprom-mt7976.bin \
firmware-mediatek/mt7986-rom-patch-mt7975.bin \
firmware-mediatek/mt7986-rom-patch.bin \
firmware-mediatek/mt7986-wa.bin \
firmware-mediatek/mt7986-wm-mt7975.bin \
firmware-mediatek/mt7986-wm.bin \
firmware-mediatek/mt7986-wo-0.bin \
firmware-mediatek/mt7986-wo-1.bin \
firmware-mediatek/mt7987/i2p5ge-phy-DSPBitTb.bin \
firmware-mediatek/mt7987/i2p5ge-phy-pmb.bin \
firmware-mediatek/mt7988/i2p5ge-phy-pmb.bin \
firmware-mediatek/mt7988/mt7988-wo-0.bin \
firmware-mediatek/mt7988/mt7988-wo-1.bin \
firmware-mediatek/mt7996/mt7990-eeprom-2i5i.bin \
firmware-mediatek/mt7996/mt7990-eeprom.bin \
firmware-mediatek/mt7996/mt7990-rom-patch.bin \
firmware-mediatek/mt7996/mt7990-wm-tm.bin \
firmware-mediatek/mt7996/mt7990-wm.bin \
firmware-mediatek/mt7996/mt7992-dsp-23.bin \
firmware-mediatek/mt7996/mt7992-dsp.bin \
firmware-mediatek/mt7996/mt7992-eeprom-23-2i5i.bin \
firmware-mediatek/mt7996/mt7992-eeprom-23.bin \
firmware-mediatek/mt7996/mt7992-eeprom-2i5e.bin \
firmware-mediatek/mt7996/mt7992-eeprom-2i5i.bin \
firmware-mediatek/mt7996/mt7992-eeprom.bin \
firmware-mediatek/mt7996/mt7992-rom-patch-23.bin \
firmware-mediatek/mt7996/mt7992-rom-patch.bin \
firmware-mediatek/mt7996/mt7992-wa-23.bin \
firmware-mediatek/mt7996/mt7992-wa.bin \
firmware-mediatek/mt7996/mt7992-wm-23.bin \
firmware-mediatek/mt7996/mt7992-wm-tm-23.bin \
firmware-mediatek/mt7996/mt7992-wm-tm.bin \
firmware-mediatek/mt7996/mt7992-wm.bin \
firmware-mediatek/mt7996/mt7996-dsp.bin \
firmware-mediatek/mt7996/mt7996-eeprom-233-2i5i6i.bin \
firmware-mediatek/mt7996/mt7996-eeprom-233.bin \
firmware-mediatek/mt7996/mt7996-eeprom-2i5i6i.bin \
firmware-mediatek/mt7996/mt7996-eeprom.bin \
firmware-mediatek/mt7996/mt7996-rom-patch-233.bin \
firmware-mediatek/mt7996/mt7996-rom-patch.bin \
firmware-mediatek/mt7996/mt7996-wa-233.bin \
firmware-mediatek/mt7996/mt7996-wa.bin \
firmware-mediatek/mt7996/mt7996-wm-233.bin \
firmware-mediatek/mt7996/mt7996-wm-tm-233.bin \
firmware-mediatek/mt7996/mt7996-wm-tm.bin \
firmware-mediatek/mt7996/mt7996-wm.bin \
firmware-mediatek/mt8183/scp.img \
firmware-mediatek/mt8186/scp.img \
firmware-mediatek/mt8188/scp-c0.img \
firmware-mediatek/mt8188/scp.img \
firmware-mediatek/mt8189/scp.img \
firmware-mediatek/mt8192/scp.img \
firmware-mediatek/mt8195/scp.img \
firmware-mediatek/mt8196/vcp.img \
firmware-mt7601u.bin \
firmware-mt7650.bin \
firmware-mt7662-rom-patch.bin \
firmware-mt7662.bin \
kernel-firmware-mediatek \
ralink-firmware"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
