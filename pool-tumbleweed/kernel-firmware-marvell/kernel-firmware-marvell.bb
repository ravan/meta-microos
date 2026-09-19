SUMMARY = "Kernel firmware files for Marvell network drivers"
DESCRIPTION = "This package contains kernel firmware files for Marvell network drivers."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware"

PV = "20260610"

RPM_NAME = "kernel-firmware-marvell-20260610-1.2.noarch.rpm"
RPM_HASH = "bfba5b250d1997d932832f6f1469b55a26a2d96abc17ecf49a5851450811f9c7df3a2d59fff2308323ad05ad00868e1ea0fae2d4ec466d28453e4c50a2cca2bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-lbtf-usb.bin \
firmware-libertas/cf8381-helper.bin \
firmware-libertas/cf8381.bin \
firmware-libertas/cf8385-helper.bin \
firmware-libertas/cf8385.bin \
firmware-libertas/gspi8682-helper.bin \
firmware-libertas/gspi8682.bin \
firmware-libertas/gspi8686-v9-helper.bin \
firmware-libertas/gspi8686-v9.bin \
firmware-libertas/gspi8688-helper.bin \
firmware-libertas/gspi8688.bin \
firmware-libertas/lbtf-sdio.bin \
firmware-libertas/sd8385-helper.bin \
firmware-libertas/sd8385.bin \
firmware-libertas/sd8682-helper.bin \
firmware-libertas/sd8682.bin \
firmware-libertas/sd8686-v8-helper.bin \
firmware-libertas/sd8686-v8.bin \
firmware-libertas/sd8686-v9-helper.bin \
firmware-libertas/sd8686-v9.bin \
firmware-libertas/sd8688-helper.bin \
firmware-libertas/sd8688.bin \
firmware-libertas/usb8388-olpc.bin \
firmware-libertas/usb8388-v5.bin \
firmware-libertas/usb8388-v9.bin \
firmware-libertas/usb8682.bin \
firmware-mrvl/sd8688-helper.bin \
firmware-mrvl/sd8688.bin \
firmware-mwl8k/fmimage-8366-ap-1.fw \
firmware-mwl8k/fmimage-8366-ap-2.fw \
firmware-mwl8k/fmimage-8366-ap-3.fw \
firmware-mwl8k/fmimage-8366.fw \
firmware-mwl8k/fmimage-8687.fw \
firmware-mwl8k/fmimage-8764-ap-1.fw \
firmware-mwl8k/helper-8366.fw \
firmware-mwl8k/helper-8687.fw \
firmware-mwlwifi/88W8864.bin \
firmware-mwlwifi/88W8897.bin \
kernel-firmware-marvell"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
