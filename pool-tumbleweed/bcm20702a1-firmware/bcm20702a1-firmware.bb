SUMMARY = "Firmware for BCM20702A1 based devices"
DESCRIPTION = "Firmware for broadcom BCM20702A1 based devices present in various sticks and \
laptops always over usb bridge."
LICENSE = "MIT"

PV = "1201650"

RPM_NAME = "bcm20702a1-firmware-1201650-9.13.noarch.rpm"
RPM_HASH = "f3bd51ea8d70f20b4b61c45b46a0b4f310fc5d40b46f2af844a08fbc858a6f68b1ca1c1da3e5fb5865ca33f0d6aa3b336728993f26f51a4758fac5be7f08ae58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcm20702a1-firmware"

RDEPENDS:${PN} += "/usr/bin/sh \
bluez \
coreutils \
unzip \
wget"

inherit rpm
