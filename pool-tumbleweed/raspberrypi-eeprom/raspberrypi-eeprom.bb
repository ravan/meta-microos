SUMMARY = "Raspberry Pi 4 and Pi 5 EEPROM firmware"
DESCRIPTION = "First stage bootloader packages for Raspberry Pi 4 and Pi 5"
LICENSE = "SUSE-Firmware"

PV = "2026.01.09"

RPM_NAME = "raspberrypi-eeprom-2026.01.09-1.2.noarch.rpm"
RPM_HASH = "5c1b167cd801747ba31c996508b90ef50815b3b42e012ce1c8914b8af4a5d9bd3a82307604f8bf21f5fe103e38d888dd1ae6aa783821af6f7a63d1cf5bf72041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-raspberrypi-eeprom \
raspberrypi-eeprom \
rpi-eeprom \
rpi-eeprom-config"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
pciutils \
raspberrypi-eeprom-firmware \
raspberrypi-firmware \
raspberrypi-firmware-dt"

inherit rpm
