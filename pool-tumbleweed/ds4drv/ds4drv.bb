SUMMARY = "A Sony DualShock 4 userspace driver for Linux"
DESCRIPTION = "Sony DualShock 4 userspace driver for Linux with Bluetooth LED patch."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "ds4drv-0.5.1-1.2.noarch.rpm"
RPM_HASH = "bedc989808d9cc42b3cbc7839e06a93547a00a7847e8b486360bd4c791972b53109ae4840914717266dd37e6c8b5d940bcbb1fc1ccc85f76e3aacbf6f75a7075"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ds4drv \
ds4drv \
python3.13dist-ds4drv \
python3dist-ds4drv"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
bluez \
python-abi \
python3-dbus-python \
python3-evdev \
python3-pyudev"

inherit rpm
