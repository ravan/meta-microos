SUMMARY = "Bluetooth(TM) Firmware"
DESCRIPTION = "Bluetooth(TM) Firmware. Package contains firmware images for some \
   Bluetooth(TM) adapters. Currently supported are: * Broadcom \
   Corporation BCM2033 \
 \
* AVM Computersysteme Vertriebs GmbH BLUEFRITZ! USB \
 \
The BLUETOOTH trademarks are owned by Bluetooth SIG, Inc., USA."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & SUSE-Firmware"

PV = "1.2"

RPM_NAME = "bluez-firmware-1.2-150.10.aarch64.rpm"
RPM_HASH = "1caeec2bffb953fc429f69f01ccc880c0dea731a84b425b6f25ab61a7b59b4270312f8e5eba2ed338698186cc05c46032a65c03eb2d34034278539ae054ab0fc"

RPROVIDES:${PN} += "bluez-firmware \
firmware-BCM2033-FW.bin \
firmware-BCM2033-MD.hex \
firmware-STLC2500-R4-00-03.ptc \
firmware-STLC2500-R4-00-06.ssf \
firmware-STLC2500-R4-02-02-WLAN.ssf \
firmware-STLC2500-R4-02-04.ptc \
firmware-bfubase.frm"

RDEPENDS:${PN} += ""

inherit rpm
