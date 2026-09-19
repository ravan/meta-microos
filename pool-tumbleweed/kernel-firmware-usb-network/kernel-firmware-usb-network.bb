SUMMARY = "Kernel firmware files for various USB WiFi / Ethernet drivers"
DESCRIPTION = "This package contains kernel firmware files for various USB WiFi / Ethernet drivers."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware"

PV = "20260610"

RPM_NAME = "kernel-firmware-usb-network-20260610-1.2.noarch.rpm"
RPM_HASH = "3f3f69fe2c7f90cf4036f477f0d8f06b81996320cb4cdca13460b28586af27e6bd812f29c65be8860b6de0a76f815f97df88fda3dc21b7498914d69ba6f6ea36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-atusb/atusb-0.2.dfu \
firmware-atusb/atusb-0.3.dfu \
firmware-atusb/rzusb-0.3.bin \
firmware-kaweth/new-code-fix.bin \
firmware-kaweth/new-code.bin \
firmware-kaweth/trigger-code-fix.bin \
firmware-kaweth/trigger-code.bin \
firmware-rsi-91x.fw \
firmware-rsi/rs9113-ap-bt-dual-mode.rps \
firmware-rsi/rs9113-wlan-bt-dual-mode.rps \
firmware-rsi/rs9113-wlan-qspi.rps \
firmware-rsi/rs9116-wlan-bt-classic.rps \
firmware-rsi/rs9116-wlan.rps \
firmware-rt73.bin \
firmware-vntwusb.fw \
kernel-firmware-usb-network"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
