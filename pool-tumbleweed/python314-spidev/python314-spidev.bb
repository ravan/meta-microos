SUMMARY = "Python module for interfacing with SPI devices"
DESCRIPTION = "This package contains the python module for interfacing with SPI devices from user space via the spidev linux kernel driver."
LICENSE = "MIT"

PV = "3.8"

RPM_NAME = "python314-spidev-3.8-1.7.aarch64.rpm"
RPM_HASH = "6852d0006c04f46177bcc25d52b7bbfbe1e8247d8809c23f58b20cd9d604fd47835ff30e0d682e4d8b5838540f107acb4b1aabeba5dbdec3dadbd94d7950f6ce"

RPROVIDES:${PN} += "python3.14dist-spidev \
python314-spidev \
python3dist-spidev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
