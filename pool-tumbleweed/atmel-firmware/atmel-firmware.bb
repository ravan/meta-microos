SUMMARY = "Firmware for Atmel at76c50x Wireless Network Chips"
DESCRIPTION = "The drivers for Atmel at76c50x wireless network chips in the Linux 2.6.x kernel \
and at http://at76c503a.berlios.de/ do not include the firmware and this \
firmware needs to be loaded by the host on most cards using these chips. \
 \
This package provides the firmware images that should be automatically loaded \
as needed by the hotplug system. It also provides a small loader utility that \
can be used to accomplish the same thing when hotplug is not in use."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware"

PV = "1.3"

RPM_NAME = "atmel-firmware-1.3-166.15.noarch.rpm"
RPM_HASH = "0032313d5a5654dc1114c65d15204e65cb84ff9f0a175287f115488dcece1f4bfe5e3026fa19dd3f4436081427bdb4da3071587bb02101f7dad1c7f6a50a9152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atmel-firmware \
firmware-atmel-at76c502-3com-wpa.bin \
firmware-atmel-at76c502-3com.bin \
firmware-atmel-at76c502-wpa.bin \
firmware-atmel-at76c502.bin \
firmware-atmel-at76c502d-wpa.bin \
firmware-atmel-at76c502d.bin \
firmware-atmel-at76c502e-wpa.bin \
firmware-atmel-at76c502e.bin \
firmware-atmel-at76c503-i3861.bin \
firmware-atmel-at76c503-i3863.bin \
firmware-atmel-at76c503-rfmd-0.90.2-140.bin \
firmware-atmel-at76c503-rfmd-acc.bin \
firmware-atmel-at76c503-rfmd.bin \
firmware-atmel-at76c504-2958-wpa.bin \
firmware-atmel-at76c504.bin \
firmware-atmel-at76c504a-2958-wpa.bin \
firmware-atmel-at76c504c-wpa.bin \
firmware-atmel-at76c505-rfmd.bin \
firmware-atmel-at76c505-rfmd2958.bin \
firmware-atmel-at76c505a-rfmd2958.bin \
firmware-atmel-at76c506-wpa.bin \
firmware-atmel-at76c506.bin"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
