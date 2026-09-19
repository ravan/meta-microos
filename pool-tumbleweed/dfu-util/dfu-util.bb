SUMMARY = "DFU firmware upgrade utility"
DESCRIPTION = "This is a host side implementation of the DFU 1.0 and DFU 1.1 specifications of \
the USB forum. DFU is intended to download and upload firmware to/from devices \
connected over USB. It ranges from small devices like micro-controller boards \
to mobile phones."
LICENSE = "GPL-2.0-only"

PV = "0.11"

RPM_NAME = "dfu-util-0.11-2.13.aarch64.rpm"
RPM_HASH = "d5a3514ed76e8d4939d8ce79bda558327be22c9a37780e6e41e7b5fb4da2b08fe04811c1da9fdf042bbcfa21ace37898c0f1d4e9c4224fa99f60d3a22db790c1"

RPROVIDES:${PN} += "dfu-util"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
