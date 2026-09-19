SUMMARY = "Firmware for Intel PRO/Wireless WLAN Cards"
DESCRIPTION = "This package contains firmware binaries needed for Intel PRO/Wireless \
2100/2200BG (aka Centrino) WLAN cards. The package is covered by the \
Intel license. See http://ipw2100.sourceforge.net/firmware.php?fid=4."
LICENSE = "SUSE-Firmware"

PV = "9"

RPM_NAME = "ipw-firmware-9-24.3.noarch.rpm"
RPM_HASH = "9731079b1751799babca41d1b3044696508c9c65b5350381573eb4d1f714e3bc6c15f5b25f66efc60f13a607d82aed62e7c9dda9de5e9e6ba7dd6a6a1a548267"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-ipw-2.2-boot.fw \
firmware-ipw-2.2-bss-ucode.fw \
firmware-ipw-2.2-bss.fw \
firmware-ipw-2.2-ibss-ucode.fw \
firmware-ipw-2.2-ibss.fw \
firmware-ipw-2.3-boot.fw \
firmware-ipw-2.3-bss-ucode.fw \
firmware-ipw-2.3-bss.fw \
firmware-ipw-2.3-ibss-ucode.fw \
firmware-ipw-2.3-ibss.fw \
firmware-ipw-2.3-sniffer-ucode.fw \
firmware-ipw-2.3-sniffer.fw \
firmware-ipw-2.4-boot.fw \
firmware-ipw-2.4-bss-ucode.fw \
firmware-ipw-2.4-bss.fw \
firmware-ipw-2.4-ibss-ucode.fw \
firmware-ipw-2.4-ibss.fw \
firmware-ipw-2.4-sniffer-ucode.fw \
firmware-ipw-2.4-sniffer.fw \
firmware-ipw2100-1.3-i.fw \
firmware-ipw2100-1.3-p.fw \
firmware-ipw2100-1.3.fw \
firmware-ipw2200-bss.fw \
firmware-ipw2200-ibss.fw \
firmware-ipw2200-sniffer.fw \
ipw-firmware"

RDEPENDS:${PN} += "/usr/bin/sh \
grep \
modutils"

inherit rpm
