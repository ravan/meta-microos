SUMMARY = "Firmware for Technisat SkyStar USB HD"
DESCRIPTION = "This package provides the firmware images that should be automatically loaded \
as needed by the hotplug system."
LICENSE = "SUSE-Firmware"

PV = "17.63"

RPM_NAME = "technisat-usb2-firmware-17.63-7.15.noarch.rpm"
RPM_HASH = "2ffe4396d047286cb0abc42faa33de704f47e7ec061ff97ce749251031f0d96366f2d35adc86c0259271d39c99a42be5e1f9ddcd47130b0cb3bdaa668ced4689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-dvb-usb-SkyStar-USB-HD-FW-v17-63.HEX.fw \
technisat-usb2-firmware"

RDEPENDS:${PN} += ""

inherit rpm
