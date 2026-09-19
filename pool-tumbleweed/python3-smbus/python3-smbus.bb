SUMMARY = "Python binding for Device Tree"
DESCRIPTION = "libi2c offers a way for applications to interact with the devices \
connected to the I2C or SMBus buses of the system. \
 \
Python binding part."
LICENSE = "GPL-2.0-or-later"

PV = "4.4"

RPM_NAME = "python3-smbus-4.4-3.5.aarch64.rpm"
RPM_HASH = "ac500b4d1e4590cdd5345b82f11f9e632685b4020d7e6230adc22a14f2f0961871916dc60f74ec398544a2bd6f270e7ed137964f8e25790b419aaee3a9be7c03"

RPROVIDES:${PN} += "python3-smbus \
python3.13dist-smbus \
python3dist-smbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libi2c.so.0 \
python-abi"

inherit rpm
